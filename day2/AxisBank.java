package week3.day2;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Your Amount Deposited Successfully");
}
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
		//axis.deposit();
	}
}