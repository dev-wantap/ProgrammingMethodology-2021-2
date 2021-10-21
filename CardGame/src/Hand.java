public class Hand {

    private Card[] hand;
    private int numberOfCards;

    public Hand(int n) {
        hand = new Card[n];
    }

    public boolean receiveCard(Card c) {
        if (numberOfCards < hand.length) {
            hand[numberOfCards] = c;
            numberOfCards += 1;
            return true;
        } else {
            return false;
        }

    }
    public Card removeCard(Card c) {
        if (numberOfCards > 0) {
            int index = (int)(Math.random() * numberOfCards);
            Card card = hand[index];
            for(int i = index+1; i < numberOfCards; i++) {
                hand[i-1] = hand[i];
            }
            numberOfCards -= 1;
            return card;
        } else {
            return null;
        }
    }
}
