package Domain;

public class Item {

    private String name;
    private int healingValue;

    public Item(String name, int healingValue){

        this.name = name;
        this.healingValue = healingValue;

    }

    public int getHealingValue() {
        return healingValue;
    }

    public String getName() {
        return name;
    }
}
