package ManInTheWoods;

import Domain.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

public class Ui {

    public JFrame window;
    public Container container;
    public JTextField nameField;
    public JPanel titelNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, inventoryPanel, picturePanel, vendorPanel, namePanel;
    public JLabel titelNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, coinsLabel, coinsnNumber;
    public JButton startButton, choice1, choice2, choice3, choice4, inventoryButton, inv1, inv2, inv3, inv4, inv5, inv6, inv7, inv8, nameButton;
    public JButton vendor1, vendor2, vendor3, vendor4, vendor5, vendor6, vendor7, vendor8, vendor9, vendor10, vendor11, vendor12, vendor13, vendor14, vendor15, vendor16, vendor17, vendor18, vendor19, vendor20, vendor21, vendor22, vendor23, vendor24;
    public JTextArea mainTextArea;
    public Font titelFont = new Font("Times New Roman", Font.PLAIN, 62);
    public Font gameFont = new Font("Times New Roman", Font.PLAIN, 27);
    public Font vendorFont = new Font("Times New Roman", Font.PLAIN, 20);
    public int playerHP, silverRing;
    public int monsterHP;
    public boolean canDrink = true;
    public boolean guardKnowsName = true;
    public String weapon, position;



    private String position1;
    private String position2;
    private String position3;



    private String position4;

    private final Item worms = new Item("Worms", 5,0,2);
    private final Inventory inventory = new Inventory();
    private final Item potion = new Item("Potion", 5, 0, 5);
    private final Vendor horvath = new Vendor("Horvath");
    private final Item knife = new Item("Knife", 0, 3, 2);
    private final Item longsword = new Item("Longsword", 0, 7, 5);
    private final Monster goblin = new Monster("Goblin", 10, 4);
    private final Item battleAxe = new Item("Battle-axe", 0, 10, 20);
    private final Item loafOfBread = new Item("Loaf of bread", 3, 0, 4);

    CoinGenerator cg = new CoinGenerator();
    Player player = new Player(playerHP, knife, 0, position);
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    InventoryHandler invHandler = new InventoryHandler();
    VendorHandler vendorHandler = new VendorHandler();


    public  Ui(){

    }

    public void makeUi() {

        monsterHP = goblin.getMonsterHP();

        window = new JFrame();
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        container = window.getContentPane();

        //creation of titellabel and titelpanel
        titelNamePanel = new JPanel();
        titelNamePanel.setBounds(100, 100, 1000, 300);
        titelNamePanel.setBackground(Color.BLACK);
        titelNameLabel = new JLabel("Man in the woods");
        titelNameLabel.setFont(titelFont);
        titelNameLabel.setForeground(Color.WHITE);

        //creation of startbutton panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(475, 400, 200, 100);
        startButtonPanel.setBackground(Color.BLACK);

        //creation of startbutton.
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(gameFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(tsHandler);

        //adding on panels
        titelNamePanel.add(titelNameLabel);
        startButtonPanel.add(startButton);

        //adding to container
        container.add(titelNamePanel);
        container.add(startButtonPanel);

    }

    public void createGameScreen() {

        titelNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(25, 500, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(gameFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //Creation choice button panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(830, 550, 300, 150);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(5, 1));
        container.add(choiceButtonPanel);

        //namepanel for jtextfield
        namePanel = new JPanel();
        namePanel.setVisible(false);
        namePanel.setBounds(830, 550, 300, 60);
        namePanel.setBackground(Color.green);
        namePanel.setLayout(new GridLayout(2,1));
        container.add(namePanel);

        //JText field
        nameField = new JTextField();
        nameField.setBackground(Color.BLACK);
        nameField.setForeground(Color.WHITE);
        namePanel.add(nameField);

        //namebutton
        nameButton = new JButton("Enter name");
        nameButton.setFocusPainted(false);
        nameButton.addActionListener(choiceHandler);
        nameButton.setBackground(Color.BLACK);
        nameButton.setActionCommand("name");
        namePanel.add(nameButton);



        //creation choice button 1
        choice1 = new JButton();
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(gameFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        //creation button 2
        choice2 = new JButton();
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(gameFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        //creation button 3
        choice3 = new JButton();
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(gameFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        //creation button 4
        choice4 = new JButton();
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(gameFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        //creation inventory button
        inventoryButton = new JButton("Inventory");
        inventoryButton.setBackground(Color.black);
        inventoryButton.setForeground(Color.white);
        inventoryButton.setFont(gameFont);
        inventoryButton.addActionListener(invHandler);
        inventoryButton.setActionCommand("invbutton");
        choiceButtonPanel.add(inventoryButton);

        //creation inventory panel
        inventoryPanel = new JPanel();
        inventoryPanel.setBounds(830, 15, 300, 450);
        inventoryPanel.setLayout(new GridLayout(8, 1));
        inventoryPanel.setVisible(false);
        inventoryPanel.setBackground(Color.BLACK);
        inventoryPanel.setForeground(Color.WHITE);
        container.add(inventoryPanel);

        //creation inventory button.
        inv1 = new JButton();
        inv1.setForeground(Color.WHITE);
        inv1.setBackground(Color.black);
        inv1.setVisible(true);
        inv1.setFont(gameFont);
        inv1.addActionListener(invHandler);
        inv1.setActionCommand("iv1");
        inventoryPanel.add(inv1);

        inv2 = new JButton();
        inv2.setForeground(Color.WHITE);
        inv2.setBackground(Color.black);
        inv2.setVisible(true);
        inv2.setFont(gameFont);
        inv2.addActionListener(invHandler);
        inv2.setActionCommand("iv2");
        inventoryPanel.add(inv2);

        inv3 = new JButton();
        inv3.setForeground(Color.WHITE);
        inv3.setBackground(Color.black);
        inv3.setVisible(true);
        inv3.setFont(gameFont);
        inv3.addActionListener(invHandler);
        inv3.setActionCommand("iv3");
        inventoryPanel.add(inv3);

        inv4 = new JButton();
        inv4.setForeground(Color.WHITE);
        inv4.setBackground(Color.black);
        inv4.setVisible(true);
        inv4.setFont(gameFont);
        inv4.addActionListener(invHandler);
        inv4.setActionCommand("iv4");
        inventoryPanel.add(inv4);

        inv5 = new JButton();
        inv5.setForeground(Color.WHITE);
        inv5.setBackground(Color.black);
        inv5.setVisible(true);
        inv5.setFont(gameFont);
        inv5.addActionListener(invHandler);
        inv5.setActionCommand("iv5");
        inventoryPanel.add(inv5);

        inv6 = new JButton();
        inv6.setForeground(Color.WHITE);
        inv6.setBackground(Color.black);
        inv6.setVisible(true);
        inv6.setFont(gameFont);
        inv6.addActionListener(invHandler);
        inv6.setActionCommand("iv6");
        inventoryPanel.add(inv6);

        inv7 = new JButton();
        inv7.setForeground(Color.WHITE);
        inv7.setBackground(Color.black);
        inv7.setVisible(true);
        inv7.setFont(gameFont);
        inv7.addActionListener(invHandler);
        inv7.setActionCommand("iv7");
        inventoryPanel.add(inv7);

        inv8 = new JButton();
        inv8.setForeground(Color.WHITE);
        inv8.setBackground(Color.black);
        inv8.setVisible(true);
        inv8.setFont(gameFont);
        inv8.addActionListener(invHandler);
        inv8.setActionCommand("iv8");
        inventoryPanel.add(inv8);

        vendorPanel = new JPanel();
        vendorPanel.setBounds(30, 50, 650, 400);
        vendorPanel.setBackground(Color.white);
        vendorPanel.setLayout(new GridLayout(8,3));
        vendorPanel.setVisible(false);
        container.add(vendorPanel);



        //vendor buttons
        vendor1 = new JButton();
      
        vendor1.setForeground(Color.WHITE);
        vendor1.setBackground(Color.black);
        vendor1.setVisible(true);
        vendor1.setFont(vendorFont);
        vendor1.addActionListener(vendorHandler);
        vendor1.setActionCommand("vd1");
        vendorPanel.add(vendor1);

        vendor2 = new JButton();
     
        vendor2.setForeground(Color.WHITE);
        vendor2.setBackground(Color.black);
        vendor2.setVisible(true);
        vendor2.setFont(vendorFont);
        vendor2.addActionListener(vendorHandler);
        vendor2.setActionCommand("vd2");
        vendorPanel.add(vendor2);

        vendor3 = new JButton();
        vendor3.setForeground(Color.WHITE);
        vendor3.setBackground(Color.black);
        vendor3.setVisible(true);
        vendor3.setFont(vendorFont);
        vendor3.addActionListener(vendorHandler);
        vendor3.setActionCommand("vd3");
        vendorPanel.add(vendor3);

        vendor4 = new JButton();
        vendor4.setForeground(Color.WHITE);
        vendor4.setBackground(Color.black);
        vendor4.setVisible(true);
        vendor4.setFont(vendorFont);
        vendor4.addActionListener(vendorHandler);
        vendor4.setActionCommand("vd4");
        vendorPanel.add(vendor4);

        vendor5 = new JButton();
        vendor5.setForeground(Color.WHITE);
        vendor5.setBackground(Color.black);
        vendor5.setVisible(true);
        vendor5.setFont(vendorFont);
        vendor5.addActionListener(vendorHandler);
        vendor5.setActionCommand("vd5");
        vendorPanel.add(vendor5);

        vendor6 = new JButton();
        vendor6.setForeground(Color.WHITE);
        vendor6.setBackground(Color.black);
        vendor6.setVisible(true);
        vendor6.setFont(vendorFont);
        vendor6.addActionListener(vendorHandler);
        vendor6.setActionCommand("vd6");
        vendorPanel.add(vendor6);

        vendor7 = new JButton();
        vendor7.setForeground(Color.WHITE);
        vendor7.setBackground(Color.black);
        vendor7.setVisible(true);
        vendor7.setFont(vendorFont);
        vendor7.addActionListener(vendorHandler);
        vendor7.setActionCommand("vd7");
        vendorPanel.add(vendor7);

        vendor8 = new JButton();
        vendor8.setForeground(Color.WHITE);
        vendor8.setBackground(Color.black);
        vendor8.setVisible(true);
        vendor8.setFont(vendorFont);
        vendor8.addActionListener(vendorHandler);
        vendor8.setActionCommand("vd8");
        vendorPanel.add(vendor8);

        vendor9 = new JButton();
        vendor9.setForeground(Color.WHITE);
        vendor9.setBackground(Color.black);
        vendor9.setVisible(true);
        vendor9.setFont(vendorFont);
        vendor9.addActionListener(vendorHandler);
        vendor9.setActionCommand("vd9");
        vendorPanel.add(vendor9);

        vendor10 = new JButton();
        vendor10.setForeground(Color.WHITE);
        vendor10.setBackground(Color.black);
        vendor10.setVisible(true);
        vendor10.setFont(vendorFont);
        vendor10.addActionListener(vendorHandler);
        vendor10.setActionCommand("vd10");
        vendorPanel.add(vendor10);

        vendor11 = new JButton();
        vendor11.setForeground(Color.WHITE);
        vendor11.setBackground(Color.black);
        vendor11.setVisible(true);
        vendor11.setFont(vendorFont);
        vendor11.addActionListener(vendorHandler);
        vendor11.setActionCommand("vd11");
        vendorPanel.add(vendor11);

        vendor12 = new JButton();
        vendor12.setForeground(Color.WHITE);
        vendor12.setBackground(Color.black);
        vendor12.setVisible(true);
        vendor12.setFont(vendorFont);
        vendor12.addActionListener(vendorHandler);
        vendor12.setActionCommand("vd13");
        vendorPanel.add(vendor12);

        vendor13 = new JButton();
        vendor13.setForeground(Color.WHITE);
        vendor13.setBackground(Color.black);
        vendor13.setVisible(true);
        vendor13.setFont(vendorFont);
        vendor13.addActionListener(vendorHandler);
        vendor13.setActionCommand("vd13");
        vendorPanel.add(vendor13);

        vendor14 = new JButton();
        vendor14.setForeground(Color.WHITE);
        vendor14.setBackground(Color.black);
        vendor14.setVisible(true);
        vendor14.setFont(vendorFont);
        vendor14.addActionListener(vendorHandler);
        vendor14.setActionCommand("vd14");
        vendorPanel.add(vendor14);

        vendor15 = new JButton();
        vendor15.setForeground(Color.WHITE);
        vendor15.setBackground(Color.black);
        vendor15.setVisible(true);
        vendor15.setFont(vendorFont);
        vendor15.addActionListener(vendorHandler);
        vendor15.setActionCommand("vd15");
        vendorPanel.add(vendor15);

        vendor16 = new JButton();
        vendor16.setForeground(Color.WHITE);
        vendor16.setBackground(Color.black);
        vendor16.setVisible(true);
        vendor16.setFont(vendorFont);
        vendor16.addActionListener(vendorHandler);
        vendor16.setActionCommand("vd16");
        vendorPanel.add(vendor16);

        vendor17 = new JButton();
        vendor17.setForeground(Color.WHITE);
        vendor17.setBackground(Color.black);
        vendor17.setVisible(true);
        vendor17.setFont(vendorFont);
        vendor17.addActionListener(vendorHandler);
        vendor17.setActionCommand("vd17");
        vendorPanel.add(vendor17);

        vendor18 = new JButton();
        vendor18.setForeground(Color.WHITE);
        vendor18.setBackground(Color.black);
        vendor18.setVisible(true);
        vendor18.setFont(vendorFont);
        vendor18.addActionListener(vendorHandler);
        vendor18.setActionCommand("vd18");
        vendorPanel.add(vendor18);

        vendor19 = new JButton();
        vendor19.setForeground(Color.WHITE);
        vendor19.setBackground(Color.black);
        vendor19.setVisible(true);
        vendor19.setFont(vendorFont);
        vendor19.addActionListener(vendorHandler);
        vendor19.setActionCommand("vd19");
        vendorPanel.add(vendor19);

        vendor20 = new JButton();
        vendor20.setForeground(Color.WHITE);
        vendor20.setBackground(Color.black);
        vendor20.setVisible(true);
        vendor20.setFont(vendorFont);
        vendor20.addActionListener(vendorHandler);
        vendor20.setActionCommand("vd20");
        vendorPanel.add(vendor20);

        vendor21 = new JButton();
        vendor21.setForeground(Color.WHITE);
        vendor21.setBackground(Color.black);
        vendor21.setVisible(true);
        vendor21.setFont(vendorFont);
        vendor21.addActionListener(vendorHandler);
        vendor21.setActionCommand("vd21");
        vendorPanel.add(vendor21);

        vendor22 = new JButton();
        vendor22.setForeground(Color.WHITE);
        vendor22.setBackground(Color.black);
        vendor22.setVisible(true);
        vendor22.setFont(vendorFont);
        vendor22.addActionListener(vendorHandler);
        vendor22.setActionCommand("vd22");
        vendorPanel.add(vendor22);

        vendor23 = new JButton();
        vendor23.setForeground(Color.WHITE);
        vendor23.setBackground(Color.black);
        vendor23.setVisible(true);
        vendor23.setFont(vendorFont);
        vendor23.addActionListener(vendorHandler);
        vendor23.setActionCommand("vd23");
        vendorPanel.add(vendor23);

        vendor24 = new JButton();
        vendor24.setForeground(Color.WHITE);
        vendor24.setBackground(Color.black);
        vendor24.setVisible(true);
        vendor24.setFont(vendorFont);
        vendor24.addActionListener(vendorHandler);
        vendor24.setActionCommand("vd24");
        vendorPanel.add(vendor24);


        //Creation picture panel
        picturePanel = new JPanel();
        picturePanel.setBounds(30, 50, 650, 400);
        picturePanel.setBackground(Color.white);
        container.add(picturePanel);

        playerPanel = new JPanel();
        playerPanel.setBounds(830, 470, 300, 75);
        playerPanel.setBackground(Color.darkGray);
        playerPanel.setLayout(new GridLayout(3, 3));
        container.add(playerPanel);

        hpLabel = new JLabel("Hp:");
        hpLabel.setFont(gameFont);
        hpLabel.setForeground(Color.WHITE);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(gameFont);
        hpLabelNumber.setForeground(Color.WHITE);
        coinsLabel = new JLabel("Coins:");
        coinsLabel.setFont(gameFont);
        coinsLabel.setForeground(Color.WHITE);
        coinsnNumber = new JLabel();
        coinsnNumber.setFont(gameFont);
        coinsnNumber.setText("" + player.getCoins());
        coinsnNumber.setForeground(Color.WHITE);

        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(gameFont);
        weaponLabel.setForeground(Color.WHITE);
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(gameFont);
        weaponLabelName.setForeground(Color.WHITE);
        playerPanel.add(weaponLabelName);
        playerPanel.add(coinsLabel);
        playerPanel.add(coinsnNumber);

        playerSetup();

    }


    public void initVendor(){

vendor5.setText("test");
        vendor1.setText(horvath.getVendorItems().get(0).getName());
        vendor2.setText(horvath.getVendorItems().get(1).getName());
       if (horvath.getVendorItems().get(2).getName() == null){
           vendor3.setText("no item");
       }
        vendor3.setText(horvath.getVendorItems().get(2).getName());

    }


    public void initInventory() {

        inv1.setText(inventory.getItems().get(0).getName());
        inv2.setText(inventory.getItems().get(1).getName());
        inv3.setText(inventory.getItems().get(2).getName());
        inv4.setText(inventory.getItems().get(3).getName());
        inv5.setText(inventory.getItems().get(4).getName());
        inv6.setText(inventory.getItems().get(5).getName());
        inv7.setText(inventory.getItems().get(6).getName());
        inv8.setText(inventory.getItems().get(7).getName());
    }

    public void itemUsed(int inventoryspot) {

        String removeString = String.format("inv%d", inventoryspot);

        if (inventory.getItems().get(inventoryspot).getHealingValue() > 0) {

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

        } else if (inventory.getItems().get(inventoryspot).getDmgValue() > 0) {

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
//          inventory.getItems().get(inventoryspot);

//           if (inventoryspot == 0) {
//               inv1.setText("");
//           } else if (inventoryspot == 1) {
//               inv2.setText("");
//           } else if (inventoryspot == 2) {
//               inv3.setText("");
//           } else if (inventoryspot == 3) {
//               inv4.setText("");
//           } else if (inventoryspot == 4) {
//               inv5.setText("");
//           } else if (inventoryspot == 5) {
//               inv6.setText("");
//           } else if (inventoryspot == 6) {
//               inv7.setText("");
//           } else if (inventoryspot == 7) {
//               inv8.setText("");
//           }
        }
        initInventory();
    }

    public void playerSetup() {

        playerHP = 15;
        player.setPosition("startup");
        player.setWeapon(knife);
        goblin.setMonsterHP(15);
        weapon = knife.getName();
        silverRing = 0;
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
        choice1.setVisible(true);
        choice1.setBorderPainted(true);
        choice2.setVisible(true);
        choice2.setBorderPainted(true);
        choice3.setVisible(true);
        choice4.setVisible(true);


        inventory.getItems().add(potion);
        inv1.setText(inventory.getItems().get(0).getName());
//        inventorySlot[1] = null;
//        inventorySlot[2] = null;
//        inventorySlot[3] = null;
//        inventorySlot[4] = null;
//        inventorySlot[5] = null;
//        inventorySlot[6] = null;
//        inventorySlot[7] = null;

        townGate();
    }
    public void vendorUI(){
        picturePanel.setVisible(false);
        vendorPanel.setVisible(true);
    }



    public void townGate() {

        mainTextArea.setText("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");
        position = "townGate";
        player.setCoins(5000);

        coinsnNumber.setText("" + player.getCoins());

//        ImageIcon townsgateImg = new ImageIcon(getClass().getClassLoader().getResource("Images/townsgate.png"));
//
//        picturePanel.add(new JLabel(townsgateImg));
//ImageIcon townsgate = new ImageIcon("Images/townsgate.png");
//picturePanel.set
        choice1.setText("Talk to the guard");
        choice2.setText("Attack the guard.");
        choice3.setText("leave");
        choice4.setText("");
    }

    public void talkGuardFirst(){
        guardKnowsName = false;
        position = "startup";

        mainTextArea.setText("Hello stranger, i have never seen you before. \n"
                + "Tell me your name. ");

        choiceButtonPanel.setVisible(false);
        namePanel.setVisible(true);


    }

    public void talkGuard() {


        mainTextArea.setText("Ah so your name is " + player.getPlayerName() + "\nI'm sorry but i cant let you into the town right now. ");
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
        mainTextArea.setText("Witch: Hello traveler, \nAre you interested in one of my potions? ");
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
    boolean longswordFound = false;

    public void eastSwordFound() {
        position = "eastSwordFound";
        mainTextArea.setText("Nothing left to find here");
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void east() {
        position = "east";

        mainTextArea.setText("You walk into a forest and found a Long Sword \n\n(You obtained a Long Sword!)");
//        picturePanel.removeAll();
//        ImageIcon longswordImg = new ImageIcon(getClass().getClassLoader().getResource("Images/Longsword.jpg"));

//        picturePanel.add(new JLabel(longswordImg));
//        player.setWeapon(longsword);
////        weapon = "Long Sword";
//        weaponLabelName.setText(player.getWeapon().getName());
        inventory.getItems().add(longsword);
        longswordFound = true;
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        initInventory();

    }

    public void fightGoblin() {

        position = "fightgoblin";
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

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }

    public void win() {
        int lastcount, coinsgotten;

        position = "win";

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
        vendorUI();
        mainTextArea.setText("Goodday adventurer, please have a look at my wares");

        horvath.getVendorItems().ensureCapacity(24);
        horvath.getVendorItems().add(battleAxe);
        horvath.getVendorItems().add(loafOfBread);
        horvath.getVendorItems().add(worms);

        choice1.setText(horvath.getVendorItems().get(0).getName() + " " + horvath.getVendorItems().get(0).getPrice() + "coins");
        choice2.setText(horvath.getVendorItems().get(1).getName() + " " + horvath.getVendorItems().get(1).getPrice() + "coins");

        vendor1.setText(horvath.getVendorItems().get(0).getName() + " " + horvath.getVendorItems().get(0).getPrice() + "coins");
        vendor2.setText(horvath.getVendorItems().get(1).getName() + " " + horvath.getVendorItems().get(1).getPrice() + "coins");
        vendor3.setText(horvath.getVendorItems().get(2).getName() + " " + horvath.getVendorItems().get(2).getPrice() + "coins");

        choice1.setVisible(true);
        choice1.setBorderPainted(true);
        choice2.setVisible(true);
        choice2.setBorderPainted(true);
    }

    public void town2() {
        position = "town2";

        mainTextArea.setText("Guard: Oh you have killed the Goblin!? \nYou are a true hero, Welcome to our town.\n\n Feel free to see one of our vendors");

        choice1.setText("Horvath");
        choice1.setVisible(true);
        choice1.setBorderPainted(true);
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

            String yourChoice = event.getActionCommand();
//            switch (yourChoice){
//               case "c1": player.setPosition(pos.getNextPosition1());
//                case "c2": player.setPosition(pos.getNextPosition2());
//                case "c3": player.setPosition(pos.getNextPosition2());
//                case "c4": player.setPosition(pos.getNextPosition2());
//            }



            switch (position) {

                case "startup":
                    switch (yourChoice){
                        case "name":
                            player.setPlayerName(nameField.getText());
                            guardKnowsName = false;
                            namePanel.setVisible(false);
                            choiceButtonPanel.setVisible(true);
                            talkGuard();

                    }


                case "townGate":
                    switch (yourChoice) {
                        case "c1":
                            if (silverRing == 1) {
                                town2();
                                break;
                            } else if (guardKnowsName){
                                talkGuardFirst();
                                break;
                            } else {talkGuard();
                            break;}
                        case "c2":
                            attackGuard();
                            break;
                        case "c3":
                                crossRoad();
                            break;
                        case "c4":
                            break;
                    }
                    break;

                case "talkGuard":
                    switch (yourChoice) {
                        case "c1":
                            townGate();
                            break;
                        case "c2":
                            break;
                        case "c3":
                            break;
                        case "c4":
                            break;
                    }
                    break;

                case "attackGuard":
                    switch (yourChoice) {
                        case "c1":
                            if (playerHP < 1) {
                                lose();
                            } else {
                                townGate();
                                break;
                            }
                    }
                    break;

                case "crossRoad":
                    switch (yourChoice) {
                        case "c1":
                            if (canDrink) {
                                north();
                            } else {
                                northEmpty();
                            }
                            break;

                        case "c2":
                            if (longswordFound) {
                                eastSwordFound();
                            } else {
                                east();
                            }

                            break;
                        case "c3":
                            townGate();
                            break;
                        case "c4":
                            west();
                            break;
                    }
                    break;

                case "eastSwordFound":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();


                    }break;

                case "town2":
                    switch (yourChoice) {
                        case "c1":
                            vendorHorvath();
                            break;
                        case "c2":

                    }
                    break;

                case "horvath":
                    switch (yourChoice) {
                        case "c1":
                            if (player.getCoins() < horvath.getVendorItems().get(0).getPrice()) {
                                mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                                break;
                            } else {
                                inventory.getItems().add(horvath.getVendorItems().get(0));
                                player.setCoins(player.getCoins() - horvath.getVendorItems().get(0).getPrice());
                                coinsnNumber.setText("" + player.getCoins());
                                initInventory();
                                break;
                            }
                        case "c2":
                            if (player.getCoins() <horvath.getVendorItems().get(1).getPrice()) {
                                mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                                break;
                            } else {
                                inventory.getItems().add(horvath.getVendorItems().get(1));
                                player.setCoins(player.getCoins() - horvath.getVendorItems().get(1).getPrice());
                                coinsnNumber.setText("" + player.getCoins());
                                initInventory();
                                break;
                            }
//                        case "iv1":
//                            player.setCoins(player.getCoins() + inventory.getItems().get(0).getPrice());
//                            inventory.getItems().remove(0);
//                            inv1.setText("");

                    }
                    break;

                case "witch":
                    switch (yourChoice) {
                        case "c1":
                            northEmpty();
                            break;
                        case "c2":

                            getItem();
                    }
                    break;

                case "getitem":
                    switch (yourChoice) {
                        case "c1":
                            getItem();
                            break;
                        case "c2":
                            northEmpty();
                            break;
                    }
                    break;

                case "north":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                        case "c2":
                            break;
                        case "c3":
                            break;
                        case "c4":
                            break;
                    }
                    break;

                case "northempty":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                        case "c2":
                            witch();
                            break;
                    }
                    break;

                case "east":

                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                        case "c2":
                            break;
                    }
                    break;

                case "west":
                    switch (yourChoice) {

                        case "c1":
                            fightGoblin();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;

                case "fightgoblin":
                    switch (yourChoice) {
                        case "c1":
                            playerAttack();
                            break;
                        case "c2":
                            crossRoad();
                            break;
                    }
                    break;

                case "playerattack":
                    switch (yourChoice) {
                        case "c1":
                            if (monsterHP < 1) {
                                win();
                            } else {
                                monsterAttack();
                            }
                            break;
                        case "c2":
                            break;
                    }
                    break;

                case "monsterattack":
                    switch (yourChoice) {
                        case "c1":
                            if (playerHP < 1) {
                                lose();
                            } else {
                                fightGoblin();
                            }
                            break;
                        case "c2":
                            break;
                    }
                    break;

                case "lose":
                    switch (yourChoice) {
                        case "c1":
                            startOver();
                            break;
                        case "c2":
                            quitGame();
                            break;
                    }
                    break;

                case "win":
                    switch (yourChoice) {
                        case "c1":
                            crossRoad();
                            break;
                    }
                    break;

                case "ending":
                    switch (yourChoice) {
                        case "c1":
                            quitGame();
                            break;
                    }
                    break;
            }

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
    public class VendorHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
String buttonPressed = event.getActionCommand();
            

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
                            if (player.getCoins() < horvath.getVendorItems().get(0).getPrice()) {
                                mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                                break;
                            } else {
                                inventory.getItems().add(horvath.getVendorItems().get(0));
                                player.setCoins(player.getCoins() - horvath.getVendorItems().get(0).getPrice());
                                coinsnNumber.setText("" + player.getCoins());
                                horvath.getVendorItems().remove(0);
                                initVendor();
                                initInventory();
                                break;
                            }
                 case "vd2":
                            if (player.getCoins() <horvath.getVendorItems().get(1).getPrice()) {
                                mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                                break;
                            } else {
                                inventory.getItems().add(horvath.getVendorItems().get(1));
                                player.setCoins(player.getCoins() - horvath.getVendorItems().get(1).getPrice());
                                coinsnNumber.setText("" + player.getCoins());
                                horvath.getVendorItems().remove(1);
                                initVendor();
                                initInventory();
                                break;
                            }

                 case "vd3":
                    if (player.getCoins() <horvath.getVendorItems().get(1).getPrice()) {
                        mainTextArea.setText("Not enough coins to make that purchase, maybe I have something else within your budget");
                        break;
                    } else {
                        inventory.getItems().add(horvath.getVendorItems().get(2));
                        player.setCoins(player.getCoins() - horvath.getVendorItems().get(2).getPrice());
                        coinsnNumber.setText("" + player.getCoins());
                        horvath.getVendorItems().remove(2);
                        initVendor();
                        initInventory();
                        break;
                    }
//                case "iv3":
//                    itemUsed(2);
//                    break;
//                case "iv4":
//                    itemUsed(3);
//                    break;
//                case "iv5":
//                    itemUsed(4);
//                    break;
//                case "iv6":
//                    itemUsed(5);
//                    break;
//                case "iv7":
//                    itemUsed(6);
//                    break;
//                case "iv8":
//                    itemUsed(7);
//                    break;
        }
    }}}


