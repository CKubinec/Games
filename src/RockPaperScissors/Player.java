package RockPaperScissors;
import java.util.concurrent.ThreadLocalRandom;

public class Player implements Runnable{

    String attackName;

    public Player() {

    }

    public synchronized void run() {
        
    }
    public synchronized String getAttack() {
        int random = ThreadLocalRandom.current().nextInt(1, 6);
        String attack;
        switch (random) {
            case 1:
                attack = "Rock";
                break;
            case 2:
                attack = "Paper";
                break;
            case 3:
                attack = "Scissors";
                break;
            case 4:
                attack = "Lizard";
                break;
            case 5:
                attack = "Spock";
                break;
            default:
                attack = "Nothing";
        }
        return attack;
    }
}
