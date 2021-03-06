package lv.rigacoding.school.game;
import java.util.Scanner;

import lv.rigacoding.school.players.ComputerPlayer;
import lv.rigacoding.school.players.HumanPlayer;
import lv.rigacoding.school.players.Player;

public class Game {

	Player player1;
	Player player2;
	Board board;
	Scanner scanner;
	int player1wins = 0;
	int player2wins = 0;
	int draws = 0;
	
	public Game() {
		board = new Board();
		scanner = new Scanner(System.in);
		System.out.println("How many Homo Sapiens players will play?");
		int numberOfHumanPlayers = scanner.nextInt();
		
		if(numberOfHumanPlayers == 0) {
			player1 = new ComputerPlayer(board);
			player2 = new ComputerPlayer(board);
		}
		else if(numberOfHumanPlayers == 1) {
			player1 = new HumanPlayer(board);
			player2 = new ComputerPlayer(board);
		}
		else {
			player1 = new HumanPlayer(board);
			player2 = new HumanPlayer(board);
		}
		
		
	}
	
	public void playGame() {
		
		do {
			playRound();
			System.out.println("Another try? Y-yes, N-nop: ");
			
		} while(scanner.next().toUpperCase().equals("Y"));
	
	}
	public void playRound() {
		
		board.initBoard();
		board.printGameBoard();
		
		
		while(gameStatus() == GameStatus.GAME_ONGOING) {
			int[] rowandCol0 = player1.makeMove();
			board.makeMove("X", rowandCol0[0], rowandCol0[1]);
			board.printGameBoard();
			
			if(!(gameStatus() == GameStatus.GAME_ONGOING)) break;
			
			int[] rowandCol1 = player2.makeMove();
			board.makeMove("O", rowandCol1[0], rowandCol1[1]);
			board.printGameBoard();
		}
		switch(gameStatus()) {
			case PLAYER_1_WINS:
				System.out.println("Player1 wins!");
				player1wins++;
				break;
			case PLAYER_2_WINS:
				System.out.println("Player2 wins!");
				player2wins++;
				break;
			case DRAW:
				System.out.println("It's a draw");
				draws++;
				break;
		}
		System.out.println("Wins: Player1=" + player1wins + " Player2=" + player2wins + " Draws=" + draws);
		
	}
	
	private GameStatus gameStatus() {
		if(board.hasPlayerWon("X")) {
			return GameStatus.PLAYER_1_WINS;
		}
		else if(board.hasPlayerWon("O")) {
			return GameStatus.PLAYER_2_WINS;
		}
		else if(board.isDraw()) {
			return GameStatus.DRAW;
		}
		else {
			return GameStatus.GAME_ONGOING;
		}
	}
	
	
}
