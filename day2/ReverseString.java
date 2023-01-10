package week3.day2;


public class ReverseString {

	public static void main(String[] args) {
		
		String name="RevathiVinoth";
		
		char[] charArray = name.toCharArray();
		
		System.out.println("Name in Reverse:");
		
		for (int i = charArray.length-1; i >=0 ; i--) 
		{
			System.out.print(charArray[i]);
			
		}
	}

}
