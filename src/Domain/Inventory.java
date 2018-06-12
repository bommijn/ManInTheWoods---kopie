package Domain;

import java.util.ArrayList;

public  class Inventory  {
    
   ArrayList<SuperItem> items ;




    public void addToInventory(SuperItem o){
    if (items.size() < 8){
        items.add(o); }

    }



    public Inventory(){
        this.items = new ArrayList<>();
       
   
    }


    public int getLenght(){
        return items.size();
    }


    public ArrayList<SuperItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<SuperItem> items) {
        this.items = items;
    }

    

}
