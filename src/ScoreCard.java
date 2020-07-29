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
        System.out.print("Which player wins rally " + rallyCount);
        scanner.nextLine();
    }
}
