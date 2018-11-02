/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


public class Player {
    
    
    private String playerName, position;
    private int playerHp;




    private int coins;
    private SuperItem weapon;



    public Player(int playerHp, SuperItem weapon, int coins, String position){

        this.position = position;
        this.coins = coins;
        setPlayerHp(playerHp);
        setWeapon(weapon);
    }

    public SuperItem getWeapon() {
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

    public int getCoins() {
        return coins;
    }

    public String getPosition() {
        return position;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setPosition(String position) {
        this.position = position;
    }

   public void setWeapon(SuperItem weapon) {
        this.weapon = weapon;
    }
    
    
}
