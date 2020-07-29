import java.util.concurrent.ThreadLocalRandom;

public class RockPaperScissorLizardSpock {

    public RockPaperScissorLizardSpock() {

    }

    public void play(){
        int player1Wins;
        int player2Wins;
        boolean noWinner = true;
        while(noWinner){
            String player1Attack = getAttack();
            String player2Attack = getAttack();
            
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
