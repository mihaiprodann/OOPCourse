public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand(5);
        hand.addCard(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        hand.addCard(new Card(Card.Rank.TWO, Card.Suit.DIAMONDS));
        hand.addCard(new Card(Card.Rank.FOUR, Card.Suit.HEARTS));
        hand.addCard(new Card(Card.Rank.SEVEN, Card.Suit.DIAMONDS));
        hand.addCard(new Card(Card.Rank.FIVE, Card.Suit.CLUBS));
        hand.display();
        hand.sort();
        hand.display();
    }
}
