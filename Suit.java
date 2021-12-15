
public enum Suit {
	HEART("Heart"),
	DIAMOND("Diamond"),
	SPADE("Spade"),
	CLUB("Club");
	
	private String suitString;
	
	private Suit(String suitString) {
		this.suitString = suitString;
	}
	
	@Override
	public String toString() {
		return this.suitString;
	}
}
