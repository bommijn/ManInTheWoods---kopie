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
public class Monster {
    
    private String name;
    private int monsterHP;
    private int monsterDmg;
    
    
    
    public Monster(String name, int monsterHP,int monsterDmg){
    
    this.name = name;
    this.monsterHP = monsterHP;
    this.monsterDmg = monsterDmg;
    
    
    }

    public void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public int getMonsterHP() {
        return monsterHP;
    }

    public String getName() {
        return name;
    }

    public int getMonsterDmg() {
        return monsterDmg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMonsterDmg(int monsterDmg) {
        this.monsterDmg = monsterDmg;
    }
    
    
    
}
