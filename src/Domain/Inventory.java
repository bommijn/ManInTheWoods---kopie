package Domain;

import java.util.ArrayList;

public  class Inventory {
    
   ArrayList<Item> items;

    public Inventory(){
        this.items = new ArrayList<>();
       
   
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    

}
