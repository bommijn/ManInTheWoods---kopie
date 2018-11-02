package Domain;

import ManInTheWoods.Uii;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryHandler implements ActionListener {

 private VisibilityManager visibilityManager;

    /**
     * Constructor for the inventorymanager, uses visibilitymanager
     * @param visibilityManager dependency to toggle inv panels
     */
    public  InventoryHandler(VisibilityManager visibilityManager) {
        this.visibilityManager = visibilityManager;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        String buttonPressed = event.getActionCommand();






        switch (buttonPressed) {

            case "invbutton":
                visibilityManager.togleVendor();
                break;
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
