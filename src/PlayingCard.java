public class PlayingCard implements Comparable{


    enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    };

    enum Suit {
        CLUBS, DIAMONDS, SPADES, HEARTS
    };

    private final Rank rank;
    private final Suit suit;

    public PlayingCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
    @Override
    public int compareTo(Object o) {
        PlayingCard other = (PlayingCard) o;
        int suitComparison = this.suit.compareTo(other.suit);
        if (suitComparison != 0) {
            int rankComparison = this.rank.compareTo(other.rank);
            if (rankComparison != 0) {
                return rankComparison;
            }
            return suitComparison;
        }
        return 0;
    }
}
