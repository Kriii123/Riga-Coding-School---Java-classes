import java.util.ArrayList;
import java.util.Arrays;

public class Day4 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		//Integer - vesels skaitlis
		//Double - peldošā vērtība aiz komata
		//Boolean - true/false
		
		arrayList.add("ABC");
		arrayList.add("DEF");
		arrayList.add("GHI");
		for(String str : arrayList)
		{
			System.out.println(str);
		}
		for(int i = 0; i<arrayList.size(); i++)
		{
			System.out.println(arrayList.get(i));
		}
		
		arrayList.add(3, "ABC");
		
		//arrayList.clear();
		System.out.println("arrayList size is = " + arrayList.size());
	
		//arrayList.remove(0);
		arrayList.remove("ABC");
		for(String str : arrayList)
		{
			System.out.println(str);
		}
		
		
		ArrayList<String> arrayList2 = new ArrayList(Arrays.asList("ZZ","XX","WW"));
		arrayList.addAll(arrayList2);
		for(String str : arrayList)
		{
			System.out.println(str);
		}
		//ja saraksta izmērs ir 0, tad true, citādi false
		boolean empty = arrayList.isEmpty();
		
		
		
		String[] arr= {"ABC","CDE","FGA","CDE","GEA","ABC","ABO"};
		String[] arr2 = new String[arr.length];
		
		int index = 0;
		for(int i = 0; i< arr.length;i++)
		{
			String str = arr[i];
			boolean isDublicate = false;
			for(int j = 0; j<arr2.length;j++)
			{
				String str2 = arr2[j];
				if(str.equals(str2))
				{
					isDublicate = true;
				}
			}
			if(!isDublicate)
			{
				arr2[index] = str;
				index++;
				
			}
			
			
		}
		String[] arr3 = new String[index];
		System.arraycopy(arr2, 0, arr3, 0, index);
		for(String str : arr3)
		{
		
			System.out.print(str + " ");
		/*	if(str != null)
			{
				System.out.println(str);
			}*/
			
			
		}
		System.out.println();
		System.out.println();
		
		ArrayList<String> arrList = new ArrayList();
		arrList.add("aDs");
		arrList.add("add");
		arrList.add("dd");
		arrList.add("eee");
		
		for(int i = 0; i<arrList.size();i++)
		{
			String str = arrList.remove(i);//izņem no saraksta un uztaisa kā mainīgo
			str = str.toUpperCase();
			arrList.add(i, str);
		
		}
		for(String str : arrList)
		{
			System.out.println(str);
		}
		
		ArrayList<Integer> saraksts1 = new ArrayList();
		saraksts1.add(1);
		saraksts1.add(5);
		saraksts1.add(6);
		saraksts1.add(4);
		
		ArrayList<Integer> saraksts2 = new ArrayList();
		saraksts2.add(2);
		saraksts2.add(3);
		
		saraksts1.addAll(saraksts2);
		
		for(int i = 0;i<saraksts1.size();i++)
		{
			int nr = saraksts1.remove(i);
			nr = nr*nr*nr;
			saraksts1.add(i, nr);
			
		}
		for(int i = 0;i<saraksts1.size();i++)
		{
			System.out.println(saraksts1.get(i));
		}
	
		
		

	}

}
