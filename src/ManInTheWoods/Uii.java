package ManInTheWoods;

import Domain.Choicehandler;
import Domain.InventoryHandler;
import Domain.VendorHandler;

import javax.swing.*;
import java.awt.*;
public class Uii {


    private  JFrame window;
    private  Container container;
    private  JPanel titelNamePanel;
    private JPanel startButtonPanel;
    private JPanel mainTextPanel;
    private JPanel choiceButtonPanel;
    private JPanel playerPanel;
    private JPanel picturePanel;
    private JPanel vendorPanel;
    private JPanel inventoryPanel;
    private  JLabel titelNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName, coinsLabel, coinsnNumber;
    private  JButton startButton, choice1, choice2, choice3, choice4, inventoryButton, inv1, inv2, inv3, inv4, inv5, inv6, inv7, inv8;
    private  JButton vendor1, vendor2, vendor3, vendor4, vendor5, vendor6, vendor7, vendor8, vendor9, vendor10, vendor11, vendor12, vendor13, vendor14, vendor15, vendor16, vendor17, vendor18, vendor19, vendor20, vendor21, vendor22, vendor23, vendor24;
    private  JTextArea mainTextArea;
    private  Font titelFont = new Font("Times New Roman", Font.PLAIN, 62);
    private  Font gameFont = new Font("Times New Roman", Font.PLAIN, 27);
    private  Font vendorFont = new Font("Times New Roman", Font.PLAIN, 15);

    public Uii()
    {

    }


    public void createUi(Choicehandler choiceHandler, InventoryHandler invHandler, VendorHandler vendorHandler)
    {
        window = new JFrame();
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);

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
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");

        //adding on panels
        titelNamePanel.add(titelNameLabel);
        startButtonPanel.add(startButton);

        //adding to container
        container.add(titelNamePanel);
        container.add(startButtonPanel);

        window.setVisible(true);





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
        inventoryPanel.setBackground(Color.BLACK);
        inventoryPanel.setForeground(Color.WHITE);
        container.add(inventoryPanel);

        //creation inventory button.
        inv1 = new JButton();
        inv1.setForeground(Color.WHITE);
        inv1.setBackground(Color.black);
        inv1.setFont(gameFont);
        inv1.addActionListener(invHandler);
        inv1.setActionCommand("iv1");
        inventoryPanel.add(inv1);

        inv2 = new JButton();
        inv2.setForeground(Color.WHITE);
        inv2.setBackground(Color.black);
        inv2.setFont(gameFont);
        inv2.addActionListener(invHandler);
        inv2.setActionCommand("iv2");
        inventoryPanel.add(inv2);

        inv3 = new JButton();
        inv3.setForeground(Color.WHITE);
        inv3.setBackground(Color.black);
        inv3.setFont(gameFont);
        inv3.addActionListener(invHandler);
        inv3.setActionCommand("iv3");
        inventoryPanel.add(inv3);

        inv4 = new JButton();
        inv4.setForeground(Color.WHITE);
        inv4.setBackground(Color.black);
        inv4.setFont(gameFont);
        inv4.addActionListener(invHandler);
        inv4.setActionCommand("iv4");
        inventoryPanel.add(inv4);

        inv5 = new JButton();
        inv5.setForeground(Color.WHITE);
        inv5.setBackground(Color.black);
        inv5.setFont(gameFont);
        inv5.addActionListener(invHandler);
        inv5.setActionCommand("iv5");
        inventoryPanel.add(inv5);

        inv6 = new JButton();
        inv6.setForeground(Color.WHITE);
        inv6.setBackground(Color.black);
        inv6.setFont(gameFont);
        inv6.addActionListener(invHandler);
        inv6.setActionCommand("iv6");
        inventoryPanel.add(inv6);

        inv7 = new JButton();
        inv7.setForeground(Color.WHITE);
        inv7.setBackground(Color.black);
        inv7.setFont(gameFont);
        inv7.addActionListener(invHandler);
        inv7.setActionCommand("iv7");
        inventoryPanel.add(inv7);

        inv8 = new JButton();
        inv8.setForeground(Color.WHITE);
        inv8.setBackground(Color.black);
        inv8.setFont(gameFont);
        inv8.addActionListener(invHandler);
        inv8.setActionCommand("iv8");
        inventoryPanel.add(inv8);

        //Creation picture panel
        picturePanel = new JPanel();
        picturePanel.setBounds(30, 50, 650, 400);
        picturePanel.setBackground(Color.white);
        container.add(picturePanel);

        //Creation vendor panel
        vendorPanel = new JPanel();
        vendorPanel.setBounds(30, 50, 650, 400);
        vendorPanel.setBackground(Color.white);
        vendorPanel.setLayout(new GridLayout(8, 3));
        container.add(vendorPanel);

        //vendor buttons
        vendor1 = new JButton();
        vendor1.setForeground(Color.WHITE);
        vendor1.setBackground(Color.black);
        vendor1.setFont(vendorFont);
        vendor1.addActionListener(vendorHandler);
        vendor1.setActionCommand("vd1");
        vendorPanel.add(vendor1);

        vendor2 = new JButton();
        vendor2.setForeground(Color.WHITE);
        vendor2.setBackground(Color.black);
        vendor2.setFont(vendorFont);
        vendor2.addActionListener(vendorHandler);
        vendor2.setActionCommand("vd2");
        vendorPanel.add(vendor2);

        vendor3 = new JButton();
        vendor3.setForeground(Color.WHITE);
        vendor3.setBackground(Color.black);
        vendor3.setFont(vendorFont);
        vendor3.addActionListener(vendorHandler);
        vendor3.setActionCommand("vd3");
        vendorPanel.add(vendor3);

        vendor4 = new JButton();
        vendor4.setForeground(Color.WHITE);
        vendor4.setBackground(Color.black);
        vendor4.setFont(vendorFont);
        vendor4.addActionListener(vendorHandler);
        vendor4.setActionCommand("vd4");
        vendorPanel.add(vendor4);

        vendor5 = new JButton();
        vendor5.setForeground(Color.WHITE);
        vendor5.setBackground(Color.black);
        vendor5.setFont(vendorFont);
        vendor5.addActionListener(vendorHandler);
        vendor5.setActionCommand("vd5");
        vendorPanel.add(vendor5);

        vendor6 = new JButton();
        vendor6.setForeground(Color.WHITE);
        vendor6.setBackground(Color.black);
        vendor6.setFont(vendorFont);
        vendor6.addActionListener(vendorHandler);
        vendor6.setActionCommand("vd6");
        vendorPanel.add(vendor6);

        vendor7 = new JButton();
        vendor7.setForeground(Color.WHITE);
        vendor7.setBackground(Color.black);
        vendor7.setFont(vendorFont);
        vendor7.addActionListener(vendorHandler);
        vendor7.setActionCommand("vd7");
        vendorPanel.add(vendor7);

        vendor8 = new JButton();
        vendor8.setForeground(Color.WHITE);
        vendor8.setBackground(Color.black);
        vendor8.setFont(vendorFont);
        vendor8.addActionListener(vendorHandler);
        vendor8.setActionCommand("vd8");
        vendorPanel.add(vendor8);

        vendor9 = new JButton();
        vendor9.setForeground(Color.WHITE);
        vendor9.setBackground(Color.black);
        vendor9.setFont(vendorFont);
        vendor9.addActionListener(vendorHandler);
        vendor9.setActionCommand("vd9");
        vendorPanel.add(vendor9);

        vendor10 = new JButton();
        vendor10.setForeground(Color.WHITE);
        vendor10.setBackground(Color.black);
        vendor10.setFont(vendorFont);
        vendor10.addActionListener(vendorHandler);
        vendor10.setActionCommand("vd10");
        vendorPanel.add(vendor10);

        vendor11 = new JButton();
        vendor11.setForeground(Color.WHITE);
        vendor11.setBackground(Color.black);
        vendor11.setFont(vendorFont);
        vendor11.addActionListener(vendorHandler);
        vendor11.setActionCommand("vd11");
        vendorPanel.add(vendor11);

        vendor12 = new JButton();
        vendor12.setForeground(Color.WHITE);
        vendor12.setBackground(Color.black);
        vendor12.setFont(vendorFont);
        vendor12.addActionListener(vendorHandler);
        vendor12.setActionCommand("vd13");
        vendorPanel.add(vendor12);

        vendor13 = new JButton();
        vendor13.setForeground(Color.WHITE);
        vendor13.setBackground(Color.black);
        vendor13.setFont(vendorFont);
        vendor13.addActionListener(vendorHandler);
        vendor13.setActionCommand("vd13");
        vendorPanel.add(vendor13);

        vendor14 = new JButton();
        vendor14.setForeground(Color.WHITE);
        vendor14.setBackground(Color.black);
        vendor14.setFont(vendorFont);
        vendor14.addActionListener(vendorHandler);
        vendor14.setActionCommand("vd14");
        vendorPanel.add(vendor14);

        vendor15 = new JButton();
        vendor15.setForeground(Color.WHITE);
        vendor15.setBackground(Color.black);
        vendor15.setFont(vendorFont);
        vendor15.addActionListener(vendorHandler);
        vendor15.setActionCommand("vd15");
        vendorPanel.add(vendor15);

        vendor16 = new JButton();
        vendor16.setForeground(Color.WHITE);
        vendor16.setBackground(Color.black);
        vendor16.setFont(vendorFont);
        vendor16.addActionListener(vendorHandler);
        vendor16.setActionCommand("vd16");
        vendorPanel.add(vendor16);

        vendor17 = new JButton();
        vendor17.setForeground(Color.WHITE);
        vendor17.setBackground(Color.black);
        vendor17.setFont(vendorFont);
        vendor17.addActionListener(vendorHandler);
        vendor17.setActionCommand("vd17");
        vendorPanel.add(vendor17);

        vendor18 = new JButton();
        vendor18.setForeground(Color.WHITE);
        vendor18.setBackground(Color.black);
        vendor18.setFont(vendorFont);
        vendor18.addActionListener(vendorHandler);
        vendor18.setActionCommand("vd18");
        vendorPanel.add(vendor18);

        vendor19 = new JButton();
        vendor19.setForeground(Color.WHITE);
        vendor19.setBackground(Color.black);
        vendor19.setFont(vendorFont);
        vendor19.addActionListener(vendorHandler);
        vendor19.setActionCommand("vd19");
        vendorPanel.add(vendor19);

        vendor20 = new JButton();
        vendor20.setForeground(Color.WHITE);
        vendor20.setBackground(Color.black);
        vendor20.setFont(vendorFont);
        vendor20.addActionListener(vendorHandler);
        vendor20.setActionCommand("vd20");
        vendorPanel.add(vendor20);

        vendor21 = new JButton();
        vendor21.setForeground(Color.WHITE);
        vendor21.setBackground(Color.black);
        vendor21.setFont(vendorFont);
        vendor21.addActionListener(vendorHandler);
        vendor21.setActionCommand("vd21");
        vendorPanel.add(vendor21);

        vendor22 = new JButton();
        vendor22.setForeground(Color.WHITE);
        vendor22.setBackground(Color.black);
        vendor22.setFont(vendorFont);
        vendor22.addActionListener(vendorHandler);
        vendor22.setActionCommand("vd22");
        vendorPanel.add(vendor22);

        vendor23 = new JButton();
        vendor23.setForeground(Color.WHITE);
        vendor23.setBackground(Color.black);
        vendor23.setFont(vendorFont);
        vendor23.addActionListener(vendorHandler);
        vendor23.setActionCommand("vd23");
        vendorPanel.add(vendor23);

        vendor24 = new JButton();
        vendor24.setForeground(Color.WHITE);
        vendor24.setBackground(Color.black);
        vendor24.setFont(vendorFont);
        vendor24.addActionListener(vendorHandler);
        vendor24.setActionCommand("vd24");
        vendorPanel.add(vendor24);


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
        //coinsnNumber.setText("" + player.getCoins());
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

        }




// GETTERS AND SETTERS

    public JPanel getTitelNamePanel() {
        return titelNamePanel;
    }

    public void setTitelNamePanel(JPanel titelNamePanel) {
        this.titelNamePanel = titelNamePanel;
    }

    public JPanel getStartButtonPanel() {
        return startButtonPanel;
    }

    public void setStartButtonPanel(JPanel startButtonPanel) {
        this.startButtonPanel = startButtonPanel;
    }

    public JPanel getMainTextPanel() {
        return mainTextPanel;
    }

    public void setMainTextPanel(JPanel mainTextPanel) {
        this.mainTextPanel = mainTextPanel;
    }

    public JPanel getChoiceButtonPanel() {
        return choiceButtonPanel;
    }

    public void setChoiceButtonPanel(JPanel choiceButtonPanel) {
        this.choiceButtonPanel = choiceButtonPanel;
    }

    public JPanel getPlayerPanel() {
        return playerPanel;
    }

    public void setPlayerPanel(JPanel playerPanel) {
        this.playerPanel = playerPanel;
    }

    public JPanel getPicturePanel() {
        return picturePanel;
    }

    public void setPicturePanel(JPanel picturePanel) {
        this.picturePanel = picturePanel;
    }

    public JPanel getVendorPanel() {
        return vendorPanel;
    }

    public void setVendorPanel(JPanel vendorPanel) {
        this.vendorPanel = vendorPanel;
    }

    public JPanel getInventoryPanel() {
        return inventoryPanel;
    }

    public void setInventoryPanel(JPanel inventoryPanel) {
        this.inventoryPanel = inventoryPanel;
    }

}
