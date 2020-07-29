package Badminton;

public class MainBadminton {

    public static void main(String[] args) {
        ScoreCard scoreCard = new ScoreCard();
        Badminton badminton = new Badminton(scoreCard);
        badminton.rally();
    }
}
