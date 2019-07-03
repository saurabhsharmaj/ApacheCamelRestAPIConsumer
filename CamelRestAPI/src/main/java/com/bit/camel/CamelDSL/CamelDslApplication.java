package com.bit.camel.CamelDSL;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.bit.camel.CamelDSL")
public class CamelDslApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelDslApplication.class, args);
	}
	
	@Bean
	  public ServletRegistrationBean camelServletRegistrationBean() {
	    ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet(), "/lakedata/*");
	    registration.setName("CamelServlet");
	    return registration;
	  }
}
