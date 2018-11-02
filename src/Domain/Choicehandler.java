package Domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choicehandler implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        String yourChoice = e.getActionCommand();

        switch( yourChoice ){
            case "c1":      break;
            case "c2":      break;
            case "c3":      break;
            case "c4":      break;
            case "start":   break;


        }

    }
}
