package warAndPeace;

/**
 * 
 * @author I.BletzFuller
 *
 */
public class Card {
	
	private CardValue value;
	private CardSuit suit;
	
	/**
	 * 
	 * @param value
	 * @param suit
	 */
	public Card(CardValue value, CardSuit suit) {
		this.value = value;
		this.suit = suit;
	}
	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return (value + " of " + suit);
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	public boolean winner(Card c) {
			
		if(value.compareTo(c.value) == 0)
			if(suit.compareTo(c.suit) > 0)
				return true; 
			else
				return false;						/* what about a complete tie? */
		else if(value.compareTo(c.value) > 0)
			return true;
		else  
			return false;
	}
}