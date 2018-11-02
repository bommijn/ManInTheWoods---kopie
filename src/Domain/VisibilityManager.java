package Domain;

import ManInTheWoods.Uii;

public class VisibilityManager {

    private Uii ui;

    /**
     * constructor van de VisibilityManager, heeft param ui voor aan
     * alle panel options te kunnen.
     * @param ui total gamescreen
     */
    public VisibilityManager(Uii ui){
        this.ui = ui;

    }

    public void showTitleScreen(){
        ui.getTitelNamePanel().setVisible(true);
        ui.getStartButtonPanel().setVisible(true);

        ui.getMainTextPanel().setVisible(false);
        ui.getChoiceButtonPanel().setVisible(false);
        ui.getPicturePanel().setVisible(false);
        ui.getPlayerPanel().setVisible(false);
        ui.getVendorPanel().setVisible(false);
        ui.getInventoryPanel().setVisible(false);

    }

    public void makeGameScreen(){
        ui.getTitelNamePanel().setVisible(false);
        ui.getStartButtonPanel().setVisible(false);

        ui.getMainTextPanel().setVisible(true);
        ui.getChoiceButtonPanel().setVisible(true);
        ui.getPicturePanel().setVisible(true);
        ui.getPlayerPanel().setVisible(true);
    }

    public void togleVendor(){
       if ( ui.getPlayerPanel().isVisible() ){
           ui.getVendorPanel().setVisible(false);
       }

       else {
           ui.getVendorPanel().setVisible(true);
       }
    }

    public void togleInventory(){
        if ( ui.getInventoryPanel().isVisible() ){
            ui.getInventoryPanel().setVisible(false);
        }

        else {
            ui.getInventoryPanel().setVisible(true);
        }
    }

}
