package warAndPeace;

public class TestDriver {
	
	static void cardTest() {
		String whatCard;
		boolean isWinner;
		
		Card newCard1 = new Card(CardValue.Ten,CardSuit.Spades);
		Card newCard2 = new Card(CardValue.Jack,CardSuit.Hearts);
		
		whatCard = newCard1.toString();
		System.out.println("Card 1: " + whatCard);
		
		whatCard = newCard2.toString();
		System.out.println("Card 2: " + whatCard);
		
		System.out.println("\n");
		isWinner = newCard1.winner(newCard2);
		
		if(isWinner)
			System.out.println("Card 1 beats Card 2");
		else
			System.out.println("Card 2 beats Card 1");
		
	}
/*
	public static void main(String[] args) {
		
		
	
		Deck newDeck = new Deck();
			// print the deck
		//newDeck.printDeck();
		System.out.println("\n");
			// draw all cards randomly from the deck
		int count = 0;
		while(count < 208) {
			Card freshCard = newDeck.draw();
			System.out.print(newDeck.cardsDrawn() + ":" + newDeck.cardsLeft());
			System.out.println("\t"+freshCard.toString());
			count++;
		}				
	} */
}

