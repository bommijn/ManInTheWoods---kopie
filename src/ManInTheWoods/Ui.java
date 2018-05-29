package ManInTheWoods;

import Domain.Monster;
import Domain.Player;
import Domain.Weapon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Ui{


    JFrame window;
    Container container;
    JPanel titelNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titelNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    JButton startButton,choice1, choice2, choice3, choice4;
    JTextArea mainTextArea;
    Font titelFont = new Font("Times New Roman", Font.PLAIN, 62);
    Font gameFont = new Font("Times New Roman", Font.PLAIN,27);
    int playerHP, silverRing;
    int monsterHP;
    boolean canDrink = true;
    String weapon, position;
    
    private final Weapon  knife = new Weapon("knife",3);
private final Weapon  longsword = new Weapon("longsword",7);
private final  Monster goblin = new Monster("Goblin", 10,4);
   Player player = new Player(playerHP,knife);
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();



    public Ui(){

 monsterHP = goblin.getMonsterHP();

 
 
    window = new JFrame();
    window.setSize(800,600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.BLACK);
    window.setLayout(null);
    window.setVisible(true);
    container = window.getContentPane();

    //creation of titellabel and titelpanel
    titelNamePanel = new JPanel();
    titelNamePanel.setBounds(100,100,600,150);
    titelNamePanel.setBackground(Color.BLACK);
    titelNameLabel = new JLabel("Siemen in the woods");
    titelNameLabel.setFont(titelFont);
    titelNameLabel.setForeground(Color.WHITE);

    //creation of startbutton panel
    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(300,400,200,100);
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

public void createGameScreen(){

        titelNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(gameFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        //Creation choice button panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
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
        choice2.setBackground(Color.white);
        choice2.setForeground(Color.black);
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
        choice4.setBackground(Color.white);
        choice4.setForeground(Color.black);
        choice4.setFont(gameFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.darkGray);
        playerPanel.setLayout(new GridLayout(1,4));
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


    public void playerSetup(){
     
        playerHP=15; 
      
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
        townGate();
    }

    public void  townGate(){
        mainTextArea.setText("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");
        position = "townGate";

        choice1.setText("Talk to the guard");
        choice2.setText("Attack the guard.");
        choice3.setText("leave");
        choice4.setText("");
    }


    public void talkGuard(){
        mainTextArea.setText("Hello stranger, i have never seen you before. \n" +
                "I'm sorry but we cant allow strangers in our town. ");
        position = "talkGuard";

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }


    public void attackGuard(){
        position = "attackGuard";
        mainTextArea.setText("Guard: hey dont be stupid \n " +
                "The guard hits you and you lose 3hp.");
        playerHP = playerHP - 3;
        hpLabelNumber.setText("" + playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }


    public void crossRoad(){
        position = "crossRoad";
        mainTextArea.setText("You are at a crossroad. \nIf you go south, you will go back to the town.");
        choice1.setText("Go north");
        choice2.setText("Go east");
        choice3.setText("Go south");
        choice4.setText("Go west");

    }
public void  northEmpty(){
        position = "northempty";
        mainTextArea.setText("The river has dried up,\nNothing to do here/");
        choice1.setText("Go south");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
}

    public void north(){
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
    public void west(){
              
        position = "west";
        mainTextArea.setText("You have encountered a goblin");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");


    }
    public void east(){
        position = "east";


        mainTextArea.setText("You walk into a forest and found a Long Sword \n\n(You obtained a Long Sword!)");
        player.setWeapon(longsword);
//        weapon = "Long Sword";
        weaponLabelName.setText(player.getWeapon().getName());
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }


    public void fightGoblin(){
      
        position = "fightgoblin";
        mainTextArea.setText("Monster hp:" + monsterHP + "\n\nWhat do you do?");
        choice1.setText("Fight");
        choice2.setText("Run away");
        choice3.setText("");
        choice4.setText("");
        }

   public void playerAttack(){
       

        position = "playerattack";
        Random random = new Random();
        int playerDamage = 0 ;
        if (player.getWeapon().getName().equals("knife")){
        playerDamage = random.nextInt(knife.getDmgIndex());}
        else if (player.getWeapon().getName().equals("longsword")){
            playerDamage = random.nextInt(longsword.getDmgIndex());
        }
        monsterHP = monsterHP - playerDamage;
        mainTextArea.setText("You attacked the monster and gave " + playerDamage + " damage!\n\nHp left:" + monsterHP);

       choice1.setText(">");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
   }

   public void monsterAttack(){
     
        position = "monsterattack";
        Random random = new Random();
        int monsterDamage = 0;
        monsterDamage = random.nextInt(goblin.getMonsterDmg());

        mainTextArea.setText("The monster attacked you and gave " + monsterDamage + " damage!");
        playerHP = playerHP - monsterDamage;
        hpLabelNumber.setText(""+ playerHP);

        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

   }


   public void win(){
    position = "win";

    mainTextArea.setText(String.format("The %s has been defeated! \nThe monster dropped a ring.\n\n(You obtained a silver ring.) ",goblin.getName()));

    silverRing = 1;
       choice1.setText("Go east");
       choice2.setText("");
       choice3.setText("");
       choice4.setText("");
    }

   public void lose(){
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

   public void startOver(){
       playerSetup();

   }

   public void quitGame(){

        window.dispose();
   }

   public void ending(){
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








    public class  TitleScreenHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {


            createGameScreen();

        }
    }

    public class ChoiceHandler implements ActionListener{


        @Override
        public void actionPerformed(ActionEvent event) {

            String yourChoice = event.getActionCommand();

            switch (position){

                case "townGate":
                    switch (yourChoice){
                        case "c1":
                            if (silverRing == 1){
                                ending(); break; } else{
                            talkGuard(); break;}
                        case "c2": attackGuard(); break;
                        case "c3": crossRoad(); break;
                        case "c4": break;
                    } break;

                case "talkGuard":
                    switch (yourChoice){
                        case "c1": townGate(); break;
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                        } break;

                case "attackGuard":
                    switch (yourChoice){
                        case "c1":
                            if (playerHP<1){ lose();
                            } else{
                            townGate(); break;}
                    } break;

                case "crossRoad":
                    switch (yourChoice){
                        case "c1":if(canDrink){ north();}
                                  else northEmpty(); break;
                        case "c2": east(); break;
                        case "c3": townGate(); break;
                        case "c4": west();  break;
                    } break;

                case "north":
                    switch (yourChoice){
                        case "c1": crossRoad(); break;
                        case "c2": break;
                        case "c3": break;
                        case "c4": break;
                    }break;

                case "northempty":
                    switch (yourChoice){
                        case "c1": crossRoad(); break;
                    }break;

                case "east":
                    switch (yourChoice){
                        case "c1": crossRoad(); break;
                        case "c2": break;
                    }break;

                case "west":
                    switch (yourChoice){
                        
                        case "c1": fightGoblin(); break;
                        case "c2": crossRoad(); break;
                    }break;

                case "fightgoblin":
                    switch (yourChoice){
                        case "c1": playerAttack(); break;
                        case "c2": crossRoad(); break;
                        }break;

                case "playerattack":
                    switch (yourChoice){
                        case "c1":
                            if (monsterHP<1){ win(); }
                                else{
                            monsterAttack();} break;
                        case "c2": break;
                    } break;

                case "monsterattack":
                    switch (yourChoice){
                        case "c1": if (playerHP<1){
                            lose();} else{
                            fightGoblin();} break;
                        case "c2": break;
                    } break;

                case "lose":
                    switch (yourChoice){
                        case "c1": startOver(); break;
                        case "c2": quitGame(); break;
                    }break;

                case "win":
                    switch (yourChoice){
                        case "c1": crossRoad(); break;
                    }break;

                case "ending":
                    switch (yourChoice){
                        case "c1": quitGame(); break;
                    }break;
            }

        }
    }


}
