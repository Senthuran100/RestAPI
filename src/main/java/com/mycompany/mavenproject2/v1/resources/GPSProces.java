/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.v1.resources;

import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Senthuran
 */
@XmlRootElement
public class GPSProces {
    private int vehicleid;
    private String vehiclename;
    private String GPSdescription;
    
    public GPSProces(int id, String name, String gpsdescription) {
        this.vehicleid = id;
        this.vehiclename  = name;
        this.GPSdescription = gpsdescription;
    }
  
 
    public String getGPSDescription() {
        return GPSdescription;
    }
 
    public void setDescription(String description) {
        this.GPSdescription = description;
    }
 
    public int getId() {
        return vehicleid;
    }
 
    public void setId(int id) {
        this.vehicleid = id;
    }
 
    public String getName() {
        return vehiclename;
    }
 
    public void setName(String name) {
        this.vehiclename = name;
    }
}


/**
 *
 * @author Senthuran
 */
