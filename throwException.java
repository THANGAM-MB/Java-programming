package MyPackage;
import java.lang.*;
public class throwException {
		//System.out.println("hio");
		public static void valid(int age) {
		if(age<18) {
		  throw new IndexOutOfBoundsException("Candidate not eligible");
		}
		else {
				System.out.println("Candidate Eligible");
		}
	}
		public static void main(String[] args) {
			valid(19);
			//valid(23);
			valid(10);
			//valid(97);
			System.out.println("Code Executed Sucessfully");
			
		}
}
