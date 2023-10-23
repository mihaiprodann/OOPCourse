import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hand implements Sortable{
    private Card[] hand;
    private int handSize;

    public Hand(int handSize){
        this.handSize = handSize;
        hand = new Card[handSize];
    }

    public int addCard(Card card){
        for(int i = 0; i < handSize; i++){
            if(hand[i] == null){
                hand[i] = card;
                return 1;
            }
        }
        return 0;
    }

    public int deleteCard(Card.Rank rank, Card.Suit suit){
        for(int i = 0; i < handSize; i++){
            if(hand[i].getRank() == rank && hand[i].getSuit() == suit){
                hand[i] = null;
                return 1;
            }
        }
        return 0;
    }

    public void sort(){
        Card temp;
        for(int i = 0; i < handSize; i++){
            for(int j = 0; j < handSize; j++){
                if(hand[i] != null && hand[j] != null){
                    if(hand[i].getRank().ordinal() < hand[j].getRank().ordinal()){
                        temp = hand[i];
                        hand[i] = hand[j];
                        hand[j] = temp;
                    }
                }
            }
        }
    }

    public void display(){
        System.out.println("Your hand:\n-----------------");
        for(int i = 0; i < handSize; i++){
            if(hand[i] != null){
                System.out.print(hand[i] + ", ");
            }
        }
        System.out.println("\n-----------------");
    }
}
