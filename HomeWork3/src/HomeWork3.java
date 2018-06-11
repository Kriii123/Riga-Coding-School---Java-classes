import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1.uzdevums
		int[] array1 = {1,5,2,10,22,105,2,5};
		int index = 0;
		for(int i = 0; i<array1.length;i++)
		{
			
			if(array1[i]<10 || array1[i] > 99)
			{
				array1[index] = array1[i];
				index++;
			}
			
		}
		int[] arr1 = new int[index];
		System.arraycopy(array1, 0, arr1, 0, index);
		int summa1 = IntStream.of(arr1).sum();
		System.out.println(summa1);
		
		//2.uzdevums
		System.out.print("Ieraksti skaitli: ");
		int number = scanner.nextInt();
		
		int[] cikReizes = {1,2,4,6,2,7,8,5,5,3,9,7,2,3,56,3,5,6,4};
		int reizes = 0;
		int index2 = -1;
		for(int i = 0; i<cikReizes.length;i++)
		{
			
			if(number == cikReizes[i])
			{
				reizes++;
				index2 = i;
				System.out.println("Pozīcija masīvā: " + index2);
			}
		}
		System.out.println("Skaitlis masīvā atrodams " + reizes + " reizes.");
		
		//3.uzdevums
		int[] otrsMazakais = {4,6,2,9,7,45,3,56};
		
		
		for(int i = 0; i<otrsMazakais.length;i++)
		{
			Arrays.sort(otrsMazakais);
			
		}
		System.out.println(otrsMazakais[1]);
		
		
		
		//4.uzdevums
		int[] oddEven = {1,4,2,5,13,24,51,6,7,9,11};
		
		int even = 0;
		int odd = 0;
		
		for(int i = 0; i<oddEven.length;i++)
		{
			if(oddEven[i] % 2 == 0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("Even numbers are: " + even);
		System.out.println("Odd numbers are: " + odd);
		
		
		//5.uzdevums
		String[] vienadi1= {"ABC","CDE","EFG","XEQ","SEF"};
		String[] vienadi2= {"WWW","XEQ","EFG","XEQ","AAA"};
		
		for(int i = 0; i<vienadi1.length;i++)
		{
			String str = vienadi1[i];
			
			
			for(int j = 0; j<vienadi2.length;j++)
			{
				String str2 = vienadi2[j];
				if(str.equals(str2))
				{
					System.out.print(vienadi1[i] + " ");
					break; // pārtrauc konkrēto ciklu 
				}
			}
		}
		System.out.print(" -> vienādie elementi");
		System.out.println();
		
		//6.uzdevums
		
		int[] skaitli1 = {2,5,1,3};
		int[] skaitli2 = {4,1,9};
		
		int[] skaitli3 = new int[skaitli1.length + skaitli2.length];
		
		System.arraycopy(skaitli1, 0, skaitli3, 0, skaitli1.length);
		System.arraycopy(skaitli2, 0, skaitli3,	skaitli1.length, skaitli2.length);
		
		for(int skaitli : skaitli3)
		{
			System.out.print(skaitli + " ");
		}
		System.out.println();	
		
		
		//7.uzdevums
		/*int[] augosaSeciba = {2,5,1,3,4,1,9};
		
		for(int i = 0; i< augosaSeciba.length; i++)
		{
			Arrays.sort(augosaSeciba);
			
			
		}
		for(int seciba : augosaSeciba)
		{
			System.out.print(seciba + " ");
		}*/
		
		int[] augosaSeciba2 = {2,5,1,3,4,1,9,0};
		
		for(int i = 0; i< augosaSeciba2.length; i++)
		{
			for(int j=1; j<(augosaSeciba2.length-i);j++)
			{
				if(augosaSeciba2[j-1]>augosaSeciba2[j])
				{
					//jāsamaina vietām
					int temp = augosaSeciba2[j-1];
					augosaSeciba2[j-1] = augosaSeciba2[j];
					augosaSeciba2[j] = temp;
				}
			}
		}
		for(int num:augosaSeciba2)
		{
			System.out.print(num + " ");
		}

	}

}
