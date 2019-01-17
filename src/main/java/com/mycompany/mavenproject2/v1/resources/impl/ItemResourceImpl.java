/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2.v1.resources.impl;

/**
 *
 * @author Senthuran
 */
import com.mycompany.mavenproject2.v1.resources.GPSProces;
import com.mycompany.mavenproject2.v1.resources.ItemResource;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Path;
 
// Set the path, version 1 of API
@Path("/v1/item")
public class ItemResourceImpl implements ItemResource{
 
    @Override
    public List<GPSProces> getItems() {
        List<GPSProces> items = new ArrayList<GPSProces>();
        items.add(new GPSProces(100, "Suzuki", "LAT:89 LON:96"));
        items.add(new GPSProces(200, "Vitz", "LAT:79 LON:26"));
        items.add(new GPSProces(300, "Wagon", "LAT:35 LON:38"));
 
        return items;
    }
}