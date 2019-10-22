package com.bit.camel.CamelDSL;

import java.util.Arrays;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bit.camel.CamelDSL.model.Contact;
import com.bit.camel.CamelDSL.model.Email;
import com.bit.camel.CamelDSL.model.Phone;
import com.bit.camel.CamelDSL.model.Properties;
import com.bit.camel.CamelDSL.model.Property;
import com.bit.camel.CamelDSL.model.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class ContactRouteBuilder extends RouteBuilder {

	JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Response.class);

	@Autowired
	private ContactTransformer contactTransformer;

	@Override
	public void configure() throws Exception {
		// route for REST POST Call
		restConfiguration()		
		.component("servlet")
		.bindingMode(RestBindingMode.json);

		rest().get("contact")
		.to("log:DEBUG?showBody=true&showHeaders=true")		
		.param().name("q").type(RestParamType.query).defaultValue("+32478615691").endParam()
		.param().name("hapikey").type(RestParamType.query).defaultValue("a3c64c3c-b3fe-4185-bfa9-af1435d55e69").endParam()
		.toD("direct:CONTACT");
		
		from("direct:CONTACT")
		.process(new Processor() {			
			@Override
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().getHeaders().put("CamelHttpMethod", "GET");
				exchange.getIn().getHeaders().put("Exchange.CONTENT_TYPE", "application/json");
				//exchange.getIn().getHeaders().put("OffSet", Long.parseInt(offSet.toString()));
				exchange.getIn().setHeader(Exchange.HTTP_QUERY,"q="+exchange.getIn().getHeader("q")+"&hapikey="+exchange.getIn().getHeader("hapikey"));

			}			
		})					 
		.to("http4://api.hubapi.com/contacts/v1/search/query?bridgeEndpoint=true")		
		.convertBodyTo(String.class)		
		.transform().method(contactTransformer)
		.process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				List<Contact> c = exchange.getIn().getBody(Response.class).getContacts();
				if(c.isEmpty()) {
					System.out.println("Not Found");

				} else {
					System.out.println(exchange.getIn().getBody(Response.class).getContacts().get(0).getVid());
				}
			}
		})
		.to("log:DEBUG?showBody=true&showHeaders=true")
		.process(new Processor() {			
			@Override
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().getHeaders().put("CamelHttpMethod", "POST");
				exchange.getIn().getHeaders().put("Exchange.CONTENT_TYPE", "application/json");
				exchange.getIn().setBody(getTemporaryBody(exchange.getIn().getHeader("q").toString()));
				exchange.getIn().setHeader(Exchange.HTTP_QUERY,"hapikey="+exchange.getIn().getHeader("hapikey"));
			}			
		})		
		.to("http4://api.hubapi.com/contacts/v1/contact/?bridgeEndpoint=true")	
		.convertBodyTo(String.class)		
		.transform().method(contactTransformer)
		.process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {
				List<Contact> c = exchange.getIn().getBody(Response.class).getContacts();
				if(c!= null && c.isEmpty()==false)
				System.out.println("VID: ## "+c.get(0).getVid());
			}
		});

	}
	
	public String getTemporaryBody(String ph) throws JsonProcessingException {
		Properties p = new Properties();
		Property p1 = new Property();
		p1.setProperty("email");
		p1.setValue(ph+"@hubstop.com");
		
		Property p2 = new Property();
		p2.setProperty("phone");
		p2.setValue(ph);
		
		p.setProperties(Arrays.asList(new Property[] {p1,p2}));
		String jsonBody = new ObjectMapper().writeValueAsString(p);
		System.out.println(jsonBody);
		return jsonBody;
	}

}