import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("Enter an operator: ");
		String op = scanner.next();
		
		System.out.print("Enter in second number: ");
		double num2 = scanner.nextDouble();
		
		if(op.equals("+")) {
			System.out.println("result: " + (num1+num2));
		}
		else if(op.equals("-")) {
			System.out.println("result: " + (num1-num2));
		}
		else if(op.equals("/")) {
			System.out.println("result: " + (num1/num2));
		}
		else if(op.equals("*")) {
			System.out.println("result: " + (num1*num2));
		}
		else {
			System.out.println("Invalid operator!");
		}
		
		

	}

}
