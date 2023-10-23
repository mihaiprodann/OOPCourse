public class Card {
    public final Rank rank;
    public final Suit suit;
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
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
