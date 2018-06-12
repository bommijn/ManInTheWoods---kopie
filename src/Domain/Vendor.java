/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.ArrayList;

/**
 *
 * @author Bram
 */
public class Vendor {
    
    private String name;
     ArrayList<SuperItem> vendorItems;
    
    public Vendor(String name){
    
       this.name = name;
    this.vendorItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<SuperItem> getVendorItems() {
        return vendorItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVendorItems(ArrayList<SuperItem> vendorItems) {
        this.vendorItems = vendorItems;
    }
    
    
    
    
}
