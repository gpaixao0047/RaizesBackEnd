package com.raizes.app.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/v1")
public class EnviandoTopico {
    @POST
    public void enviarTopico() {
        System.out.println("ola");
    }

}
