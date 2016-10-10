package warAndPeace;

/**
 * A single playing card.
 * Card objects have a value and a suit, one of the 52 possible cards
 * in a standard deck of playing cards
 * @author I.BletzFuller
 *
 */
public class Card {
	
	private CardValue value;
	private CardSuit suit;
	
	/**
	 * Constructor. Cards must be initialized with a value and a suit
	 * @param value	one of the 13 ranks of standard playing cards (using CardValue Enum)
	 * @param suit	one of the 4 suits of standard playing cards (using CardSuit Enum)
	 */
	public Card(CardValue value, CardSuit suit) {
		this.value = value;
		this.suit = suit;
	}
	/**
	 * Prints the Card object's value and suit in proper format
	 * @return	string object with name of card
	 */
	@Override
	public String toString() {
		return (value + " of " + suit);
	}
	
	/**
	 * Compares two Card objects, and decides which ones is the winner.
	 * Cards are compared by value, then suit to determine which is higher.
	 * Utilizes the compareTo() instance method of the Enum type. 
	 * @param c	card object being compared to card that method is called on.
	 * @return	true if called card is greater than passed card, otherwise false
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