public class Dealer {
    CardDeck deck;

    public Dealer() {
        deck = new CardDeck();
    }

    void dealTo(CardPlayerBehavior p) {

    }

    void dealOneTo(CardPlayerBehavior p) {
        Card c = deck.newCard();
        p.receiveCard(c);
    }
}
