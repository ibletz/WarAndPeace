package warAndPeace;

public class MainDriver {

	static final int HANDS = 52;
	
		
	public static void main(String[] args) {
		
		String whatCard;
		boolean isWinner;
		
		Card newCard1 = new Card(CardValue.Three,CardSuit.Hearts);
		Card newCard2 = new Card(CardValue.Three,CardSuit.Clubs);
		
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
		
		
		
		
/*
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		
		// TODO: gameplay
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
*/		
		
	}

}