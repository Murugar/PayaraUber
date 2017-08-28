package com.iqmsoft.payara.gradle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class RestService {

    private final static String SIMPLE_JSON = "{ \"collection\" : \n" +
            "  {\n" +
            "    \"version\" : \"1.0\",\n" +
            "\n" +
            "    \"href\" : \"http://test.org/friends/\"\n" +
            "  } \n" +
            "}";

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String get(){
        return SIMPLE_JSON;
    }
}
