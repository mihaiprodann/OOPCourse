public class Card implements Comparable{
    public final Rank rank;
    public final Suit suit;
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Object o) {
        Card card1 = (Card) this;
        Card card2 = (Card) o;
        int suitComparison = card1.getSuit().compareTo(card2.getSuit());
        if (suitComparison == 0)
            return card1.getRank().compareTo(card2.getRank());
        return suitComparison;
    }

    enum Rank{
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KNIGHT, QUEEN, KING
    }
    enum Suit{
        CLUBS, DIAMONDS, HEARTS, SPADES
    }
    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
