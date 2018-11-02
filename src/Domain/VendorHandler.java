package Domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendorHandler implements ActionListener {

    private Inventory inventory = new Inventory();

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

