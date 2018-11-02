package Domain;

import ManInTheWoods.Uii;

public class Game {

    Choicehandler chandler = new Choicehandler();
    InventoryHandler invHandler = new InventoryHandler();
    VendorHandler vendorHandler = new VendorHandler();
    Uii ui = new Uii();
    VisibilityManager visibilityManager = new VisibilityManager(ui);

    public Game()
    {
        ui.createUi(chandler, invHandler, vendorHandler );
    }








}
