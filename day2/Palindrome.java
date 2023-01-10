package week3.day2;

public class Palindrome {

	
	public static void main(String[] args) {
		
		
		String a="madam";//normal
		String reverse="";
		
		a.length();
		char[] b = a.toCharArray();
		for (int i =b.length-1; i >=0; i--) {
			        
			reverse=reverse+b[i];
		}
			if (reverse.equals(a)) {
				
				System.out.println(a+ " is Palindrome");
			} else {
				System.out.println(a+ " is not Palindrome");
			}
		
		
		
		
		
		
	}
}
