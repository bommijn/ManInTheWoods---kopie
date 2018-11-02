package Domain;

import ManInTheWoods.Ui;

public  class SuperPosition {



   private Ui ui;
   public static  String  nextPosition1, nextPosition2, nextPosition3, nextPosition4;



   public Ui getUi()
   {
       return  ui;
   }


   public String getNextPosition1() {
        return nextPosition1;
    }

    public void setNextPosition1(String nextPosition1) {
        this.nextPosition1 = nextPosition1;
    }

    public String getNextPosition2() {
        return nextPosition2;
    }

    public void setNextPosition2(String nextPosition2) {
        this.nextPosition2 = nextPosition2;
    }

    public String getNextPosition3() {
        return nextPosition3;
    }

    public void setNextPosition3(String nextPosition3) {
        this.nextPosition3 = nextPosition3;
    }

    public String getNextPosition4() {
        return nextPosition4;
    }

    public void setNextPosition4(String nextPosition4) {
        this.nextPosition4 = nextPosition4;
    }



    public void doChoice1(){
       TownGate townGate = new TownGate();
       TalkGuard talkGuard = new TalkGuard(getUi());
       ui = getUi();
       switch (getNextPosition1()){
            case "townGate":
                townGate.townGate(); break;

            case "talkGuard":
                talkGuard.talkGuard(); break;


       }
    }



    public SuperPosition(final Ui ui)
    {
        this.ui = ui;
        nextPosition1 = this.getNextPosition1();
        nextPosition2 = this.getNextPosition2();
        nextPosition3 = this.getNextPosition3();
        nextPosition4 = this.getNextPosition4();

    }

    public SuperPosition()
    {
        nextPosition1 = this.getNextPosition1();
        nextPosition2 = this.getNextPosition2();
        nextPosition3 = this.getNextPosition3();
        nextPosition4 = this.getNextPosition4();

    }





    public void dot(){
        TownGate townGate = new TownGate();
        TalkGuard tg = new TalkGuard(ui);
        tg.talkGuard();
    }




}
