package Badminton;

public class MainBadminton {

    public static void main(String[] args) {
        //Tests the Badminton game w/ scorecard. *USER ENTERS DATA*
        ScoreCard scoreCard = new ScoreCard();
        Badminton badminton = new Badminton(scoreCard);
        badminton.rally();
    }
}
