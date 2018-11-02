package Domain;

public class Item_Batleaxe extends SuperItem {
    public Item_Batleaxe(){
        name = "Battle axe";
        itemDescription = "<html>Battle axe deals 8dmg max" +
                "<br> buys for 20gold and sell for 10gold. Cant equip while in combat.</html>";
        buyingPrice = 20;
        sellingPrice = buyingPrice / 2;
        dmgValue = 8;
        healingItem = false;
        combatItem = false;
        weapon = true;


    }

}
