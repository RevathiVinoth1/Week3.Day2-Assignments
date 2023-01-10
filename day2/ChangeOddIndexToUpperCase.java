package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
				  
		 String test = "changeme";
		 //String upper="";
		 //String lower="";
		// char[] ab = test.toCharArray(); 
		 
		 for (int i = 0; i < test.length(); i++) {
			
			 if(i%2!=0) {
				 //upper+=Character.toUpperCase(test.toCharArray()[i]);
				 System.out.print(Character.toUpperCase(test.toCharArray()[i]));
				 //System.out.println(test.toUpperCase());
			 }
			
			 else {
				// lower += Character.toLowerCase(test.toCharArray()[i]);
				 System.out.print(Character.toLowerCase(test.toCharArray()[i]));
				 //System.out.println(test.toLowerCase());
	            }	 
		}
			 //System.out.println("UpperCase of Odd Index String is: "); 
		 }

		
	}


