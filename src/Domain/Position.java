/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;


import ManInTheWoods.Ui;
import ManInTheWoods.Ui.*;
/**
 *
 * @author Bram
 */



public class Position {
    Ui ui = new Ui();
    Item knife = new Item("knife",0,5,30);
    Player player = new Player(15,knife,0,"crossroad");



    private String nextPosition1;
    private String nextPosition2;
    private String nextPosition3;
    private String nextPosition4;

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



public  Position(){

}



    public void crossRoad(){

    ui.position = "crossroad";

        ui.mainTextArea.setText("You are at a crossroad. \nIf you go south, you will go back to the town.");
        ui.choice1.setText("Go north");
        ui.choice2.setText("Go east");
        ui.choice3.setText("Go south");
        ui.choice4.setText("Go west");

    nextPosition1 = "towngate";
    nextPosition2 = "east";
    nextPosition3 = "towngate";
    nextPosition4 = "west";
}


    public void townGate() {

        ui.mainTextArea.setText("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");
        ui.position = "townGate";
        player.setCoins(5000);

        ui.coinsnNumber.setText("" + player.getCoins());

//        ImageIcon townsgateImg = new ImageIcon(getClass().getClassLoader().getResource("Images/townsgate.png"));
//
//        picturePanel.add(new JLabel(townsgateImg));
//ImageIcon townsgate = new ImageIcon("Images/townsgate.png");
//picturePanel.set
        ui.choice1.setText("Talk to the guard");
        ui.choice2.setText("Attack the guard.");
        ui.choice3.setText("leave");
        ui.choice4.setText("");

        nextPosition1 = "crossroad";
    }


}



