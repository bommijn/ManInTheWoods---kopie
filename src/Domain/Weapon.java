/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Bram
 */
public class Weapon {
    private String name;
    private int dmgIndex;
    
    
    
    public Weapon(String name, int dmgIndex){
    setName(name);
    setDmgIndex(dmgIndex);
    
    
    
    
    
    
    }

    public String getName() {
        return name;
    }

    public int getDmgIndex() {
        return dmgIndex;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final void setDmgIndex(int dmgIndex) {
        this.dmgIndex = dmgIndex;
    }
    
}
