package Domain;

public class Item_Knife extends SuperItem {

    public Item_Knife(){
        name = "Knife";
        itemDescription = "Knife deals 3dmg, cant be switched in combat, prices buy: 3 sell: 1";
        dmgValue = 3;
        sellingPrice = 1;
        buyingPrice = 3;
        weapon = true;
        healingItem = false;
        combatItem = false;

    }

}
