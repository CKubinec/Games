import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissorLizardSpock {

    public RockPaperScissorLizardSpock() {

    }

    public void play() {
        int rounds = 0;
        int player1Wins = 0;
        int player2Wins = 0;
        boolean noWinner = true;
        while (noWinner) {
            if (rounds == 10){
                noWinner = false;
                System.out.println("Max Rounds hit!!!");
                System.out.println("Final Score:");
                System.out.println("Player 1: " + player1Wins);
                System.out.println("Player 2: " + player2Wins);
            }
            String player1Attack = getAttack();
            String player2Attack = getAttack();

            if (player1Attack.equals("Rock")) {
                switch (player2Attack) {
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
            if (player1Attack.equals("Scissors")) {
                switch (player2Attack) {
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
            if (player1Attack.equals("Spock")) {
                switch (player2Attack) {
                    case "Paper":
                        System.out.println("Player 2s Paper disproves Player 1s Spock");
                        player2Wins++;
                        break;
                    case "Lizard":
                        System.out.println("Player 2s Lizard poisons Player 1s Spock");
                        player2Wins++;
                        break;
                    case "Scissors":
                        System.out.println("Player 1 Spock smashes Player 2s Scissors");
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
            if (player1Attack.equals("Lizard")) {
                switch (player2Attack) {
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
            if (player1Attack.equals("Paper")) {
                switch (player2Attack) {
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
            if (player1Wins == 4){
                noWinner = false;
                System.out.println("Player 1 Wins!!!!");
            }
            if (player2Wins == 4){
                noWinner = false;
                System.out.println("Player 2 Wins!!!!");
            }

        }
    }

    public String getAttack() {
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
