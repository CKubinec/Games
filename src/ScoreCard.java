import java.util.ArrayList;
import java.util.Scanner;

public class ScoreCard {
    private String player1;
    private String player2;
    private ArrayList<String> scoreList;
    Scanner scanner = new Scanner(System.in);

    public ScoreCard(ArrayList<String> scoreList) {
        this.scoreList = scoreList;
    }

    public void rally(){
        int rallyCount = 1;
        int winningPlayer;
        int winningStroke;
        System.out.println("Which player wins rally " + rallyCount +"?");
        System.out.print("1 - Player1\n" +
                        "2-Player2");
        winningPlayer = scanner.nextInt();
        boolean properSelection = true;
        while (properSelection)
        if (winningPlayer == 1){
            System.out.println("How did Player1 win this rally?");
            System.out.print("1. Smash\n" +
                    "2. Slice\n" +
                    "3. Net\n" +
                    "4. Drop\n" +
                    "5. Drive\n");
            winningStroke = scanner.nextInt();
        } else if (winningPlayer == 2){
            System.out.println("How did Player2 win this rally?");
            System.out.print("1. Smash\n" +
                    "2. Slice\n" +
                    "3. Net\n" +
                    "4. Drop\n" +
                    "5. Drive\n");
            winningStroke = scanner.nextInt();
        } else {
            System.out.println("Improper selection");
            properSelection = false;
            System.out.println("Which player wins rally " + rallyCount +"?");
            System.out.print("1 - Player1\n" +
                    "2-Player2");
            winningPlayer = scanner.nextInt();
        }
    }
}
