package MyPackage;
import java.util.*;

public class mergesort {
	int mid,j;
	/*void merge(int arr[],int low,int high,int mid,int arr1[],int arr2[],int temp[]) {
		split(arr,0,arr.length,mid,arr1,arr2,temp);
		split(arr1,0,arr1.length,mid,arr1,arr2,temp);
		split(arr2,0,arr2.length,mid,arr1,arr2,temp);
		combine(arr1,arr2,temp);
	}
	*/
	void split(int arr[],int low,int high) {
		int mid=(low+high)/2;
		//System.out.println(mid);
		int arr1[]=new int[mid];
		int arr2[]=new int[arr.length-mid];
		
		System.out.println(" ");
		if(low<high-1) {
			
			for(int i=0;i<mid;i++){
				arr1[i]=arr[i];}
			  
			System.out.print("arr1 is:"	);
			for(int i=0;i<mid;i++){
				System.out.print(arr1[i]+" ");
				}
			
			for(int i=mid;i<arr.length;i++){
				arr2[i-mid]=arr[i];
				}
			System.out.print("arr2 is:"	);
			for(int i=0;i<mid;i++){
				System.out.print(arr2[i]+" ");
				}
			split(arr1,0,mid);
			split(arr2,0,arr.length-mid);
			combine(arr,arr1,arr2);
			/*int pos=0;
			for(int i=0;i<arr.length;i++) {
				arr1[pos]=temp[i];
				pos++;
			}System.out.println("merged array is:");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr1[i]+" ");
				}*/
	}
			}
		
	
	void combine(int arr[],int arr1[],int arr2[]) {
		int FL=0,FH=arr1.length,SL=0,SH=arr2.length ,TL=0;
	
			while(FL<FH && SL<SH) {
				if(arr1[FL]<arr2[SL]) {
					arr[TL]=arr1[FL];
					FL++;
					TL++;
				}
				else {
					arr[TL]=arr2[SL];
					SL++;
					TL++;
				}
					
			}while(FL<FH) {
			    arr[TL]=arr1[FL];
				FL++;
				TL++;
			}
			while(SL<SH){
				arr[TL]=arr2[SL];
				SL++;
				TL++;
			}
			
			System.out.println("merged array is:");
			for(int i=0;i<FH+SH;i++){
				System.out.print(arr[i]+" ");
				}
	}


public static void main(String[] args) {
	mergesort myobj=new mergesort();
	Scanner sc=new Scanner(System.in);
	System.out.println("No of elements:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int low=0,high=n;
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
		}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
	
	int temp[]=new int[n];
	System.out.println(" ");
	myobj.split(arr,0,arr.length);
}
}
