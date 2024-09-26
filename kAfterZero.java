package MyPackage;
import java.util.*;

public class kAfterZero {
	 static int add(int k,int a[]) {
		 int i = 0;
		if(i<k) {
			if(a[i]==1&&add());
		}
	    return 0;	 
	 }
 public static void main(String[] args) {
	 kAfterZero myobj=new kAfterZero(); 
	 int[] a = {0,1,1,0};
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter k:");
	 int k=sc.nextInt();
	 myobj.add(k,a);
 }
}
