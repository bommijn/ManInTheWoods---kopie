package Domain;

import ManInTheWoods.Ui;

public class TalkGuard extends SuperPosition  {

Ui ui;


public TalkGuard(final Ui ui){
this.ui = ui;

}



    public void talkGuard() {



        ui.changeMainTextArea("Hello stranger, i have never seen you before. \n"
                + "I'm sorry but we cant allow strangers in our town. ");
        ui.setPosition("talkGuard");

        ui.changeTextChoice1(">");
        ui.changeTextChoice2("");
        ui.changeTextChoice3("");
        ui.changeTextChoice4("");

        ui.setNextPosition1("townGate");

    }
}
