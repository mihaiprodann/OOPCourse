import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Hand hand = new Hand(5);
        hand.addCard(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        hand.addCard(new Card(Card.Rank.TWO, Card.Suit.HEARTS));
        hand.addCard(new Card(Card.Rank.ACE, Card.Suit.CLUBS));
        hand.addCard(new Card(Card.Rank.KING, Card.Suit.DIAMONDS));
        hand.addCard(new Card(Card.Rank.QUEEN, Card.Suit.SPADES));

        Arrays.sort(hand.hand);
        hand.display();

        hand.deleteCard(Card.Rank.ACE, Card.Suit.CLUBS);
        System.out.println("\n\n\n[After deleting Ace of Clubs]");
        hand.display();
        hand.store("store.txt");
    }
}
