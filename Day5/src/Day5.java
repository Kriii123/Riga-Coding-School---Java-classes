import java.util.ArrayList;
import java.util.Arrays;

public class Day5 {

	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("this","is","lots","of","fun","for","every","Java","Programmer"));
		ArrayList<String> arrayList2 = new ArrayList<>();
		for(int i=0;i<arrayList1.size();i++)
		{
			String str = arrayList1.get(i);
			if(str.length() == 4)
			{
				arrayList2.add("****");
				
				//System.out.print(" ****, " + str +", ");
			}
		
			arrayList2.add(str); //turpina aiz if un ieliek to pašu elementu
				//System.out.print(str + ", ");
			
		}
		
		for(String zv:arrayList2)
		{
			System.out.print(zv + ", ");
		}
		System.out.println();
		
		
		ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(1,5,4,2,3,1,5,2,3,1));
		
		ArrayList<Integer> arrayList4 = new ArrayList<>();
		
		for(int i=0;i<arrayList3.size();i++)
		{
			int number = arrayList3.get(i);
			boolean contains = arrayList4.contains(number);
			if(!contains)
			{
				
				arrayList4.add(number);
				
			}
			
			/*int skaitlis1 = arrayList3.get(i);
			boolean isDublicate = false;
			
			for(int j=0;j<arrayList4.size();j++)
			{
				int skaitlis2 = arrayList4.get(j);
				
				if(skaitlis1==skaitlis2)
				{
					isDublicate=true;
					
				}
				
				
			}
			if(!isDublicate)
			{
				arrayList4.add(skaitlis1);
				
			}*/
		}
		for(Integer aaa: arrayList4)
		{
			System.out.print(aaa + " ");
		}

	}

}
