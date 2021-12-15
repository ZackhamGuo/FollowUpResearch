import java.security.SecureRandom;

public class Player {
	private Card[] playerDeck;
	private int playerDeckSize;
	
	public Player() {
		playerDeck = new Card[Deck.DECK_CARD_NUMBER];
		playerDeckSize = 0;
	}
	
	public void addCard(Card card) {
		playerDeck[playerDeckSize++] = card;
	}
	
	public void shuffle() {
		SecureRandom random = new SecureRandom();
		Card tempCard;
		for (int i = 0; i < playerDeckSize; i++) {
			int j = random.nextInt(playerDeckSize);
			tempCard = playerDeck[i];
			playerDeck[i] = playerDeck[j];
			playerDeck[j] = tempCard;
		}
	}
	
	public Card play() {
		if (playerDeckSize == 0) {
			return null;
		} else {
			return playerDeck[--playerDeckSize];
		}
	}
	
	public int getPlayerDeckSize() {
		return playerDeckSize;
	}
}
