package week3.day2;

public class LearnOverloading {
	
		public void mul(int a,int b) {
			System.out.println(a*b);
		}
		public void mul(int a,float b,int c) {
			System.out.println(a*b*c);
		}
		public void div(int a,double b) {
			System.out.println(a/b);
		}
		public static void main(String[] args) {
			LearnOverloading learn=new LearnOverloading();
			learn.mul(20,10);
			learn.mul(6, 0.2f, 20);
			learn.div(20, 5);
		}

}
