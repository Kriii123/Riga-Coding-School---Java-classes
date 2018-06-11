
public class Day7 {
	
	public static String combineStrings(String simbols, String simbols2,String simbols3,String simbols4)
	{
		return simbols + simbols2+simbols3+simbols4;
	}
	public static String combineStrings(String simbols, String simbols2,String simbols3)
	{
		return simbols + simbols2+simbols3;
	}
	public static String combineStrings(String simbols, String simbols2)
	{
		return simbols + simbols2;
	}
	
	
	public static String[] reverseArray(String[] arr) {
		String[]arr2 = new String[arr.length];
		int l = arr.length;
		int index =0;
		for(int i = l-1; i>=0;i--) {
			arr2[index] = arr[i];
			index++;
			
		}
		
		return arr2;
		
		
	}
	public static int[] reverseArray(int[] arrInt) {
		int[]arrInt2 = new int[arrInt.length];
		int l = arrInt.length;
		int index =0;
		for(int i = l-1; i>=0;i--) {
			arrInt2[index] = arrInt[i];
			index++;
		}
		return arrInt2;
	}
	
	

	public static void main(String[] args) {
		
		String[]arrStr = new String[] {"AA","CC","DDD"};
		for(String str : arrStr) {
			System.out.print(str + ",");
		}
		System.out.println();
		arrStr=reverseArray(arrStr);
		for(String str:arrStr) {
			System.out.print(str+",");
		}
		System.out.println();
		System.out.println();
		
		int[]arr = new int[] {23,34,45,56,456};
		for(int num : arr) {
			System.out.print(num + ",");
		}
		System.out.println();
		
		arr=reverseArray(arr);
		for(int num:arr) {
			System.out.print(num+",");
		}
		
		
		
		
		//System.out.println(combineStrings("AA","CC","DDD","EEE"));
		//System.out.println(combineStrings("AA","CC","DDD"));
		//System.out.println(combineStrings("AA","CC"));

	}

}
