package warAndPeace;

public class TestDriver {
	
	
	
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
	}
}
