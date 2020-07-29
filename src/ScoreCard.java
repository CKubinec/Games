import java.util.ArrayList;
import java.util.Scanner;

public class ScoreCard {
    private int player1Score;
    private int player2Score;
    private ArrayList<Integer> player1Wins = new ArrayList<>();
    private ArrayList<Integer> player2Wins = new ArrayList<>();
    private ArrayList<String> winningStrokes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    private int rallyCount = 0;

    public ScoreCard() {
        player1Score = 0;
        player2Score = 0;
    }


    public void rally() {
        while (player1Score != 21 || player2Score != 21) {
            int winningPlayer;
            int winningStroke;
            String stroke = "";
            if (rallyCount == 0){
                player1Wins.add(rallyCount, 0);
                player2Wins.add(rallyCount, 0);
                winningStrokes.add(rallyCount, "");
                rallyCount++;
                rally();
            }
            System.out.println("Which player wins rally " + rallyCount + "?");
            System.out.print("1 - Player1\n" +
                    "2 - Player2\n");
            winningPlayer = scanner.nextInt();
            boolean properSelection = false;
            while (!properSelection) {
                if (winningPlayer == 1) {
                    player1Score++;
                    System.out.println("How did Player1 win this rally?");
                    System.out.print("1. Smash\n" +
                            "2. Slice\n" +
                            "3. Net\n" +
                            "4. Drop\n" +
                            "5. Drive\n");
                    winningStroke = scanner.nextInt();
                    stroke = getStroke(winningStroke);
                    player1Wins.add(rallyCount, player1Score);
                    player2Wins.add(rallyCount, null);
                    properSelection = true;
                } else if (winningPlayer == 2) {
                    player2Score++;
                    System.out.println("How did Player2 win this rally?");
                    System.out.print("1. Smash\n" +
                            "2. Slice\n" +
                            "3. Net\n" +
                            "4. Drop\n" +
                            "5. Drive\n");
                    winningStroke = scanner.nextInt();
                    stroke = getStroke(winningStroke);
                    player1Wins.add(rallyCount, null);
                    player2Wins.add(rallyCount, player2Score);
                    properSelection = true;
                } else {
                    System.out.println("Improper selection");
                    properSelection = false;
                    System.out.println("Which player wins rally " + rallyCount + "?");
                    System.out.print("1 - Player1\n" +
                            "2-Player2");
                    winningPlayer = scanner.nextInt();
                }
            }
            winningStrokes.add(rallyCount, stroke);
            rallyCount++;
            printScore();
        }
    }

    public String getStroke(int number){
        String stroke;
        switch (number){
            case 1: stroke = "Smash";
                break;
            case 2: stroke = "Slice";
                break;
            case 3: stroke = "Net";
                break;
            case 4: stroke = "Drop";
                break;
            case 5: stroke = "Drive";
                break;
            default: stroke = "None";
                break;
        }
        return stroke;
    }

    public void printScore(){
        System.out.printf("%-10s %1.7s %1.7s %s%n", "Rally #", "Player 1", "Player 2", "Winning Stroke");
        for (int i = 0; i < rallyCount; i++) {
            System.out.printf("%-10s %5s %5s %10s%n", i, player1Wins.get(i), player2Wins.get(i), winningStrokes.get(i));
        }
    }
}
