package RockPaperScissors;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The type Player.
 *
 * @author Craig Kubinec ID:3433193
 * @date July 29 2020
 */
public class Player implements Runnable {

    /**
     * The Attack name.
     */
    String attackName;

    /**
     * Instantiates a new Player.
     */
    public Player() {

    }

    /**
     * Method that calls the player to get an attack!
     */
    public synchronized void run() {
        boolean noAttack = true;
        while (noAttack) {
            try {
                getAttack();
                noAttack = false;
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        notify();
    }

    /**
     * Gets a random number and chooses the attack for user.
     */
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
