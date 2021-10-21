public class CardDeck {

    private Card[] deck = new Card[52];
    private int count;

    public CardDeck() {
        createDeck();
    }
    private void createDeck() {
        createSuit(Card.SPADES);
        createSuit(Card.HEART);
        createSuit(Card.DIAMOND);
        createSuit(Card.CLUB);
    }

    private void createSuit(String suit) {
        for(int i = 1; i <= 13; i += 1) {
            deck[count] = new Card(suit, i);
            count += 1;
        }
    }

    public boolean moreCard() {
        if (count > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public Card newCard() {
        if (!moreCard()) {
            createDeck();
        }
        int index = (int)(Math.random() * count);
        Card card = deck[index]; // return할 카드 기억
        for(int i = index+1; i < count; i++) {
            deck[i-1] = deck[i];
        }
        count -= 1;
        return card;
    }
}
