package org.acme.getting.started.controller;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.getting.started.config.ContainerConfig;
import org.acme.getting.started.exception.BadRequestException;
import org.acme.getting.started.model.Delivery;
import org.acme.getting.started.model.Result;

@Path("/hello")
public class GreetingController {
	
	@Inject
	ContainerConfig config;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Delivery hello() {
        Delivery delivery = new Delivery();
    	delivery.setId("1");
    	delivery.setExecution("1");
    	delivery.setResults(new ArrayList<Result>());
    	return delivery;
    }
    
    @POST
    @Path("/upload")
    @Produces(MediaType.TEXT_PLAIN)
    public String upload() {
    	return "upload";
    }
    
    @POST
    @Path("/error")
    @Produces(MediaType.TEXT_PLAIN)
    public String error() throws BadRequestException {
    	throw new BadRequestException();
    }
}