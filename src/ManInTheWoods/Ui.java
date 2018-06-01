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

    JFrame window;
    Container container;
    JPanel titelNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, inventoryPanel, picturePanel;
    JLabel titelNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    JButton startButton, choice1, choice2, choice3, choice4, inventoryButton, inv1, inv2, inv3, inv4, inv5, inv6, inv7, inv8;
    JTextArea mainTextArea;
    Font titelFont = new Font("Times New Roman", Font.PLAIN, 62);
    Font gameFont = new Font("Times New Roman", Font.PLAIN, 27);
    int playerHP, silverRing;
    int monsterHP;
    boolean canDrink = true;
    String weapon, position;

    private final Inventory inventory = new Inventory();
    Item potion = new Item("Potion", 5, 0);

    private final Item knife = new Item("knife", 0, 3);
    private final Item longsword = new Item("longsword", 0, 7);
    private final Monster goblin = new Monster("Goblin", 10, 4);
    Player player = new Player(playerHP, knife);
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();
    InventoryHandler invHandler = new InventoryHandler();

    public Ui() {

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

        //Creation picture panel
        picturePanel = new JPanel();
        picturePanel.setBounds(50, 50, 400, 250);
        picturePanel.setBackground(Color.black);
        container.add(picturePanel);

        playerPanel = new JPanel();
        playerPanel.setBounds(830, 470, 300, 75);
        playerPanel.setBackground(Color.darkGray);
        playerPanel.setLayout(new GridLayout(2, 2));
        container.add(playerPanel);

        hpLabel = new JLabel("Hp:");
        hpLabel.setFont(gameFont);
        hpLabel.setForeground(Color.WHITE);
        playerPanel.add(hpLabel);
        hpLabelNumber = new JLabel();
        hpLabelNumber.setFont(gameFont);
        hpLabelNumber.setForeground(Color.WHITE);
        playerPanel.add(hpLabelNumber);

        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(gameFont);
        weaponLabel.setForeground(Color.WHITE);
        playerPanel.add(weaponLabel);

        weaponLabelName = new JLabel();
        weaponLabelName.setFont(gameFont);
        weaponLabelName.setForeground(Color.WHITE);
        playerPanel.add(weaponLabelName);

        playerSetup();

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

    public void resizeImage(ImageIcon townsgate) {

    }

    public void townGate() {
        mainTextArea.setText("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");
        position = "townGate";

        ImageIcon townsgate = new ImageIcon(getClass().getClassLoader().getResource("Images/townsgate.png"));

        picturePanel.add(new JLabel(townsgate));
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

            inventory.getItems().add(potion);
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
//        player.setWeapon(longsword);
////        weapon = "Long Sword";
//        weaponLabelName.setText(player.getWeapon().getName());
        inventory.getItems().add(longsword);

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
        position = "win";

        mainTextArea.setText(String.format("The %s has been defeated! \nThe monster dropped a ring.\n\n(You obtained a silver ring.) ", goblin.getName()));

        silverRing = 1;
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

    public void ending() {
        position = "ending";

        mainTextArea.setText("Guard: Oh you have killed the Goblin!? \nYou are a true hero, Welcome to our town.\n\nThe End");
        choice1.setText("Quit Game");
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

            String yourChoice = event.getActionCommand();

            switch (position) {

                case "townGate":
                    switch (yourChoice) {
                        case "c1":
                            if (silverRing == 1) {
                                ending();
                                break;
                            } else {
                                talkGuard();
                                break;
                            }
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
                            east();
                            break;
                        case "c3":
                            townGate();
                            break;
                        case "c4":
                            west();
                            break;
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

}
