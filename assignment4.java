package MyPackage;
import java.util.*;
class john{
	public int mark;
	public void grade() {
		if(mark>=80)
			System.out.println("Grade A");
		else if(mark>=73)
			System.out.println("Grade B+");
		else if(mark>=65)
			System.out.println("Grade B");
		else if(mark>=55)
			System.out.println("Grade C");
		else
			System.out.println("Grade D");
	}
}

public class assignment4 {
	public static void main(String[] args) throws Exception{
		john myobj=new john();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the mark");
		for(int i=0;i<5;i++) {
			myobj.mark = sc.nextInt();
			myobj.grade();
		}
	
}
}
