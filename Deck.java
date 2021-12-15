import java.security.SecureRandom;

public class Deck {
	public static final int DECK_CARD_NUMBER = 52;
	private Card[] cards;
	private int currentCard;
	
	public Deck() {
		cards = new Card[DECK_CARD_NUMBER];
		currentCard = 0;
		int i = 0;
		for(Suit suit : Suit.values())
			for(Face face : Face.values()) {
				cards[i] = new Card(face,suit);
				++i;
			}
	}
	
	public Card dealCard() {
		if (currentCard == 52) {
			return null;
		} else {
			return cards[currentCard++];
		}
	}
	
	public void shuffle() {
		currentCard = 0;
		
		Card tempCard;
		SecureRandom random = new SecureRandom();
		for (int i = 0; i < DECK_CARD_NUMBER; i++) {
			int j = random.nextInt(DECK_CARD_NUMBER);
			tempCard = cards[i];
			cards[i] = cards[j];
			cards[j] = tempCard;
		}
		
	}
}
