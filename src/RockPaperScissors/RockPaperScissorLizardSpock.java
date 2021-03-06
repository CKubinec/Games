package RockPaperScissors;

/**
 * The game Rock paper scissor lizard spock.
 *
 * @author Craig Kubinec ID:3433193
 * @assignment FINAL EXAM
 * @date July 29 2020
 */
public class RockPaperScissorLizardSpock {
    /**
     * The Player 1.
     */
    Player player1;
    /**
     * The Player 2.
     */
    Player player2;

    /**
     * Instantiates a new Rock paper scissor lizard spock.
     *
     * @param player1 the player 1
     * @param player2 the player 2
     */
    public RockPaperScissorLizardSpock(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /**
     * Method to start the game!
     */
    public void play() {
        int rounds = 0;
        int player1Wins = 0;
        int player2Wins = 0;
        boolean noWinner = true;
        while (noWinner) {
            if (rounds == 8) {
                noWinner = false;
                System.out.println("Max Rounds hit!!!");
                System.out.println("Final Score:");
                System.out.println("Player 1: " + player1Wins);
                System.out.println("Player 2: " + player2Wins);
                System.exit(0);
            }
            Thread t = new Thread(player1);
            t.start();
            Thread t2 = new Thread(player2);
            t2.start();
            for (int i = 0; i < 5; i++) {
                if (i == 0) {
                    System.out.print("Rock");
                } else if (i == 1) {
                    System.out.print(", Paper");
                } else if (i == 2) {
                    System.out.print(", Scissors");
                } else if (i == 3) {
                    System.out.print(", Lizard");
                } else {
                    System.out.print(", Spock!\n");
                }
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (player1.attackName.equals("Rock")) {
                switch (player2.attackName) {
                    case "Paper":
                        System.out.println("Player 2s Paper covers Player 1s Rock");
                        player2Wins++;
                        break;
                    case "Lizard":
                        System.out.println("Player 1s Rock crushes Player 2s Lizard");
                        player1Wins++;
                        break;
                    case "Scissors":
                        System.out.println("Player 1s Rock breaks Player 2s Scissors");
                        player1Wins++;
                        break;
                    case "Spock":
                        System.out.println("Player 2s Spock vaporizes Player 1s Rock");
                        player2Wins++;
                        break;
                    case "Rock":
                        System.out.println("DRAW!!!");
                        break;
                    default:
                        break;
                }
            }
            if (player1.attackName.equals("Scissors")) {
                switch (player2.attackName) {
                    case "Paper":
                        System.out.println("Player 1s Scissors cuts Player 2s Paper");
                        player1Wins++;
                        break;
                    case "Lizard":
                        System.out.println("Player 1s Scissors decapitates Player 2s Lizard");
                        player1Wins++;
                        break;
                    case "Scissors":
                        System.out.println("DRAW!!");
                        break;
                    case "Spock":
                        System.out.println("Player 2s Spock smashes Player 1s Scissors");
                        player2Wins++;
                        break;
                    case "Rock":
                        System.out.println("Player 2s Rock crushes Player 1s Scissors");
                        player2Wins++;
                        break;
                    default:
                        break;
                }
            }
            if (player1.attackName.equals("Spock")) {
                switch (player2.attackName) {
                    case "Paper":
                        System.out.println("Player 2s Paper disproves Player 1s Spock");
                        player2Wins++;
                        break;
                    case "Lizard":
                        System.out.println("Player 2s Lizard poisons Player 1s Spock");
                        player2Wins++;
                        break;
                    case "Scissors":
                        System.out.println("Player 1s Spock smashes Player 2s Scissors");
                        player1Wins++;
                        break;
                    case "Spock":
                        System.out.println("DRAW!!");
                        break;
                    case "Rock":
                        System.out.println("Player 1s Spock vaporizes Player 2s Rock");
                        player1Wins++;
                        break;
                    default:
                        break;
                }
            }
            if (player1.attackName.equals("Lizard")) {
                switch (player2.attackName) {
                    case "Paper":
                        System.out.println("Player 1s Lizard eats Player 2s Paper");
                        player1Wins++;
                        break;
                    case "Lizard":
                        System.out.println("DRAW!!");
                        break;
                    case "Scissors":
                        System.out.println("Player 2s Scissors decapitate Player 1s Lizard");
                        player2Wins++;
                        break;
                    case "Spock":
                        System.out.println("Player 1s Lizard poisons Player 2s Spock");
                        player1Wins++;
                        break;
                    case "Rock":
                        System.out.println("Player 2s Rock crushes Player 1s Lizard");
                        player2Wins++;
                        break;
                    default:
                        break;
                }
            }
            if (player1.attackName.equals("Paper")) {
                switch (player2.attackName) {
                    case "Paper":
                        System.out.println("Draw!!");
                        break;
                    case "Lizard":
                        System.out.println("Player 2s Lizard eats Player 1s Paper");
                        player2Wins++;
                        break;
                    case "Scissors":
                        System.out.println("Player 2s Scissors cuts Player 1s Paper");
                        player2Wins++;
                        break;
                    case "Spock":
                        System.out.println("Player 1s Paper Disproves Player 2s Spock");
                        player1Wins++;
                        break;
                    case "Rock":
                        System.out.println("Player 1s Paper covers Player 2s Rock");
                        player1Wins++;
                        break;
                    default:
                        break;
                }
            }
            rounds++;
            if (player1Wins == 4) {
                noWinner = false;
                System.out.println("Player 1 Wins with a score of " + player1Wins + ":" + player2Wins);
            }
            if (player2Wins == 4) {
                noWinner = false;
                System.out.println("Player 2 Wins with a score of " + player2Wins + ":" + player1Wins);
            }

        }
        System.exit(0);
    }
}
