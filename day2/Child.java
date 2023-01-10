package week3.day2;

public class Child extends Parent{
	 public void sandhouse() {
		 System.out.println("It is a Sand House");
	 }
	// public void bangla() {
		//	System.out.println("It is Big House");
	 //}
	 public static void main(String[] args) {
		Child child=new Child();
		child.appartment();
		child.beachhouse();
		child.individual();
		child.bangla();
		child.small();
		child.sandhouse();
	}
}
