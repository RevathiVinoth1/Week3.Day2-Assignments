package week3.day2;

public class Student extends Department {
	public void studentName() {
		System.out.println("Revathi.V");
	}
	public void studentDept() {
		System.out.println("Information Technology");
	}
	public void studentId() {
		System.out.println("8020832");
	}
	public static void main(String[] args) {
		Student stud=new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		stud.department();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
	}
}
