package com.bit.camel.CamelDSL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ContactTransformer {

    @Autowired
    ObjectMapper objectMapper;

    public List<Contact> transform(String jsonString) throws Exception {
        List<Contact> accounts = objectMapper.readValue(jsonString, new TypeReference<List<Contact>>(){});
        return accounts;
    }
}
