package MyPackage;
import java.util.*;
import java.lang.Math;

public class polinomial {
	public static void main(String[] args) {
		int arr[]= {3,7,-5,4,3,2,-10,0};
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("x:");
		int x=sc.nextInt();
		for(int i=0;i<arr.length;i=i+2) {
			sum+=arr[i]*Math.pow(x,arr[i+1]);
		}System.out.println(sum);
		
	}

}
