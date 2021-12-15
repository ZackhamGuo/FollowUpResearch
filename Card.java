
public class Card {
	private final Face face;
	private final Suit suit;
	
	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	/**
	 * @return the face
	 */
	public Face getFace() {
		return face;
	}

	/**
	 * @return the suit
	 */
	public Suit getSuit() {
		return suit;
	}
	
	@Override
	public String toString() {
		return this.face + " of " + this.suit;
	}
}
