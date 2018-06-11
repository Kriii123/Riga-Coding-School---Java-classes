import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input number: ");
		int number = scanner.nextInt();

		// Math.pow(skaitlis, pakāpe); - ja daudz pakāpes.

		for (int i = 1; i <= number; i++) {
			System.out.println("Cube of the " + i + " is " + (i * i * i));
		}

		System.out.print("Input number: ");
		int pyramid = scanner.nextInt();

		for (int rinda = 1; rinda <= pyramid; rinda++) {
			for (int spogulis = 1; spogulis <= pyramid - rinda; spogulis++) {
				System.out.print(" ");
			}
			for (int kolonna = 1; kolonna <= rinda; kolonna++) {
				System.out.print(" " + rinda);
			}
			System.out.println();
		}

		System.out.print("Input word: ");
		String palindroms = scanner.next();

		char[] wordArr = palindroms.toCharArray();
		char[] reverseArr = new char[wordArr.length];

		int reverseArrIndex = 0;
		for (int s = (wordArr.length - 1); s >= 0; s--) {
			reverseArr[reverseArrIndex] = wordArr[s];
			reverseArrIndex++;

		}
		boolean isPalindrome = true;
		for (int s = 0; s < wordArr.length; s++) {
			if (wordArr[s] != reverseArr[s]) {
				System.out.println("Nav polindroms");
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("ir palindroms");
		}

		/*
		 * boolean isPalindrome = true; for(int i = 0; i < palindroms.length(); i++) {
		 * if(palindroms.charAt(i) != palindroms.charAt(palindroms.length()-(i+1))) {
		 * 
		 * } }
		 */

		// vieglākais variants -->

		/*
		 * String mirror = new StringBuilder(palindroms).reverse().toString();
		 * 
		 * if(palindroms.equals(mirror)) { System.out.println(palindroms + " -> true");
		 * 
		 * } else { System.out.println(palindroms + " -> false"); }
		 */
		System.out.print("Input number 1: ");
		int number1 = scanner.nextInt();
		System.out.print("Input number 2: ");
		int number2 = scanner.nextInt();

		String PrimeNumbers = "";
		for (int krr = number1; krr <= number2; krr++) {
			if (krr == 2 || krr == 3 || krr == 5 || krr == 7) {
				System.out.print(krr + " ");
				continue;
			} else if (krr % 2 == 0 || krr % 3 == 0 || krr % 5 == 0 || krr % 7 == 0 || krr == 1) {
				continue;
			}
			System.out.print(krr + " ");

			/*
			 * int dalitajs = 0; for(number = krr; number >=1; number--) { if(krr%number ==
			 * 0) { dalitajs = dalitajs+1;
			 * 
			 * } } if(dalitajs == 2) { PrimeNumbers = PrimeNumbers + krr + " "; }
			 * 
			 * } System.out.println("From "+ number1 + " to "+ number2 +
			 * "prime numbers are: " + PrimeNumbers);
			 */

		}

	}
}
