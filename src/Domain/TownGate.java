package Domain;

import ManInTheWoods.Ui;

public class TownGate extends SuperPosition {
Ui ui;
    public TownGate(){

        ui = getUi();
    }

    public void townGate() {
        ui.changeMainTextArea("You are at the gates of the town. \nA guard is standing in front of you. \n\nWhat do you do? ");

        ui.changeTextChoice1("Talk to the guard");
        ui.changeTextChoice2("Attack the guard.");
        ui.changeTextChoice3("leave");
        ui.changeTextChoice4("");

        setNextPosition1("talkGuard");
    }
}
