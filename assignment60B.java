package MyPackage;
import java.util.*;

public class assignment60B {
	int result,sum;
	
	
	int repeat(int num,int i) {
			
			
				if(i==0) {
					return 1;
				}
				else if(i==1) {
					return 1;
				}
				else {
			result=repeat(num,i-1)+(repeat(num,i-2))+1;
			return result;
			}
	}
 public static void main(String args[]) {
	 int i=0;
	 assignment60B myobj=new assignment60B();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of elements:");
	 int num=sc.nextInt();
	 myobj.repeat(num,i);
	 for(i=0;i<num;i++) {
		 System.out.println("n["+i+"]="+myobj.repeat(num,i));
	 }
 }
}
