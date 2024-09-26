package MyPackage;

public class overloading {
	void display(int num1,int num2) {
		System.out.println("Num1 is printed:"+num1);
	}
	void display(double num1,int num2) {
		System.out.println("Num2 is printed:"+num2);
	}
	public static void main(String[] args ) {
		overloading myobj=new overloading();
		myobj.display(8, 9);
		myobj.display(7.9,9);
	}
}
