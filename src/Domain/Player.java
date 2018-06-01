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
public class Player {
    
    
    private String playerName;
    private int playerHp;
    private Item weapon;
    public Player( int playerHp, Item weapon){

    setPlayerHp(playerHp);
    setWeapon(weapon);
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public final void setPlayerHp(int playerHp) {
        this.playerHp = playerHp;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
    
    
}
