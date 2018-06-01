package Domain;

public class Item {

    private String name;
    private int healingValue;
private int dmgValue;
    public Item(String name, int healingValue, int dmgValue){

        this.name = name;
        this.healingValue = healingValue;
        this.dmgValue = dmgValue;
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
}
