package Badminton;

public class MainBadminton {

    public static void main(String[] args) {
        //Tests that classes are working properly
        ScoreCard scoreCard = new ScoreCard();
        Badminton badminton = new Badminton(scoreCard);
        badminton.rally();
    }
}
