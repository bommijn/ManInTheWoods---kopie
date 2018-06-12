package Domain;

public class Item_Potion extends SuperItem {


   public Item_Potion(){
        name = "Potion";
        itemDescription = "Potion heals 5 and can be used in combat. selling price 3gold buying price 6gold.";
        healingValue = 5;
        sellingPrice = 3;
        buyingPrice = sellingPrice * 2;
        combatItem = true;
        healingItem = true;
        weapon = false;
    }


}
