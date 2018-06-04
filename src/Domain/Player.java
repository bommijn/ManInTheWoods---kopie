/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


import ManInTheWoods.Ui;

/**
 *
 * @author Bram
 */
public  class  Player {

    
    private  String playerName, position;
    private int playerHp;




    private int coins;
    private Item weapon;



    public  Player(int playerHp, Item weapon, int coins, String position){

        this.position = position;
        this.coins = coins;
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
        Position pos = new Position();

        switch (position){
            case "crossroad": pos.crossRoad(); break;
            case "towngate": pos.townGate(); break;


        }

    }

   public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }
    
    
}
