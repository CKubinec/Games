import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissorLizardSpock {

    public RockPaperScissorLizardSpock() {

    }

    public void play(){
        int player1Wins = 0;
        int player2Wins = 0;
        boolean noWinner = true;
        while(noWinner){
            String player1Attack = getAttack();
            String player2Attack = getAttack();

            if(player1Attack.equals("Rock")){
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
                }
            }
        }
    }

    public String getAttack() {
        int random = ThreadLocalRandom.current().nextInt(1,6);
        String attack;
        switch (random) {
            case 1: attack = "Rock";
            break;
            case 2: attack = "Paper";
            break;
            case 3: attack = "Scissors";
            break;
            case 4: attack = "Lizard";
            break;
            case 5: attack = "Spock";
            break;
            default: attack = "Nothing";
        }
        return attack;
    }
}
