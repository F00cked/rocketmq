package com.service.cse.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-10-27T08:49:10.489Z")

@RestSchema(schemaId = "project9y6k")
@RequestMapping(path = "/cse", produces = MediaType.APPLICATION_JSON)
public class Project9y6kImpl {

    @Autowired
    private Project9y6kDelegate userProject9y6kDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject9y6kDelegate.helloworld(name);
    }

}
