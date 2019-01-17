/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Senthuran
 */
import com.sun.jersey.api.core.PackagesResourceConfig;
import javax.ws.rs.ApplicationPath;
@ApplicationPath("/")
public class RestJsonApplication  {
     public RestJsonApplication() {
        super("com.mycompany.mavenproject2.v1.resources.impl");
    
    }
}
