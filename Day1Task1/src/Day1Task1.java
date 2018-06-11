import java.util.Scanner;

public class Day1Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ievadi 1. skaitli: ");
		int nr1 = scanner.nextInt();
		System.out.print("Ievadi 2. skaitli: ");
		int nr2 = scanner.nextInt();

		int nr3 = nr1 + nr2;

		System.out.println("Summa ir " + nr3); // vai ieliek iekavās nr1+nr2

		System.out.print("Ievadi 1. skaitli: ");
		int a = scanner.nextInt();
		System.out.print("Ievadi 2. skaitli: ");
		int b = scanner.nextInt();
		System.out.print("Ievadi 3. skaitli: ");
		int c = scanner.nextInt();
		
		//String a = scanner.next();
		//int aInt = Integer.valueOf(b); // konvertācija
		//

		double vid = (a + b + c) / 3.0; // .0 tā lai vadītu aiz komata2, savādāk dalīs ar veselu skaitli
		System.out.println("Vidējais ir " + vid);
	}

}
