package lv.rigacoding.school.players;
import java.util.Random;
import java.util.Scanner;

import lv.rigacoding.school.game.Board;

public class ComputerPlayer implements Player {
	
	
	private Board board;
	public ComputerPlayer(Board brd) {
		board = brd;
	}
	
	
	
	@Override
	public int[] makeMove() {
		
		
		
		System.out.println("Computer's move");
		//ja kādā rindā ir jau 2 liekam tajā rindā
		//board klasē var taisīt metodes, vai ir 2 vienādi un viens tukšs
		int row = new Random().nextInt(3);
		int column = new Random().nextInt(3);
		
		while(!board.isMoveValid(row, column)) {
			row = new Random().nextInt(3);
			column = new Random().nextInt(3);
		}
		
		return new int[] {row, column};
	}
	
	

}
