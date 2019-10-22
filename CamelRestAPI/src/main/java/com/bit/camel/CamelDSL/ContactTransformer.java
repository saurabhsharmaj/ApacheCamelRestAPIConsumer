package com.bit.camel.CamelDSL;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bit.camel.CamelDSL.model.Response;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ContactTransformer {
	AtomicInteger count = new AtomicInteger();
    @Autowired
    ObjectMapper objectMapper;

    public Response transform(String jsonString) throws Exception {
    	count.getAndIncrement();
    	System.out.println(count.get() +" --> "+ jsonString);
        //List<Contact> accounts = objectMapper.readValue(jsonString, new TypeReference<List<Contact>>(){});
    	Response response = objectMapper.readValue(jsonString, Response.class);
        return response;
    }
}
