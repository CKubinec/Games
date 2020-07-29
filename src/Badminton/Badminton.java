package Badminton;

import java.util.Scanner;

public class Badminton {
    ScoreCard scoreCard;
    Scanner scanner = new Scanner(System.in);

    public Badminton(ScoreCard scoreCard) {
        this.scoreCard = scoreCard;
    }

    public void rally() {
        boolean run = true;
        while (run) {
            int winningPlayer;
            int winningStroke;
            String stroke = "";
            if (scoreCard.getRallyCount() == 0){
                scoreCard.getPlayer1Wins().add(scoreCard.getRallyCount(), 0);
                scoreCard.getPlayer2Wins().add(scoreCard.getRallyCount(), 0);
                scoreCard.getWinningStrokes().add(scoreCard.getRallyCount(), "");
                scoreCard.setRallyCount(scoreCard.getRallyCount() + 1);
                rally();
            }
            System.out.println("Which player wins rally " + scoreCard.getRallyCount() + "?");
            System.out.print("1 - Player1\n" +
                    "2 - Player2\n");
            winningPlayer = scanner.nextInt();
            boolean properSelection = false;
            while (!properSelection) {
                if (winningPlayer == 1) {
                    scoreCard.setPlayer1Score(scoreCard.getPlayer1Score() + 1);
                    System.out.println("How did Player1 win this rally?");
                    System.out.print("1. Smash\n" +
                            "2. Slice\n" +
                            "3. Net\n" +
                            "4. Drop\n" +
                            "5. Drive\n");
                    winningStroke = scanner.nextInt();
                    stroke = getStroke(winningStroke);
                    scoreCard.getPlayer1Wins().add(scoreCard.getRallyCount(), scoreCard.getPlayer1Score());
                    scoreCard.getPlayer2Wins().add(scoreCard.getRallyCount(), null);
                    properSelection = true;
                } else if (winningPlayer == 2) {
                    scoreCard.setPlayer2Score(scoreCard.getPlayer2Score() + 1);
                    System.out.println("How did Player2 win this rally?");
                    System.out.print("1. Smash\n" +
                            "2. Slice\n" +
                            "3. Net\n" +
                            "4. Drop\n" +
                            "5. Drive\n");
                    winningStroke = scanner.nextInt();
                    stroke = getStroke(winningStroke);
                    scoreCard.getPlayer1Wins().add(scoreCard.getRallyCount(), null);
                    scoreCard.getPlayer2Wins().add(scoreCard.getRallyCount(), scoreCard.getPlayer2Score());
                    properSelection = true;
                } else {
                    System.out.println("Improper selection");
                    properSelection = false;
                    System.out.println("Which player wins rally " + scoreCard.getRallyCount() + "?");
                    System.out.print("1 - Player1\n" +
                            "2-Player2");
                    winningPlayer = scanner.nextInt();
                }
            }
            scoreCard.getWinningStrokes().add(scoreCard.getRallyCount(), stroke);
            scoreCard.setRallyCount(scoreCard.getRallyCount() + 1);
            scoreCard.printScore();
            if (scoreCard.getPlayer1Score() == 21 || scoreCard.getPlayer2Score() == 21){
                run = false;
            }
        }
        System.out.println("GAME OVER");
        System.out.println("Player 1 had "+ scoreCard.maxInARowWins(scoreCard.getPlayer1Wins()) + " points in a row!" );
        System.out.println("Player 2 had "+ scoreCard.maxInARowWins(scoreCard.getPlayer2Wins()) + " points in a row!" );
        System.out.print("Player 1 had ");
        scoreCard.bestStroke(scoreCard.getPlayer1Wins(), scoreCard.getWinningStrokes());
        System.out.print(" this Match which was there max!\n");
        System.out.print("RockPaperScissors.Player 2 had ");
        scoreCard.bestStroke(scoreCard.getPlayer2Wins(), scoreCard.getWinningStrokes());
        System.out.print(" this Match which was there max!\n");
        System.exit(0);
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
}
