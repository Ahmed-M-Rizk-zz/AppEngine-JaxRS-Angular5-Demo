/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demos;

import com.demos.models.Secret;
import java.util.HashMap;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author GS
 */
@Path("secrets")
public class SecretsService {

    private static HashMap<String, Secret> secrets;

    static {
        secrets = new HashMap<>();
        secrets.put("mouaz", new Secret("Mouaz", "notification.push()"));
        secrets.put("rana", new Secret("Rana", "your bad dreams (they will make us do unit test in the pilot)"));
        secrets.put("gamal", new Secret("Gamal", "You should chack your MI logs"));
        secrets.put("amira", new Secret("Amira", "Yarab tezakry"));
    }

    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Secret getSeret(@PathParam("name")String name) {
        if (secrets.containsKey(name.toLowerCase())) {
            return secrets.get(name.toLowerCase());
        }
        return new Secret();
    }
}
