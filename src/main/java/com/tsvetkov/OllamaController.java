package com.tsvetkov;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/ollama")
public class OllamaController {

    @Inject
    OllamaService ollamaService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String question() {
        return ollamaService.answer("How are you?");
    }
}
