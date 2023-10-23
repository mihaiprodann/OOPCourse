public class Deck {
    private PlayingCard[] cards;

    public Deck() {
        cards = new PlayingCard[52];
        int i = 0;
        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
            for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
                cards[i++] = new PlayingCard(rank, suit);
            }
        }
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            PlayingCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

}
