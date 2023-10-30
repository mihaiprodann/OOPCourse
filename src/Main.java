public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // fill the deck with cards
        for (PlayingCard.Suit suit : PlayingCard.Suit.values()) {
            for (PlayingCard.Rank rank : PlayingCard.Rank.values()) {
                deck.addCard(new PlayingCard(rank, suit));
            }
        }

        deck.shuffle();

        // Instantiate 4 players
        Deck[] player = {
            new Deck(13),
            new Deck(13),
            new Deck(13),
            new Deck(13)
        };

        // Deal the cards
        for (int i = 0; i < 13; i++) {
            for (Deck value : player) {
                value.addCard(deck.removeCard());
            }
        }

        boolean isGameOver = false;
        int round = 1;
        while(!isGameOver) {
            for (Deck item : player) {
                Deck currentRoundDeck = new Deck(4);

                System.out.println("Round " + round++ + ":");
                for (int cardIndex = 0; cardIndex < 4; cardIndex++) {
                    currentRoundDeck.addCard(item.removeCard());
                    System.out.println("Player " + (cardIndex + 1) + " plays " + currentRoundDeck.getCards()[cardIndex].getRank() + " of " + currentRoundDeck.getCards()[cardIndex].getSuit());
                }

                int highestCardIndex = currentRoundDeck.getHighestCard();
                System.out.println("-----------------------\nPlayer " + (highestCardIndex + 1) + " wins the round\n-----------------------\n");
            }

        }
    }
}