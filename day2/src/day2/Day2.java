package day2;

import java.util.Scanner;

public class Day2 {
	
	enum Auto{
		AUDI,GOLF,Porche;
	} // šajā klasē varēs izmantot tikai šīs vērtības - 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*int age = 19;
		
		String message = (age >= 18) ? "Vari balsot" : "Nevari balsot";*/
		
		System.out.print("Ievadi 1. skaitli: ");
		int nr1 = scanner.nextInt();
		System.out.print("Ievadi 2. skaitli: ");
		int nr2 = scanner.nextInt();
		
		int summa = nr1+nr2;
		
		if(summa < 10 || summa > 20)
		{
			System.out.println(summa);
		}
		else
		{
			System.out.println(20);
		}
		
		//int summa = (summa > 10 && summa <20) ? 20: summa;
		
		System.out.print("Input letter: ");
		String burts = scanner.next();
		
		burts = burts.toLowerCase();
		char burts2 = burts.charAt(0);
		
		
		if(!Character.isLetter(burts.charAt(0)))
		{
			System.out.println("Tas nav burts!");
		}
		else if(burts2 == 'o')
		{
			System.out.println("divskanis & patskanis");
		}
		else if(burts2 == 'a' || burts2 == 'e' || burts2 == 'i' || burts2 == 'u')
		{
			System.out.println("patskanis");
		}
		else
		{
			System.out.println("līdzskanis");
		}
		

	}

}
