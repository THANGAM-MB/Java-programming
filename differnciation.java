package MyPackage;
import java.util.*;

public class differnciation {
	int sum=0;
	void diff(int arr[],int x) {
		
	for(int i=0;i<arr.length;i+=2) {
		arr[i]=arr[i]*arr[i+1];
		arr[i+1]=arr[i+1]-1;
	}for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}System.out.println("");
	for(int i=0;i<arr.length;i+=2) {
		if(i==0) {
			System.out.print(arr[i]+"x^"+arr[i+1]);
		}
		else if(arr[i]>0) {
			System.out.print("+"+arr[i]+"x^"+arr[i+1]);
		}
		else {
			System.out.print(arr[i]+"x^"+arr[i+1]);
		}
		
	}System.out.println(" ");

	for(int i=0;i<arr.length;i=i+2) {
		sum+=arr[i]*Math.pow(x,arr[i+1]);
	}System.out.println("evalution of differenciationis:"+sum);}
	
	void integrate(int arr[],int x) {
		for(int i=0;i<arr.length;i+=2) {
			arr[i+1]=arr[i+1]+1;
			arr[i]=arr[i]/arr[i+1];
		}for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}for(int i=0;i<arr.length;i+=2) {
			if(i==0) {
				System.out.print(arr[i]+"x^"+arr[i+1]);
			}
			else if(arr[i]>0) {
				System.out.print("+"+arr[i]+"x^"+arr[i+1]);
			}
			else {
				System.out.print(arr[i]+"x^"+arr[i+1]);
			}
			
		}System.out.println(" ");
		sum=0;
		for(int i=0;i<arr.length;i=i+2) {
			
			sum+=arr[i]*Math.pow(x,arr[i+1]);
		}System.out.println("evaluation of integration is:"+sum);
			
	}
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n:");
		int n=sc.nextInt();
		System.out.println("enter x:");
		int x=sc.nextInt();
		int arr[]=new int[n];
		int cArr[]=new int[n];
		for(int i=0;i<n;i+=2) {
			System.out.print("co_ef:");
			arr[i]=sc.nextInt();
			System.out.print("pow:");
			arr[i+1]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");}
		System.out.println(" ");
		for(int i=0;i<arr.length;i++) {
			cArr[i]=arr[i];
		}
		for(int i=0;i<arr.length;i+=2) {
			if(i==0) {
				System.out.print(arr[i]+"x^"+arr[i+1]);
			}
			else if(arr[i]>0) {
				System.out.print("+"+arr[i]+"x^"+arr[i+1]);
			}
			else {
				System.out.print(arr[i]+"x^"+arr[i+1]);
			}
			
		}System.out.println(" ");
		
		
		
		differnciation d=new differnciation();
		
		d.diff(arr,x);
		d.integrate(cArr,x);
		
	}

}
