
package MyPackage;

import java.util.*;
class sss{
	
	
	private int i,low,high,pivot,temp,mid;
	
	void quick(int arr[],int templow,int temphigh) {
        
		for(int i=0;i<temphigh;i++) {
			System.out.print(arr[i]+" ");}
		pivot=templow;
		low=templow;
		high=temphigh;
		System.out.println("low: "+low+" high: "+high);
		while(low<high) {
			System.out.println("While");
			if(arr[low]>arr[pivot]){
				while(high>low) {
				if(arr[high]<arr[pivot]){
				temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				for(int i=0;i<arr.length;i++) {      
					System.out.print(arr[i]+" ");}     
				break;
				//for(int i=0;i<arr.length;i++) {
					//System.out.print(arr[i]+" ");}
				}high=high-1; 
			}
				}low=low+1;
			
			
			}System.out.println("outWhile");
			System.out.println("low:"+low);
			System.out.println("high:"+high);
		 high=high-1;
		 if(low>high) {	
		 mid=high;
		 temp=arr[high];
		 arr[high]=arr[pivot];
		 arr[pivot]=temp;
		 
		 System.out.println("mid: "+mid);
		 System.out.println("");
		 for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");}}
		 
		 if(high!=pivot) {
			 System.out.println("inner function 1");
		 quick(arr,templow,mid-1);}
		 
		 quick(arr,mid+1,temphigh);
        }
	
	
}

public class qwhile {
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
		int low=0,high=arr.length-1;	
		sss myobj=new sss();
		myobj.quick(arr,low,high);}
}	


