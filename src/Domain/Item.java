package Domain;

public class Item {

    private String name;
    private int healingValue;
    private int dmgValue;
    private int price;
    public Item(String name, int healingValue, int dmgValue, int price){

        this.name = name;
        this.healingValue = healingValue;
        this.dmgValue = dmgValue;
        this.price = price;
    }

    public int getHealingValue() {
        return healingValue;
    }

    public String getName() {
        return name;
    }
    public int getDmgValue(){
    
    return dmgValue;
    }
    public int getPrice(){
    
    return price;
    }
}
