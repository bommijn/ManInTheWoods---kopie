package Domain;

public class SuperItem {
    int healingValue, dmgValue, buyingPrice, sellingPrice;
    String name;
    String itemDescription;
    //combat item = item you can use while in combat.
    boolean combatItem, healingItem, weapon ;


    public String getItemDescription() {
        return itemDescription;
    }


    public void setItemDescription(String itemDescription){
        this.itemDescription = itemDescription;
    }


    public int getHealingValue() {
        return healingValue;
    }

    public void setHealingValue(int healingValue) {
        this.healingValue = healingValue;
    }

    public int getDmgValue() {
        return dmgValue;
    }

    public void setDmgValue(int dmgValue) {
        this.dmgValue = dmgValue;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCombatItem() {
        return combatItem;
    }

    public void setCombatItem(boolean combatItem) {
        this.combatItem = combatItem;
    }

    public boolean isHealingItem() {
        return healingItem;
    }

    public void setHealingItem(boolean healingItem) {
        this.healingItem = healingItem;
    }

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }
}
