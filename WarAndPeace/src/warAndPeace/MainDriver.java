package warAndPeace;

/**
 * Plays the card game War for a set number of hands.
 * The card game War simply compares two drawn cards and declares a winner
 * based on the face value of each card. After a set amount of hands are played
 * between two players, their scores are compared and an overall winner is declared.
 * @author I.BletzFuller
 *
 */
public class MainDriver {

	static final int HANDS = 52;
	
	public static void main(String[] args) {
			
		Deck player1 = new Deck();
		Deck player2 = new Deck();
		
		int player1Score = 0, player2Score = 0;
		
		System.out.println("Beginning 52 hands of WAR");
		System.out.println("-------------------------------");
		
		for (int i=0;i<HANDS;i++) {
			Card p1Card = player1.draw();
			Card p2Card = player2.draw();
			System.out.println("Player 1: " + p1Card.toString());
			System.out.println("Player 2: " + p2Card.toString());
			if(p1Card.winner(p2Card)) {
				System.out.println("Player 1 wins hand " + (i+1) + "\n");
				player1Score++;
			} else {
				System.out.println("Player 2 wins hand " + (i+1) + "\n");
				player2Score++;
			}
		}
		
		System.out.printf("Final score: Player 1--%d; Player 2--%d", player1Score, player2Score);
		if(player1Score > player2Score)
			System.out.println("\nPlayer 1 wins");
		else
			System.out.println("\nPlayer 2 wins");
	}
}