public class Card {

    public static final String SPADES = "Spades";
    public static final String HEART = "Heart";
    public static final String DIAMOND = "Diamond";
    public static final String CLUB = "Club";

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;

    private String suit;
    private int rank;

    public Card(String s, int r) {
        suit = s;
        rank = r;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }
}
