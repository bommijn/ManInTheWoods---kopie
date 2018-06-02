package Domain;

import java.util.Random;

public class CoinGenerator {
    String monster;
    int sentBack = 0;

    Random random = new Random();




    public int GenerateCoin(String monster) {
        this.monster = monster;

        switch (monster) {
            case "goblin":
                return random.nextInt(50 - 10)+10;

            case "terror hound":
                return random.nextInt(500 - 1) + 1;



        }
        return 1337;
    }
}
