
public class Game {
	public static Result run() {
		Player player1 = new Player();
		Player player2 = new Player();
		Deck deck = new Deck();
		Player currentPlayer = player1;
		Card[] board = new Card[14];
		int boardSize = 0;
		Result result = new Result();
		result.turns = 0;
		
		deck.shuffle();
		for (int i = 0; i < Deck.DECK_CARD_NUMBER/2; i++) {
			player1.addCard(deck.dealCard());
			player2.addCard(deck.dealCard());
		}
		
		while ( (board[boardSize] = currentPlayer.play()) != null) {
			boardSize++;
			
			/*for (int i = 0; i < boardSize; i++) {
				System.out.printf("%15s", board[i]);
			}
			System.out.println();*/
			
			boolean isSuccess = false;
			int successPosition = -1;
			for (int i = 0; i < boardSize-1; i++) {
				if ( (board[i].getFace()).equals(board[boardSize-1].getFace()) ) {
					isSuccess = true;
					successPosition = i;
				}
			}
			
			if (isSuccess) {
				for (int i = successPosition; i < boardSize; i++) {
					currentPlayer.addCard(board[i]);
				}
				boardSize =successPosition;
				currentPlayer.shuffle();
				/*System.out.println("Player1:" + player1.getPlayerDeckSize() + "	Player2:" + player2.getPlayerDeckSize());*/
			}
			
			if (currentPlayer.equals(player1)) {
				currentPlayer = player2;
			} else {
				currentPlayer = player1;
			}
			result.turns++;
		}
		
		if (currentPlayer == player1) {
			result.status = false;
		} else {
			result.status = true;
		}
		
		return result;
	}
}