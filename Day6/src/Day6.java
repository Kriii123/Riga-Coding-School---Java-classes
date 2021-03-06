import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day6 {
	
	public static int smallestNumber(int skaitlis1, int skaitlis2, int skaitlis3)
	{
		if(skaitlis1<skaitlis2 && skaitlis1<skaitlis3)
		{
			return skaitlis1;
		}
		else if(skaitlis2<skaitlis1 && skaitlis2<skaitlis3)
		{
			return skaitlis2;
		}
		else
		{
			return skaitlis3;
		}
		
	}
	public static double averageArr(int[] masivs)
	{
		double sum = 0.00;
		for(int number:masivs)
		{
			sum = sum + number;
			
		}
		return sum/masivs.length;
		
		
	}
	
	public static boolean isSafePassword(String password)
	{
		if(password.length()<10)
		{
			System.out.println("Password is too short");
			return false;
		}
		int countOfNumbers = 0;
		for(char c : password.toCharArray())
		{
			if(Character.isAlphabetic(c) == true || Character.isDigit(c) == true )
			{
				if(Character.isDigit(c) == true)
				{
					countOfNumbers++;
				}
				
			}
			else
			{
				System.out.println("Invalid Characters in password");
				return false;
			}
			
		}
		if(countOfNumbers<2)
		{
			System.out.println("Not enough digits in password.");
			return false;
		}
		
		System.out.println("Parole ir droša!");
		return true;
		
	}
	
	public static boolean ascending(ArrayList<Integer> list)
	{
		
		int previous = list.get(0);
		for(int i = 1; i<list.size();i++)
		{
		
			if(previous >list.get(i))
			{
				System.out.println("Not increasing.");
				return false;
			}
			previous = list.get(i);
			
			
		}
		
		System.out.println("Is increasing ");
		return true;
		
	}
	public static boolean descending(ArrayList<Integer> list)
	{
		
		int previous = list.get(0);
		
		for(int i = 1; i<list.size();i++)
		{
		
			if(previous <list.get(i))
			{
				System.out.println("Not decreasing.");
				return false;
			}
			previous = list.get(i);
			
			
		}
		System.out.println("Is decreasing ");
		return true;
	}
	
	

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(Arrays.asList(7,6,5,4,3));
		ArrayList list2 = new ArrayList(Arrays.asList(7,6,5,4,3,2));
		ArrayList list3 = new ArrayList(Arrays.asList(1,2,3,4,5));
				
		descending(list1);
		
		ascending(list3);
		
		
		if(ascending(list2))
		{
			System.out.println(list2 + " is increasing");
			
			
		}
		else if(descending(list2))
		{
			System.out.println(list2 + " is decreasing");
		}
		else
		{
			System.out.println(list2 + "Irregular list");
		}
		
		

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println(smallestNumber(6, 3, 6));
		System.out.println(averageArr(new int[] {2,5,8,3,5,7,3}));

		System.out.print("Ieraksti paroli: ");
		String parole = scanner.next();
		
		boolean result = isSafePassword(parole);
		
		//System.out.println(isSafePassword(parole));
		
		
		
		
		
		
	}

}
