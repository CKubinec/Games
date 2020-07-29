package Badminton;

import java.util.Scanner;

/**
 * The type Badminton.
 *
 * @author Craig Kubinec ID:3433193
 * @date July 29 2020
 */
public class Badminton {
    /**
     * The Score card.
     */
    ScoreCard scoreCard;
    /**
     * The Scanner.
     */
    Scanner scanner = new Scanner(System.in);

    /**
     * Instantiates a new Badminton match.
     *
     * @param scoreCard the score card
     */
    public Badminton(ScoreCard scoreCard) {
        this.scoreCard = scoreCard;
    }

    /**
     * Rally. Where the user will be able to enter all the data for the game there playing
     */
    public void rally() {
        boolean run = true;
        while (run) {
            int winningPlayer;
            int winningStroke;
            String stroke = "";
            if (scoreCard.getRallyCount() == 0) {
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
            if (scoreCard.getPlayer1Score() == 21 || scoreCard.getPlayer2Score() == 21) {
                run = false;
            }
        }
        scoreCard.printStats();
    }

    /**
     * Gets the type of stroke they used.
     *
     * @param number the number the user inputted
     * @return the type of stroke
     */
    public String getStroke(int number) {
        String stroke;
        switch (number) {
            case 1:
                stroke = "Smash";
                break;
            case 2:
                stroke = "Slice";
                break;
            case 3:
                stroke = "Net";
                break;
            case 4:
                stroke = "Drop";
                break;
            case 5:
                stroke = "Drive";
                break;
            default:
                stroke = "None";
                break;
        }
        return stroke;
    }
}
