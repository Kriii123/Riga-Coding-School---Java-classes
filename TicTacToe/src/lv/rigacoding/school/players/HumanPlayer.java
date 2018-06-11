package lv.rigacoding.school.players;
import java.util.Scanner;

import lv.rigacoding.school.game.Board;

public class HumanPlayer implements Player {

	private Scanner scanner;
	private Board board;
	
	public HumanPlayer(Board brd) {
		scanner = new Scanner(System.in);
		board=brd;
	}
	
	@Override
	public int[] makeMove() {
		
		System.out.println("Your move");
		int[] rowAndColumn = inputRowAndColumn();
		int row = rowAndColumn[0];
		int column = rowAndColumn[1];
		
		
		while(!(ColumnAndRowInRange(row, column) && board.isMoveValid(row, column))) {
			
			if(!ColumnAndRowInRange(row, column)) {
				System.out.println("Comon bro, values --> 0-2!!!!");
			}
			else {
				System.out.println("This cell is already taken");
				
			}
			
			rowAndColumn = inputRowAndColumn();
			row=rowAndColumn[0];
			column=rowAndColumn[1];
			
		}
		
		return rowAndColumn;
	}
	private int[] inputRowAndColumn() {
		System.out.println("Input row (0-2):");
		int row = scanner.nextInt();
		System.out.println("Input column (0-2):");
		int column = scanner.nextInt();
		return new int[] {row,column};
	}

	private boolean ColumnAndRowInRange(int row, int column) {
		return row>= 0&&row<=2&& column>=0 &&column<=2;
	}

	
	
}
