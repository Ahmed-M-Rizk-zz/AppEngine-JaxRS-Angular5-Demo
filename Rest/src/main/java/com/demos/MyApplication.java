/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demos;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class MyApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> returnValue = new HashSet<>();
        returnValue.add(SecretsService.class);
        returnValue.add(JacksonJsonProvider.class);
        return returnValue;
    }
}
