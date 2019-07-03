package com.bit.camel.CamelDSL;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;
@Component
public class CreateContactProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        System.out.println(exchange.getIn().getBody(String.class));
		/*
		 * Employee emp = new Employee(); emp.setName("camel-employee");
		 * emp.setDesignation("camel-manager"); emp.setEmpId(111); emp.setSalary(30000);
		 */
		exchange.getIn().setBody("Hi");
    }

}

