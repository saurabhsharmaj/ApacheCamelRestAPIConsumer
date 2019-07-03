package com.bit.camel.CamelDSL;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ContactRouteBuilder extends RouteBuilder {

	JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Contact.class);

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
		.param().name("Token").type(RestParamType.query).defaultValue("test_token").endParam()
		.param().name("PageSize").type(RestParamType.query).defaultValue("10").endParam()
		.param().name("OffSet").type(RestParamType.query).defaultValue("0").endParam()
		.toD("direct:CONTACT");
		
		from("direct:CONTACT")
		.process(new Processor() {			
			@Override
			public void process(Exchange exchange) throws Exception {
				exchange.getIn().getHeaders().put("CamelHttpMethod", "GET");
				exchange.getIn().getHeaders().put("Exchange.CONTENT_TYPE", "application/json");
				exchange.getIn().getHeaders().put("Token", "test_token");
				Object pageSize = exchange.getIn().getHeader("PageSize");
				Object offSet=exchange.getIn().getHeader("OffSet");
				exchange.getIn().getHeaders().put("PageSize", Integer.parseInt(pageSize.toString()));
				exchange.getIn().getHeaders().put("OffSet", Integer.parseInt(offSet.toString()));
			}			
		})					 
		.to("http4://azuwevelbwf-da-p.azurewebsites.net/api/QWASIMembers?bridgeEndpoint=true")		
		.convertBodyTo(String.class)		
		.transform().method(contactTransformer)
		.process(new Processor() {

			@Override
			public void process(Exchange exchange) throws Exception {				
				System.out.println(exchange.getIn().getBody(String.class));
			}
		});

	}

}