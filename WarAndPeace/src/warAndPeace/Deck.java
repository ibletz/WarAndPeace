package warAndPeace;
import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author I.BletzFuller
 *
 */
public class Deck {
	
	private final int DECKSIZE = 52;
	private Random randInt = new Random();
		// create arrayList for deck
	private ArrayList<Card> deck = new ArrayList<Card>(DECKSIZE);
		// create arrayList for drawn cards
	private ArrayList<Card> drawnCards = new ArrayList<Card>(DECKSIZE);	
						
		//default constructor
	public Deck() {
		for (CardSuit suit : CardSuit.values()) 
			for(CardValue val : CardValue.values())
				deck.add(new Card(val,suit)); //for each value and each suit, create a card
	}
	
	public void printDeck() {
		int count = 1;
			// for every card in this deck, print the card
		System.out.println("Here is the Deck:");
		for (Card thisCard : this.deck) { 
			System.out.println("Card " + count + ": " + thisCard.toString());
			count++;
		}
	}
		// return number of cards left in deck
	public int cardsLeft() { return deck.size(); }
		// return number of cards already drawn
	public int cardsDrawn() { return drawnCards.size(); }
	
		// returns all the cards to the deck from the drawn pile
	public void reShuffle() {
		deck.addAll(drawnCards);
		System.out.println("Out of cards, reshuffling...");
		drawnCards.clear();
	}


	public Card draw() {
			// check if there are any cards left. If not, reshuffle the deck.
		if(deck.size() == 0)
			reShuffle();

		Card newCard;
			// pick an integer between 0 and the number of remaining cards in the deck
		int nextCard = randInt.nextInt(deck.size());
			// assign new card to the value of the card in deck
		newCard = deck.get(nextCard);
			// remove the card from the deck
		deck.remove(newCard);
			// add the card to the deck of drawn cards
		drawnCards.add(newCard);
			// return the newly drawn card
		return newCard;

	}
}