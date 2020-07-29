package RockPaperScissors;

import java.util.concurrent.ThreadLocalRandom;

public class Player implements Runnable {

    String attackName;

    public Player() {
        
    }

    public synchronized void run() {
        boolean noAttack = true;
        while (noAttack) {
            try {
                getAttack();
                noAttack = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void getAttack() {
        int random = ThreadLocalRandom.current().nextInt(1, 6);
        switch (random) {
            case 1:
                attackName = "Rock";
                break;
            case 2:
                attackName = "Paper";
                break;
            case 3:
                attackName = "Scissors";
                break;
            case 4:
                attackName = "Lizard";
                break;
            case 5:
                attackName = "Spock";
                break;
            default:
                attackName = "Nothing";
        }
    }
}
