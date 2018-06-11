import java.util.Random;
import java.util.Scanner;

public class Uzdevumi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ievadi 1. skaitli: ");
		int number = scanner.nextInt();

		for (int i = 0; i <= number; i++) {
			System.out.println(number + "x" + i + "=" + number * i);
		}
		
		System.out.println("I have chosen number between 1 and 10, try to guess it.");
		System.out.print("What's your number? ");
		int guess = scanner.nextInt();
		
		
		int num1 = new Random().nextInt(11);
		
		while(guess!= num1)
		{
			System.out.print("Wrong guess, try again: ");
			guess = scanner.nextInt();
			
		
		}
		System.out.println("Correct");
		
		int nr1 = 10;
		int nr2 = 99;
		
		for(int i = 1;i<10; i++ )
		{
			for(int ii = 0;ii < 10; ii++ )
			{
				String divc = String.valueOf(i+""+ii);
				int divcipInt = Integer.valueOf(divc);
				if(divcipInt % 3 ==0) {
				
				int sum = i+ii;
				System.out.println(i+ ""+ii+ "," + i + "+" + ii + "="+sum);
				}
			}
			
		}
		
				
			

	}
}
