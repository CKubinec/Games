package RockPaperScissors;

public class MainRPS {
    public static void main(String[] args) {
        //Tests the RockPaperScissorLizardSpock game
        Player player1 = new Player();
        Player player2 = new Player();
        RockPaperScissorLizardSpock rockPaperScissorLizardSpock =  new RockPaperScissorLizardSpock(player1, player2);
        rockPaperScissorLizardSpock.play();
    }
}
