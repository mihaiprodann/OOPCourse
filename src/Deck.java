public class Deck {
    private final PlayingCard[] cards;
    private int index = 0;
    public Deck(int length) {
        cards = new PlayingCard[length];
    }

    public Deck() {
        int length = 52;
        cards = new PlayingCard[length];
    }

    public PlayingCard[] getCards() {
        return cards;
    }

    public void addCard(PlayingCard card) {
        cards[index++] = card;
    }

    public PlayingCard removeCard() {
        if(index == cards.length) {
            index--;
        }
        return cards[index--];
    }

    public void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length);
            PlayingCard temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int getHighestCard() {
        int highestCardIndex = 0;
        for (int i = 1; i < cards.length; i++) {
            if (cards[i].compareTo(cards[highestCardIndex]) > 0) {
                highestCardIndex = i;
            }
        }
        return highestCardIndex;
    }
}