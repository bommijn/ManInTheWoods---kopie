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
    private Weapon weapon;
    public Player( int playerHp, Weapon weapon){

    setPlayerHp(playerHp);
    
    }

    public Weapon getWeapon() {
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

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    
}
