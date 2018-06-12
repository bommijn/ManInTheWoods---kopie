package Domain;

public class Item_LongSword extends SuperItem {

    public Item_LongSword(){
        name = "LongSword";
        itemDescription = "longsword deals 5dmg, cant be equipped in combat. Prices buy:6 sell:3 ";
        dmgValue = 5;
        sellingPrice = 3;
        buyingPrice = sellingPrice * 2;
        weapon = true;
        combatItem = false;
        healingItem = false;
    }
}
