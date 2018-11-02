/*package ManInTheWoods;

import Domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class Ui {


    private  int playerHP, silverRing;
    private  int monsterHP;
    private  boolean inCombat = false;
    private  boolean canDrink = true;
    private  String weapon;
    private String position;



    private String nextPosition1;
    private String nextPosition2;
    private String nextPosition3;
    private String nextPosition4;

    private final Item_LongSword longSword = new Item_LongSword();


    private final Item_Batleaxe battleAxe = new Item_Batleaxe();
    private final Item_Bread loafOfBread = new Item_Bread();
    private final Item_Potion potion = new Item_Potion();
    private final Inventory inventory = new Inventory();
    private final Vendor horvath = new Vendor("Horvath");
    private final Monster goblin = new Monster("Goblin", 10, 4);
    private final Item_Knife knife = new Item_Knife();

    CoinGenerator cg = new CoinGenerator();
    Player player = new Player(playerHP, knife, 0, position);
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    InventoryHandler invHandler = new InventoryHandler();
    VendorHandler vendorHandler = new VendorHandler();

    public Ui() {

        monsterHP = goblin.getMonsterHP();



    }






    public void createGameScreen() {





        playerSetup();



    }

    public void setNextPosition1(String nextPosition1) {
        this.nextPosition1 = nextPosition1;
    }

    public void setNextPosition2(String nextPosition2) {
        this.nextPosition2 = nextPosition2;
    }

    public void setNextPosition3(String nextPosition3) {
        this.nextPosition3 = nextPosition3;
    }

    public void setNextPosition4(String nextPosition4) {
        this.nextPosition4 = nextPosition4;
    }

    public String getNextPosition1() {
        return nextPosition1;
    }

    public String getNextPosition2() {
        return nextPosition2;
    }

    public String getNextPosition3() {
        return nextPosition3;
    }

    public String getNextPosition4() {
        return nextPosition4;
    }



    public void changeTextChoice1(String text){
        choice1.setText(text);

    }

    public void changeVisibleChoice1(boolean isVisble){

        choice1.setVisible(isVisble);
    }
    public void changeTextChoice2(String text){
        choice2.setText(text);

    }
    public void changeTextChoice3(String text){
        choice3.setText(text);

    }
    public void changeTextChoice4(String text){
        choice4.setText(text);

    }

    public void changeMainTextArea(String text){
        mainTextArea.setText(text);
    }

    public void setPosition(String position){
        this.position = position;

    }

    public void setInv1(JButton inv1) {
        this.inv1 = inv1;
    }

    public void setInv2(JButton inv2) {
        this.inv2 = inv2;
    }

    public void setInv3(JButton inv3) {
        this.inv3 = inv3;
    }

    public void setInv4(JButton inv4) {
        this.inv4 = inv4;
    }

    public void setInv5(JButton inv5) {
        this.inv5 = inv5;
    }

    public void setInv6(JButton inv6) {
        this.inv6 = inv6;
    }

    public void setInv7(JButton inv7) {
        this.inv7 = inv7;
    }

    public void setInv8(JButton inv8) {
        this.inv8 = inv8;
    }

    public void setVendor1(JButton vendor1) {
        this.vendor1 = vendor1;
    }

    public void setVendor2(JButton vendor2) {
        this.vendor2 = vendor2;
    }

    public void setVendor3(JButton vendor3) {
        this.vendor3 = vendor3;
    }

    public void setVendor4(JButton vendor4) {
        this.vendor4 = vendor4;
    }

    public void setVendor5(JButton vendor5) {
        this.vendor5 = vendor5;
    }

    public void setVendor6(JButton vendor6) {
        this.vendor6 = vendor6;
    }

    public void setVendor7(JButton vendor7) {
        this.vendor7 = vendor7;
    }

    public void setVendor8(JButton vendor8) {
        this.vendor8 = vendor8;
    }

    public void setVendor9(JButton vendor9) {
        this.vendor9 = vendor9;
    }

    public void setVendor10(JButton vendor10) {
        this.vendor10 = vendor10;
    }

    public void setVendor11(JButton vendor11) {
        this.vendor11 = vendor11;
    }

    public void setVendor12(JButton vendor12) {
        this.vendor12 = vendor12;
    }

    public void setVendor13(JButton vendor13) {
        this.vendor13 = vendor13;
    }

    public void setVendor14(JButton vendor14) {
        this.vendor14 = vendor14;
    }

    public void setVendor15(JButton vendor15) {
        this.vendor15 = vendor15;
    }

    public void setVendor16(JButton vendor16) {
        this.vendor16 = vendor16;
    }

    public void setVendor17(JButton vendor17) {
        this.vendor17 = vendor17;
    }

    public void setVendor18(JButton vendor18) {
        this.vendor18 = vendor18;
    }

    public void setVendor19(JButton vendor19) {
        this.vendor19 = vendor19;
    }

    public void setVendor20(JButton vendor20) {
        this.vendor20 = vendor20;
    }

    public void setVendor21(JButton vendor21) {
        this.vendor21 = vendor21;
    }

    public void setVendor22(JButton vendor22) {
        this.vendor22 = vendor22;
    }

    public void setVendor23(JButton vendor23) {
        this.vendor23 = vendor23;
    }

    public void setVendor24(JButton vendor24) {
        this.vendor24 = vendor24;
    }

    public void setMainTextArea(JTextArea mainTextArea) {
        this.mainTextArea = mainTextArea;
    }

    public void setPlayerHP(int playerHP) {
        this.playerHP = playerHP;
    }

    public void setMonsterHP(int monsterHP) {
        this.monsterHP = monsterHP;
    }

    public void setInCombat(boolean inCombat) {
        this.inCombat = inCombat;
    }

    public void setCanDrink(boolean canDrink) {
        this.canDrink = canDrink;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void initInventory() {

        int invStock = inventory.getLenght();

        switch (invStock) {
            case 1:
                inv1.setText(inventory.getItems().get(0).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                break;

            case 2:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                break;

            case 3:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                break;

            case 4:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv4.setText(inventory.getItems().get(3).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
                break;

            case 5:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv4.setText(inventory.getItems().get(3).getName());
                inv5.setText(inventory.getItems().get(4).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
                inv5.setToolTipText(inventory.getItems().get(4).getItemDescription());
                break;

            case 6:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv4.setText(inventory.getItems().get(3).getName());
                inv5.setText(inventory.getItems().get(4).getName());
                inv6.setText(inventory.getItems().get(5).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
                inv5.setToolTipText(inventory.getItems().get(4).getItemDescription());
                inv6.setToolTipText(inventory.getItems().get(5).getItemDescription());
                break;
            case 7:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv4.setText(inventory.getItems().get(3).getName());
                inv5.setText(inventory.getItems().get(4).getName());
                inv6.setText(inventory.getItems().get(5).getName());
                inv7.setText(inventory.getItems().get(6).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
                inv5.setToolTipText(inventory.getItems().get(4).getItemDescription());
                inv6.setToolTipText(inventory.getItems().get(5).getItemDescription());
                inv7.setToolTipText(inventory.getItems().get(6).getItemDescription());
                break;

            case 8:
                inv1.setText(inventory.getItems().get(0).getName());
                inv2.setText(inventory.getItems().get(1).getName());
                inv3.setText(inventory.getItems().get(2).getName());
                inv4.setText(inventory.getItems().get(3).getName());
                inv5.setText(inventory.getItems().get(4).getName());
                inv6.setText(inventory.getItems().get(5).getName());
                inv7.setText(inventory.getItems().get(6).getName());
                inv8.setText(inventory.getItems().get(7).getName());
                inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
                inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
                inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
                inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
                inv5.setToolTipText(inventory.getItems().get(4).getItemDescription());
                inv6.setToolTipText(inventory.getItems().get(5).getItemDescription());
                inv7.setToolTipText(inventory.getItems().get(6).getItemDescription());
                inv8.setToolTipText(inventory.getItems().get(7).getItemDescription());
                break;

        }

//        inv1.setText(inventory.getItems().get(0).getName());
//        inv2.setText(inventory.getItems().get(1).getName());
//        inv3.setText(inventory.getItems().get(2).getName());
//        inv4.setText(inventory.getItems().get(3).getName());
//        inv5.setText(inventory.getItems().get(4).getName());
//        inv6.setText(inventory.getItems().get(5).getName());
//        inv7.setText(inventory.getItems().get(6).getName());
//        inv8.setText(inventory.getItems().get(7).getName());
//        inv1.setToolTipText(inventory.getItems().get(0).getItemDescription());
//        inv2.setToolTipText(inventory.getItems().get(1).getItemDescription());
//        inv3.setToolTipText(inventory.getItems().get(2).getItemDescription());
//        inv4.setToolTipText(inventory.getItems().get(3).getItemDescription());
//        inv5.setToolTipText(inventory.getItems().get(4).getItemDescription());
//        inv6.setToolTipText(inventory.getItems().get(5).getItemDescription());
//        inv7.setToolTipText(inventory.getItems().get(6).getItemDescription());
//        inv8.setToolTipText(inventory.getItems().get(7).getItemDescription());
    }


    public void initVendor() {

        int itemsInStock = horvath.getVendorItems().size();

        switch (itemsInStock){

            case 0:
                vendor1.setText("");
                break;

            case 1:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(" ");
                break;

            case 2:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(" ");
                break;

            case 3:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(" ");
                break;

            case 4:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(" ");
                break;

            case 5:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(" ");
                break;


            case 6:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(" ");
                break;

            case 7:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(" ");
                break;

            case 8:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(" ");
                break;

            case 9:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(" ");
                break;

            case 10:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(" ");
                break;

            case 11:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(" ");
                break;

            case 12:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(" ");
                break;

            case 13:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(" ");
                break;

            case 14:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(" ");
                break;

            case 15:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(" ");
                break;

            case 16:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(" ");
                break;

            case 17:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(" ");
                break;

            case 18:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(" ");
                break;

            case 19:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(" ");
                break;

            case 20:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(horvath.getVendorItems().get(19).getName() + " Price " + horvath.getVendorItems().get(19).getBuyingPrice()+ " Coins");
                vendor21.setText(" ");
                break;

            case 21:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(horvath.getVendorItems().get(19).getName() + " Price " + horvath.getVendorItems().get(19).getBuyingPrice()+ " Coins");
                vendor21.setText(horvath.getVendorItems().get(20).getName() + " Price " + horvath.getVendorItems().get(20).getBuyingPrice()+ " Coins");
                vendor22.setText(" ");
                break;

            case 22:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(horvath.getVendorItems().get(19).getName() + " Price " + horvath.getVendorItems().get(19).getBuyingPrice()+ " Coins");
                vendor21.setText(horvath.getVendorItems().get(20).getName() + " Price " + horvath.getVendorItems().get(20).getBuyingPrice()+ " Coins");
                vendor22.setText(horvath.getVendorItems().get(21).getName() + " Price " + horvath.getVendorItems().get(21).getBuyingPrice()+ " Coins");
                vendor23.setText(" ");
                break;

            case 23:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(horvath.getVendorItems().get(19).getName() + " Price " + horvath.getVendorItems().get(19).getBuyingPrice()+ " Coins");
                vendor21.setText(horvath.getVendorItems().get(20).getName() + " Price " + horvath.getVendorItems().get(20).getBuyingPrice()+ " Coins");
                vendor22.setText(horvath.getVendorItems().get(21).getName() + " Price " + horvath.getVendorItems().get(21).getBuyingPrice()+ " Coins");
                vendor23.setText(horvath.getVendorItems().get(22).getName() + " Price " + horvath.getVendorItems().get(22).getBuyingPrice()+ " Coins");
                vendor24.setText(" ");
                break;

            case 24:
                vendor1.setText(horvath.getVendorItems().get(0).getName() + " Price " + horvath.getVendorItems().get(0).getBuyingPrice()+ " Coins");
                vendor2.setText(horvath.getVendorItems().get(1).getName() + " Price " + horvath.getVendorItems().get(1).getBuyingPrice()+ " Coins");
                vendor3.setText(horvath.getVendorItems().get(2).getName() + " Price " + horvath.getVendorItems().get(2).getBuyingPrice()+ " Coins");
                vendor4.setText(horvath.getVendorItems().get(3).getName() + " Price " + horvath.getVendorItems().get(3).getBuyingPrice()+ " Coins");
                vendor5.setText(horvath.getVendorItems().get(4).getName() + " Price " + horvath.getVendorItems().get(4).getBuyingPrice()+ " Coins");
                vendor6.setText(horvath.getVendorItems().get(5).getName() + " Price " + horvath.getVendorItems().get(5).getBuyingPrice()+ " Coins");
                vendor7.setText(horvath.getVendorItems().get(6).getName() + " Price " + horvath.getVendorItems().get(6).getBuyingPrice()+ " Coins");
                vendor8.setText(horvath.getVendorItems().get(7).getName() + " Price " + horvath.getVendorItems().get(7).getBuyingPrice()+ " Coins");
                vendor9.setText(horvath.getVendorItems().get(8).getName() + " Price " + horvath.getVendorItems().get(8).getBuyingPrice()+ " Coins");
                vendor10.setText(horvath.getVendorItems().get(9).getName() + " Price " + horvath.getVendorItems().get(9).getBuyingPrice()+ " Coins");
                vendor11.setText(horvath.getVendorItems().get(10).getName() + " Price " + horvath.getVendorItems().get(10).getBuyingPrice()+ " Coins");
                vendor12.setText(horvath.getVendorItems().get(11).getName() + " Price " + horvath.getVendorItems().get(11).getBuyingPrice()+ " Coins");
                vendor13.setText(horvath.getVendorItems().get(12).getName() + " Price " + horvath.getVendorItems().get(12).getBuyingPrice()+ " Coins");
                vendor14.setText(horvath.getVendorItems().get(13).getName() + " Price " + horvath.getVendorItems().get(13).getBuyingPrice()+ " Coins");
                vendor15.setText(horvath.getVendorItems().get(14).getName() + " Price " + horvath.getVendorItems().get(14).getBuyingPrice()+ " Coins");
                vendor16.setText(horvath.getVendorItems().get(15).getName() + " Price " + horvath.getVendorItems().get(15).getBuyingPrice()+ " Coins");
                vendor17.setText(horvath.getVendorItems().get(16).getName() + " Price " + horvath.getVendorItems().get(16).getBuyingPrice()+ " Coins");
                vendor18.setText(horvath.getVendorItems().get(17).getName() + " Price " + horvath.getVendorItems().get(17).getBuyingPrice()+ " Coins");
                vendor19.setText(horvath.getVendorItems().get(18).getName() + " Price " + horvath.getVendorItems().get(18).getBuyingPrice()+ " Coins");
                vendor20.setText(horvath.getVendorItems().get(19).getName() + " Price " + horvath.getVendorItems().get(19).getBuyingPrice()+ " Coins");
                vendor21.setText(horvath.getVendorItems().get(20).getName() + " Price " + horvath.getVendorItems().get(20).getBuyingPrice()+ " Coins");
                vendor22.setText(horvath.getVendorItems().get(21).getName() + " Price " + horvath.getVendorItems().get(21).getBuyingPrice()+ " Coins");
                vendor23.setText(horvath.getVendorItems().get(22).getName() + " Price " + horvath.getVendorItems().get(22).getBuyingPrice()+ " Coins");
                vendor24.setText(horvath.getVendorItems().get(23).getName() + " Price " + horvath.getVendorItems().get(23).getBuyingPrice()+ " Coins");
                break;

             default:
                 break;

        }



    }

    public void itemUsed(int inventoryspot) {

        // String removeString = String.format("inv%d", inventoryspot);


        if (inCombat && inventory.getItems().get(inventoryspot).isCombatItem()) {

            if (inventory.getItems().get(inventoryspot).isHealingItem()) {

                playerHP = playerHP + inventory.getItems().get(inventoryspot).getHealingValue();
                hpLabelNumber.setText("" + playerHP);
                inventory.getItems().remove(inventoryspot);
                switch (inventoryspot) {
                    case 0:
                        inv1.setText("");
                    case 1:
                        inv2.setText("");
                    case 2:
                        inv3.setText("");
                    case 3:
                        inv4.setText("");
                    case 4:
                        inv5.setText("");
                    case 5:
                        inv6.setText("");
                    case 6:
                        inv7.setText("");
                    case 7:
                        inv8.setText("");

                }

            } else if (inventory.getItems().get(inventoryspot).isWeapon()) {

                inventory.getItems().add(player.getWeapon());
                player.setWeapon(inventory.getItems().get(inventoryspot));
                weapon = inventory.getItems().get(inventoryspot).getName();
                weaponLabelName.setText(player.getWeapon().getName());
                inventory.getItems().remove(inventoryspot);

                switch (inventoryspot) {
                    case 0:
                        inv1.setText("");
                    case 1:
                        inv2.setText("");
                    case 2:
                        inv3.setText("");
                    case 3:
                        inv4.setText("");
                    case 4:
                        inv5.setText("");
                    case 5:
                        inv6.setText("");
                    case 6:
                        inv7.setText("");
                    case 7:
                        inv8.setText("");

                }

            }
        } else if (!inCombat){
            if (inventory.getItems().get(inventoryspot).isHealingItem()) {

                playerHP = playerHP + inventory.getItems().get(inventoryspot).getHealingValue();
                hpLabelNumber.setText("" + playerHP);
                inventory.getItems().remove(inventoryspot);
                switch (inventoryspot) {
                    case 0:
                        inv1.setText("");
                    case 1:
                        inv2.setText("");
                    case 2:
                        inv3.setText("");
                    case 3:
                        inv4.setText("");
                    case 4:
                        inv5.setText("");
                    case 5:
                        inv6.setText("");
                    case 6:
                        inv7.setText("");
                    case 7:
                        inv8.setText("");

                }

            } else if (inventory.getItems().get(inventoryspot).isWeapon()) {

                inventory.getItems().add(player.getWeapon());
                player.setWeapon(inventory.getItems().get(inventoryspot));
                weapon = inventory.getItems().get(inventoryspot).getName();
                weaponLabelName.setText(player.getWeapon().getName());
                inventory.getItems().remove(inventoryspot);

                switch (inventoryspot) {
                    case 0:
                        inv1.setText("");
                    case 1:
                        inv2.setText("");
                    case 2:
                        inv3.setText("");
                    case 3:
                        inv4.setText("");
                    case 4:
                        inv5.setText("");
                    case 5:
                        inv6.setText("");
                    case 6:
                        inv7.setText("");
                    case 7:
                        inv8.setText("");

                }

            }

        }
       else {
            mainTextArea.setText("Cant use none combat item while in combat.");
        }

        initInventory();
    }

    public void playerSetup() {

        playerHP = 15;
        player.setPosition("townGate");
        player.setWeapon(knife);

        weapon = knife.getName();
        silverRing = 0;
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
        choice1.setVisible(true);
        choice1.setBorderPainted(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);

        inventory.getItems().add(potion);
        inventory.getItems().add(battleAxe);
        inv1.setText(inventory.getItems().get(0).getName());

        inCombat = false;
        initInventory();
        townGate();
    }

    public void resizeImage(ImageIcon townsgate) {

    }

    public void vendorUI() {
        picturePanel.setVisible(false);
        vendorPanel.setVisible(true);


    }

    public void townGate() {
        mainTextArea.setText("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");
        position = "townGate";

        ImageIcon townsgateImg = new ImageIcon(getClass().getClassLoader().getResource("Images/townsgate.png"));

        picturePanel.add(new JLabel(townsgateImg));
//ImageIcon townsgate = new ImageIcon("Images/townsgate.png");
//picturePanel.set
        choice1.setText("Talk to the guard");
        choice2.setText("Attack the guard.");
        choice3.setText("leave");
        choice4.setText("");
    }

    public void talkGuard() {
        mainTextArea.setText("Hello stranger, i have never seen you before. \n"
                + "I'm sorry but we cant allow strangers in our town. ");
        position = "talkGuard";

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void attackGuard() {
        position = "attackGuard";
        mainTextArea.setText("Guard: hey dont be stupid \n "
                + "The guard hits you and you lose 3hp.");
        playerHP = playerHP - 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void crossRoad() {
        position = "crossRoad";
        player.setCoins(5000);
        inCombat = false;
        mainTextArea.setText("You are at a crossroad. \nIf you go south, you will go back to the town.");
        choice1.setText("Go north");
        choice2.setText("Go east");
        choice3.setText("Go south");
        choice4.setText("Go west");

    }

    public void northEmpty() {
        position = "northempty";
        mainTextArea.setText("The river has dried up,\nNothing to do here");
        choice1.setText("Go south");
        choice2.setText("Go north");
        choice3.setText("");
        choice4.setText("");
    }

    public void witch() {
        position = "witch";
        mainTextArea.setText("Hello traveler, \nAre you interested in one of my potions? ");
        choice1.setText("Go back");
        choice2.setText("Yes");
        choice3.setText("");
        choice4.setText("");
    }



    public void getItem() {
//       position = "getitem";
//        int invNumber = 0;
//        while (inventory.getItems().get(invNumber) != null && invNumber < 7){
//            invNumber++;
//        }
//        if (inventory.getItems().get(invNumber) == null) 
        {
            mainTextArea.setText("Woman: Use this special brew when you are low on Hp,\nIt will restore a bit.");
            if (inventory.getItems().size() < 8) {
                inventory.getItems().add(potion);
            } else {
                mainTextArea.setText("You cant carry anymore potion");
            }
//            if (invNumber == 0) {
//                inv1.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 1) {
//                inv2.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 2) {
//                inv3.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 3) {
//                inv4.setText(inventorySlot[invNumber].getName());

//            } else if (invNumber == 4) {
//                inv5.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 5) {
//                inv6.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 6) {
//                inv7.setText(inventorySlot[invNumber].getName());
//            } else if (invNumber == 7) {
//                inv8.setText(inventorySlot[invNumber].getName());
//            }
//        }
//        else if (inventorySlot[invNumber] != null){
//            mainTextArea.setText("Woman: You cant hold anymore of my potions.");
//        }

            initInventory();

            choice1.setText(">");
            choice2.setText("Go south");
            choice3.setText("");
            choice4.setText("");
        }
    }

    public void north() {
        position = "north";
        canDrink = false;
        mainTextArea.setText("There is a river. \nyou drink the watter and rest at the riverside. \n(Your hp has recovered by 2)");
        playerHP = playerHP + 2;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText("Go South");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void west() {

        position = "west";
        mainTextArea.setText("You have encountered a goblin");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");

    }

    public void east() {
        position = "east";

        mainTextArea.setText("You walk into a forest and found a Long Sword \n\n(You obtained a Long Sword!)");
        picturePanel.removeAll();
        ImageIcon longswordImg = new ImageIcon(getClass().getClassLoader().getResource("Images/Longsword.jpg"));

        picturePanel.add(new JLabel(longswordImg));
//        player.setWeapon(longsword);
////        weapon = "Long Sword";
//        weaponLabelName.setText(player.getWeapon().getName());
        inventory.getItems().add(longSword);

        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        initInventory();
    }

    public void fightGoblin() {

        position = "fightgoblin";
        inCombat = true;
        mainTextArea.setText("Monster hp:" + monsterHP + "\n\nWhat do you do?");
        choice1.setText("Fight");
        choice2.setText("Run away");
        choice3.setText("");
        choice4.setText("");
    }

    public void playerAttack() {

        position = "playerattack";
        Random random = new Random();
        int playerDamage = 0;

        playerDamage = random.nextInt(player.getWeapon().getDmgValue());

        monsterHP = monsterHP - playerDamage;
        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!\n\nHp left:" + monsterHP);
        inCombat = true;
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void monsterAttack() {

        position = "monsterattack";
        Random random = new Random();
        int monsterDamage = 0;
        monsterDamage = random.nextInt(goblin.getMonsterDmg());

        mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText("" + playerHP);
        inCombat = true;
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void win() {
        int lastcount, coinsgotten;

        position = "win";
        inCombat = false;
        lastcount = player.getCoins();
        player.setCoins(player.getCoins() + cg.GenerateCoin("goblin"));
        coinsgotten = player.getCoins() - lastcount;
        silverRing = 1;
        mainTextArea.setText(String.format("The %s has been defeated! \nThe monster dropped a ring.\nCoins received :" + coinsgotten + "\n(You obtained a silver ring.) ", goblin.getName()));
        coinsnNumber.setText("" + player.getCoins());

        choice1.setText("Go east");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public void lose() {
        position = "lose";

        mainTextArea.setText("You are dead, \nGame Over! ");
        choice1.setText("Start over");
        choice2.setText("Quit game");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(true);
        choice1.setBorderPainted(false);
        choice2.setVisible(true);
        choice2.setBorderPainted(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
    }

    public void startOver() {
        playerSetup();

    }

    public void quitGame() {

        window.dispose();
    }

    public void vendorHorvath() {
        position = "horvath";
        mainTextArea.setText("Goodday adventurer, please have a look at my wares");
        vendorUI();
        horvath.getVendorItems().add(battleAxe);
        horvath.getVendorItems().add(loafOfBread);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        horvath.getVendorItems().add(potion);
        choice1.setVisible(true);
        choice1.setBorderPainted(false);
        choice2.setVisible(true);
        choice2.setBorderPainted(false);

        initVendor();

    }

    public void town2() {
        position = "town2";

        mainTextArea.setText("Guard: Oh you have killed the Goblin!? \nYou are a true hero, Welcome to our town.\n\n Feel free to see one of our vendors");

        choice1.setText("Horvath");
        choice1.setVisible(true);
        choice1.setBorderPainted(false);
        choice2.setVisible(false);
        choice2.setBorderPainted(false);
        choice3.setVisible(false);
        choice4.setVisible(false);
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }

    public class TitleScreenHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            createGameScreen();

        }
    }

    public class ChoiceHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
SuperPosition sp = new SuperPosition();
            String yourChoice = event.getActionCommand();
nextPosition1 = sp.getNextPosition1();

            switch (yourChoice){
                case "c1":
                    System.out.println(getNextPosition1());
                    sp.doChoice1(); break;
            }



//            switch (position) {
//
//                case "townGate":
//                    switch (yourChoice) {
//                        case "c1":
//                            if (silverRing == 1) {
//                                town2();
//                                break;
//                            } else {
//                               SuperPosition sp = new SuperPosition(Ui.this);
//                                sp.dot();
//
//
//
//                                break;
//                            }
//                        case "c2":
//                            attackGuard();
//                            break;
//                        case "c3":
//                            crossRoad();
//                            break;
//                        case "c4":
//                            break;
//                    }
//                    break;
//
//                case "talkGuard":
//                    switch (yourChoice) {
//                        case "c1":
//                            townGate();
//                            break;
//                        case "c2":
//                            break;
//                        case "c3":
//                            break;
//                        case "c4":
//                            break;
//                    }
//                    break;
//
//                case "attackGuard":
//                    switch (yourChoice) {
//                        case "c1":
//                            if (playerHP < 1) {
//                                lose();
//                            } else {
//                                townGate();
//                                break;
//                            }
//                    }
//                    break;
//
//                case "crossRoad":
//                    switch (yourChoice) {
//                        case "c1":
//                            if (canDrink) {
//                                north();
//                            } else {
//                                northEmpty();
//                            }
//                            break;
//                        case "c2":
//                            east();
//                            break;
//                        case "c3":
//                            townGate();
//                            break;
//                        case "c4":
//                            west();
//                            break;
//                    }
//                    break;
//
//                case "town2":
//                    switch (yourChoice) {
//                        case "c1":
//                            vendorHorvath();
//                            break;
//                        case "c2":
//
//                    }
//                    break;
//
//                case "horvath":
//                    switch (yourChoice) {
//                        case "c1":
//
//                                break;
//
//                        case "c2":
//
//                                break;
//
//                    }
//                    break;
//
//                case "witch":
//                    switch (yourChoice) {
//                        case "c1":
//                            northEmpty();
//                            break;
//                        case "c2":
//
//                            getItem();
//                    }
//                    break;
//
//                case "getitem":
//                    switch (yourChoice) {
//                        case "c1":
//                            getItem();
//                            break;
//                        case "c2":
//                            northEmpty();
//                            break;
//                    }
//                    break;
//
//                case "north":
//                    switch (yourChoice) {
//                        case "c1":
//                            crossRoad();
//                            break;
//                        case "c2":
//                            break;
//                        case "c3":
//                            break;
//                        case "c4":
//                            break;
//                    }
//                    break;
//
//                case "northempty":
//                    switch (yourChoice) {
//                        case "c1":
//                            crossRoad();
//                            break;
//                        case "c2":
//                            witch();
//                            break;
//                    }
//                    break;
//
//                case "east":
//                    switch (yourChoice) {
//                        case "c1":
//                            crossRoad();
//                            break;
//                        case "c2":
//                            break;
//                    }
//                    break;
//
//                case "west":
//                    switch (yourChoice) {
//
//                        case "c1":
//                            fightGoblin();
//                            break;
//                        case "c2":
//                            crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "fightgoblin":
//                    switch (yourChoice) {
//                        case "c1":
//                            playerAttack();
//                            break;
//                        case "c2":
//                            crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "playerattack":
//                    switch (yourChoice) {
//                        case "c1":
//                            if (monsterHP < 1) {
//                                win();
//                            } else {
//                                monsterAttack();
//                            }
//                            break;
//                        case "c2":
//                            break;
//                    }
//                    break;
//
//                case "monsterattack":
//                    switch (yourChoice) {
//                        case "c1":
//                            if (playerHP < 1) {
//                                lose();
//                            } else {
//                                fightGoblin();
//                            }
//                            break;
//                        case "c2":
//                            break;
//                    }
//                    break;
//
//                case "lose":
//                    switch (yourChoice) {
//                        case "c1":
//                            startOver();
//                            break;
//                        case "c2":
//                            quitGame();
//                            break;
//                    }
//                    break;
//
//                case "win":
//                    switch (yourChoice) {
//                        case "c1":
//                            crossRoad();
//                            break;
//                    }
//                    break;
//
//                case "ending":
//                    switch (yourChoice) {
//                        case "c1":
//                            quitGame();
//                            break;
//                    }
//                    break;
//            }

        }
    }

    public class InventoryHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            String buttonPressed = event.getActionCommand();
            String invButtonPressed = event.getActionCommand();
            switch (invButtonPressed) {
                case "invbutton":
                    if (inventoryPanel.isVisible()) {
                        inventoryPanel.setVisible(false);
                    } else {
                        inventoryPanel.setVisible(true);
                    }

            }


//            if (vendorPanel.isVisible()){
//                if (horvath.getVendorItems().size() < 23){
//
//                }
//                switch (buttonPressed){
//                    case "iv1":
//
//                }
//            }


            switch (buttonPressed) {


                case "iv1":
                    itemUsed(0);
                    break;
                case "iv2":
                    itemUsed(1);
                    break;
                case "iv3":
                    itemUsed(2);
                    break;
                case "iv4":
                    itemUsed(3);
                    break;
                case "iv5":
                    itemUsed(4);
                    break;
                case "iv6":
                    itemUsed(5);
                    break;
                case "iv7":
                    itemUsed(6);
                    break;
                case "iv8":
                    itemUsed(7);
                    break;

            }
        }
    }

    public class VendorHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String buttonPressed = event.getActionCommand();




            if (inventory.getItems().size() < 8) {

                switch (buttonPressed) {

//                    if (inventory.getItems().get(0) != null){inv1.setText(inventory.getItems().get(0).getName());}
//                    else{ inv1.setText("");}
//                    if (inventory.getItems().get(1) != null){inv2.setText(inventory.getItems().get(1).getName());}
//                    else{ inv2.setText("");}
//                    if (inventory.getItems().get(2) != null){inv3.setText(inventory.getItems().get(2).getName());}
//                    else{ inv3.setText("");}
//                    if (inventory.getItems().get(3) != null){inv4.setText(inventory.getItems().get(3).getName());}
//                    else{ inv4.setText("");}
//                    if (inventory.getItems().get(4) != null){inv5.setText(inventory.getItems().get(4).getName());}
//                    else{ inv5.setText("");}
//                    if (inventory.getItems().get(5)!= null){inv6.setText(inventory.getItems().get(5).getName());}
//                    else{ inv6.setText("");}
//                    if (inventory.getItems().get(6) != null){ inv7.setText(inventory.getItems().get(6).getName());}
//                    else{ inv7.setText("");}
//                    if (inventory.getItems().get(7)!= null){ inv8.setText(inventory.getItems().get(7).getName());}
//                    else{ inv8.setText("");}
//                    break;
                    case "vd1":
                        if (player.getCoins() < horvath.getVendorItems().get(0).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(0));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(0).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(0);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd2":
                        if (player.getCoins() < horvath.getVendorItems().get(1).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(1));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(1).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(1);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd3":
                        if (player.getCoins() < horvath.getVendorItems().get(2).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(2));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(2).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(2);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd4":
                        if (player.getCoins() < horvath.getVendorItems().get(3).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(3));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(3).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(3);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd5":
                        if (player.getCoins() < horvath.getVendorItems().get(4).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(4));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(4).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(4);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd6":
                        if (player.getCoins() < horvath.getVendorItems().get(5).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(5));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(5).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(5);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd7":
                        if (player.getCoins() < horvath.getVendorItems().get(6).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(6));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(6).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(6);
                            initVendor();
                            initInventory();
                            break;
                        }

                        case "vd8":
                        if (player.getCoins() < horvath.getVendorItems().get(7).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(7));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(7).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(7);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd9":
                        if (player.getCoins() < horvath.getVendorItems().get(8).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(8));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(8).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(8);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd10":
                        if (player.getCoins() < horvath.getVendorItems().get(9).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(9));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(9).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(9);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd11":
                        if (player.getCoins() < horvath.getVendorItems().get(10).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(10));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(10).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(10);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd12":
                        if (player.getCoins() < horvath.getVendorItems().get(11).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(11));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(11).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(11);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd13":
                        if (player.getCoins() < horvath.getVendorItems().get(12).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(12));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(12).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(12);
                            initVendor();
                            initInventory();
                            break;
                        }

                    case "vd14":
                        if (player.getCoins() < horvath.getVendorItems().get(13).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(13));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(13).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(13);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd15":
                        if (player.getCoins() < horvath.getVendorItems().get(14).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(14));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(14).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(14);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd16":
                        if (player.getCoins() < horvath.getVendorItems().get(15).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(15));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(15).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(15);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd17":
                        if (player.getCoins() < horvath.getVendorItems().get(16).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(16));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(16).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(16);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd18":
                        if (player.getCoins() < horvath.getVendorItems().get(17).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(17));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(17).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(17);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd19":
                        if (player.getCoins() < horvath.getVendorItems().get(18).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(18));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(18).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(18);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd20":
                        if (player.getCoins() < horvath.getVendorItems().get(19).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(19));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(19).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(19);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd21":
                        if (player.getCoins() < horvath.getVendorItems().get(20).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(20));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(20).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(20);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd22":
                        if (player.getCoins() < horvath.getVendorItems().get(21).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(21));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(21).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(21);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd23":
                        if (player.getCoins() < horvath.getVendorItems().get(22).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(22));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(22).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(22);
                            initVendor();
                            initInventory();
                            break;
                        }
                    case "vd24":
                        if (player.getCoins() < horvath.getVendorItems().get(23).getBuyingPrice()) {
                            mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                            break;
                        } else {
                            inventory.getItems().add(horvath.getVendorItems().get(23));
                            player.setCoins(player.getCoins() - horvath.getVendorItems().get(23).getBuyingPrice());
                            coinsnNumber.setText("" + player.getCoins());
                            horvath.getVendorItems().remove(23);
                            initVendor();
                            initInventory();
                            break;
                        }
                }

            }
            else {
                mainTextArea.setText("Your inventory is full, store some items or consume them.");

            }

        }
    }
}
*/