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
        System.out.println("Which player wins rally " + rallyCount +"?");
        System.out.print("1 - Player1\n" +
                        "2-Player2");
        int selected = scanner.nextInt();
        boolean properSelection = true;
        while (properSelection)
        if (selected == 1){
            System.out.println("How did they win?");
            System.out.print("");
        } else if (selected == 2){

        } else {
            System.out.println("Improper selection");
            properSelection = false;
            System.out.println("Which player wins rally " + rallyCount +"?");
            System.out.print("1 - Player1\n" +
                    "2-Player2");
            selected = scanner.nextInt();
        }
    }
}
