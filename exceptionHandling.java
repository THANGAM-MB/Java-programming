package MyPackage;
import java.lang.*;

public class exceptionHandling {
	public static void main(String args[]) {
		int data=10;
		int[] a=new int[5];
		try {
		try {
		System.out.println("array of 4 is:"+a[4]);
		System.out.println("array of 10 is:"+a[10] );
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);		
		}
		try {
		double div=data/0;
		System.out.println("div:"+div);
		}
		
		catch(ArithmeticException e ){
			System.out.println(e);
		}}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Exception Cleared");
		}
	}
	

}
