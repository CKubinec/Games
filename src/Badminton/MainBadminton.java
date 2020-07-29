package Badminton;

public class Main {

    public static void main(String[] args) {
        ScoreCard scoreCard = new ScoreCard();
        Badminton badminton = new Badminton(scoreCard);
        badminton.rally();
    }
}
