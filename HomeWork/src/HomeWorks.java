import java.util.Scanner;

public class HomeWorks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your name: ");
		String name = scanner.next();
		
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
	
		System.out.println("Hey there " + name + "!");
	
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		
		boolean even = true;
		
		if(number % 2 == 0 ) {
			
			System.out.println("Number is even: " + even);
		}
		else {
			System.out.println("Number is even: " + !even);
		}
		//(number % 2 == 0) - true or false
		
		
		System.out.print("Ievadi 1. skaitli: ");
		int nr1 = scanner.nextInt();
		System.out.print("Ievadi 2. skaitli: ");
		int nr2 = scanner.nextInt();
		
		long startTime = System.currentTimeMillis();
		System.out.println("Summa ir: " + (nr1+nr2));
		System.out.println("Starpība ir: " + (nr1-nr2));
		System.out.println("Dalījums ir: " + (nr1/(double)nr2));
		System.out.println("Dalījuma atlikums ir: " + (nr1%nr2));
		System.out.println("Reizinājums ir: " + (nr1*nr2));
		
		long endTime = System.currentTimeMillis();
		System.out.println("time used is: " + (endTime - startTime) + " miliseconds");

	}

}
