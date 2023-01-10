package week3.day2;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("The Desktop Size is 28 inches");
	}

	public static void main(String[] args) {
	Desktop desk=new Desktop();
	desk.computerModel();
	desk.desktopSize();

	}

}
