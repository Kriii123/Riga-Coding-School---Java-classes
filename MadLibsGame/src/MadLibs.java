import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter color: ");
		String color = scanner.nextLine();
		System.out.print("Enter plural noun: ");
		String pluralNoun = scanner.nextLine();
		System.out.print("Enter celebrity: ");
		String celebrity = scanner.nextLine();
		
		System.out.println();
		
		
		System.out.println("Roses are " + color +" \n" + pluralNoun + " are blue \n" + "I love " + celebrity);
		
		

	}

}
