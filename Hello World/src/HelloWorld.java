import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		// system.out = console in C#
		
		String abc = "ABC";
		String def = new String("DEF");
		
		//savienošana
		String combineStr = abc.concat(def); //savieno
		String combinedStr1 = abc + def; // otrs variants
		int lenght = abc.length();   //3
		//pārbauda vai ir vienādi
		boolean abcEq0 = abc.equals("def");   //false
		boolean abcEq1 = abc == "def";         //false
		
		boolean c = "ABC".equalsIgnoreCase("abc"); //true - neskatās uz burtu izmēru
		
		
		
		//pārbauda kas ir char masīvā 1. pozīcijā
		char charAt0 = abc.charAt(1); //A
		
		boolean isEmpty0 = "".isEmpty(); //vai ir tukša vieta - true
		
		System.out.println(combineStr);
		
		
		System.out.print("Hello");
		System.out.println("Hello World!");
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {4,5,6};
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		
		for(int j = 0; j<3; j++) {
		 System.out.println("[" + arr2[j] + "]");
		}
		//vienmēr būs jāraksta, ja grib prasīt vērtību
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input string");
		String str = scanner.next();
		System.out.println("Input int:");
		int in = scanner.nextInt();
		
		
		System.out.println("Input value: " + str + in);
		
		
	
	}
	
	

}
