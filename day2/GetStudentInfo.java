package week3.day2;

public class GetStudentInfo {
	public void getStudentInfo(int id,String name) {
		System.out.println("The Student ID is: " +id);
		System.out.println("The Student NAME is: " +name);
	}
	public void getStudentInfo(long phonenum,String email) {
		System.out.println("The Student PhoneNumber is: " +phonenum);
		System.out.println("The Student Email is: " +email);
	}
	public void getStudentInfo(float percentage,String result) {
		System.out.println("The Student Percentage is: " +percentage);
		System.out.println("The Student Result is: " +result);
	}
	
	
	public static void main(String[] args) {
		GetStudentInfo get=new GetStudentInfo();
		get.getStudentInfo(032, "Revathi.V");
		get.getStudentInfo(9840693453l , "revathivinoth05@gmail.com");
		get.getStudentInfo(75.5f, "Pass with First Class");
	}

}
