import java.lang.reflect.Array;
import java.util.Arrays;

public class Day3 {

	public static void main(String[] args) {
		//masīvus var klonēt
		
		int[] arr = new int[3]; // izveidots tukšs masīvs]
		arr[0] = 1;
		arr[1] = 4;
		arr[2] = 5;
			
		int[] arr2 = arr.clone();
		
		for(int i: arr2)
		{
			System.out.print(i+" ");
		}
		int[] arr3 = {1,3,4,6};
		System.out.println("lenght is " + arr3.length);
		for(int i = 0; i<arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
		
		//int five = 
		
		String[] arr4 = {"1","2","3","5","8","30","15","12","7"};
		for(int i = 0; i<arr4.length;i++)
		{
			String str = arr4[i];
			int a = Integer.parseInt(str);
			
			if(a%3==0&&a%5==0)
			{
				arr4[i] = "FizzBuzz";
			}
			else if(a%3==0)
			{
				arr4[i] = "Fizz";
			}
			else if(a%5==0)
			{
				arr4[i] = "Buzz";
			}
			System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		int[] arr5 = {1,3,5,6,7};
		for(int i = 0; i<arr5.length;i++)
		{
			arr5[i]= arr5[i]*arr5[i]*arr5[i];
			System.out.print(arr5[i] + " ");
		}
		
		int[] arr6 = {0,4,0,7,8,9,0,1,9,0,9,3,0};
		
		int index = 0;
		for(int i = 0; i < arr6.length; i++)
		{
			if(arr6[i] != 0)
			{
				arr6[index] = arr6[i];
				index++;
			}
			
		}
		for(int i = index; i <arr6.length;i++)
		{
			arr6[i] = 0;
			
			
		}
		for(int i = 0; i<arr6.length;i++)
		{
			System.out.print(arr6[i] + " ");
		}
		
		
		
		
	}

}
