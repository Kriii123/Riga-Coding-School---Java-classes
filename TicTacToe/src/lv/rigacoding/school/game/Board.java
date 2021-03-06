package lv.rigacoding.school.game;

public class Board {
	
	String[][] gameBoard;
	
	public Board() {
		gameBoard = new String[][] {{" "," "," "},{" "," "," "},{" "," "," "}};
	}
	
	public void initBoard() {
		for(int i=0;i < gameBoard.length;i++) {
			for(int j=0;j<gameBoard.length;j++) {
				gameBoard[i][j] = " ";
			}
		}
	}
	
	public void printGameBoard() {
		
		for(int i=0;i < gameBoard.length;i++) {
			for(int j=0;j<gameBoard.length;j++) {
				System.out.print("|"+gameBoard[i][j]);
				
			}
			System.out.println("|");
		}
		
	}
	public void makeMove(String str, int row, int column) {
		
		gameBoard[row][column]=str;
		
	}
	public boolean isMoveValid(int row, int column) {
		return gameBoard[row][column].equals(" ");
		
	}
	public boolean hasPlayerWon(String symbol) {
		return isRowWinning(0, symbol) || isRowWinning(1, symbol) || isRowWinning(2, symbol)
				|| isColumnWinning(0, symbol) || isColumnWinning(1, symbol) || isColumnWinning(2, symbol)
				|| isDiagonalWinning(symbol);
	}
	public boolean isDraw() {
		for(int i=0;i < gameBoard.length;i++) {
			for(int j=0;j<gameBoard.length;j++) {
				if(gameBoard[i][j].equals(" ")) {
					return false;
				}
				
			}
		}
		return true;
	}

	private boolean isRowWinning(int row, String symbol) {
		return gameBoard[row][0].equals(symbol)&& gameBoard[row][1].equals(symbol)&&gameBoard[row][2].equals(symbol);
	}
	private boolean isColumnWinning(int column, String symbol) {
		return gameBoard[0][column].equals(symbol)&& gameBoard[1][column].equals(symbol)&&gameBoard[2][column].equals(symbol);
	}
	private boolean isDiagonalWinning(String symbol) {
		return (gameBoard[0][0].equals(symbol)&& gameBoard[1][1].equals(symbol)&&gameBoard[2][2].equals(symbol)) ||
				gameBoard[0][2].equals(symbol)&& gameBoard[1][1].equals(symbol)&&gameBoard[2][0].equals(symbol);
	}

}

