package MyPackage;

import java.util.*;
class ss{
	
	
	private int i,low,high,pivot,temp;
	void quick(int arr[]) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");}
		pivot=0;
		low=0;
		high=arr.length-1;
		while(low<high) {
			System.out.println("While");
			if((arr[low]>arr[pivot])&& (arr[high]<arr[pivot])){
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				System.out.println("");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");}
			}low=low+1;
			high=high-1;
			
		}System.out.println("outWhile");
		 temp=arr[high];
		 arr[high]=arr[pivot];
		 arr[pivot]=temp;
		 System.out.println("");
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");}
	}
	
}

public class Qsort {
	public static void main(String[] args) throws Exception{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("n is:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			System.out.print("enter the array"+i+" element");
			arr[i]=sc.nextInt();
			}
		for(i=0;i<n;i++) {
	        System.out.print(arr[i]+" ");
			}
			
		ss myobj=new ss();
		myobj.quick(arr);}
}	

