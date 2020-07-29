package Badminton;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreCard {
    private int player1Score;
    private int player2Score;
    private ArrayList<Integer> player1Wins = new ArrayList<>();
    private ArrayList<Integer> player2Wins = new ArrayList<>();
    private ArrayList<String> winningStrokes = new ArrayList<>();
    private int rallyCount = 0;

    public ScoreCard() {
        player1Score = 0;
        player2Score = 0;
    }


    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }

    public ArrayList<Integer> getPlayer1Wins() {
        return player1Wins;
    }

    public void setPlayer1Wins(ArrayList<Integer> player1Wins) {
        this.player1Wins = player1Wins;
    }

    public ArrayList<Integer> getPlayer2Wins() {
        return player2Wins;
    }

    public void setPlayer2Wins(ArrayList<Integer> player2Wins) {
        this.player2Wins = player2Wins;
    }

    public ArrayList<String> getWinningStrokes() {
        return winningStrokes;
    }

    public void setWinningStrokes(ArrayList<String> winningStrokes) {
        this.winningStrokes = winningStrokes;
    }

    public int getRallyCount() {
        return rallyCount;
    }

    public void setRallyCount(int rallyCount) {
        this.rallyCount = rallyCount;
    }


    public void printScore() {
        System.out.printf("%-10s %1.7s %1.7s %s%n", "Rally #", "Player1", "Player2", "Winning Stroke");
        for (int i = 0; i < rallyCount; i++) {
            System.out.printf("%-10s %5s %7s %10s%n", i, player1Wins.get(i), player2Wins.get(i), winningStrokes.get(i));
        }
    }

    public void printStats() {
        System.out.println("GAME OVER");
        System.out.println("Player 1 had " + maxInARowWins(getPlayer1Wins()) + " points in a row!");
        System.out.println("Player 2 had " + maxInARowWins(getPlayer2Wins()) + " points in a row!");
        System.out.print("Player 1 had ");
        bestStroke(getPlayer1Wins(), getWinningStrokes());
        System.out.print(" this Match which was there max!\n");
        System.out.print("Player 2 had ");
        bestStroke(getPlayer2Wins(), getWinningStrokes());
        System.out.print(" this Match which was there max!\n");
        System.exit(0);
    }

    public int maxInARowWins(ArrayList<Integer> array) {
        int max = 0;
        int currentCount = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != null) {
                currentCount++;
                if (currentCount > max) {
                    max = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return max;
    }

    public void bestStroke(ArrayList<Integer> player, ArrayList<String> winningStrokes) {
        int smash = 0;
        int slice = 0;
        int net = 0;
        int drop = 0;
        int drive = 0;
        String stroke;
        for (int i = 1; i < winningStrokes.size(); i++) {
            if (player.get(i) != null) {
                switch (winningStrokes.get(i)) {
                    case "Smash":
                        smash++;
                        break;
                    case "Slice":
                        slice++;
                        break;
                    case "Net":
                        net++;
                        break;
                    case "Drop":
                        drop++;
                        break;
                    case "Drive":
                        drive++;
                }
            }
        }
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(smash);
        array.add(slice);
        array.add(net);
        array.add(drop);
        array.add(drive);
        int largest = Collections.max(array);
        if (largest == smash) {
            stroke = "Smashs";
        } else if (largest == slice) {
            stroke = "Slices";
        } else if (largest == net) {
            stroke = "Nets";
        } else if (largest == drop) {
            stroke = "Drops";
        } else {
            stroke = "Drives";
        }
        System.out.print(largest + " " + stroke);
    }
}
