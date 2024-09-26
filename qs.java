package MyPackage;
import java.util.*;
class sor {
	private int n,pivot,i,temp=0,high,low,mid;
	
	/*public void inputs() {	
	
 
		
		
		for(i=0;i<n;i++) {
			System.out.print("enter the array"+i+" element");
			}
		for(i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
			}
			}
		*/

	
	public void quick(int arr[],int low,int high) {
		//inputs();
		
		
		System.out.println("arr is:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");}
		pivot=0;
		//high=arr.length-1;
		//low=0;
		System.out.println("pivotelement"+pivot);
		
		for(low=0;low<arr.length;low++) {
			//System.out.println("in");
			
			if(arr[pivot]<arr[low]) {
				//arr[low]=arr[i];
				//System.out.println("hi");
				for(high=arr.length-1;high>=0;high--) {
					//System.out.println("l");
					if(low<high) {
					if(arr[pivot]>arr[high]) {
						//System.out.println("k");
						temp=arr[low];
						arr[low]=arr[high];
						arr[high]=temp;
					    break;}
				}
					else if(low>high) {
					mid=high;
					temp=arr[pivot];
					arr[pivot]=arr[high];
					arr[high]=temp;
					low=0;
					high=arr.length;		
					//quick(arr,0,mid-1);
					quick(arr,mid+1,high);
					break;} 
				}}
		System.out.println("Sorted array is:");
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");}
		}
	}}
public class qs {
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
	int low=0,high=arr.length;	
	sor myobj=new sor();
	myobj.quick(arr,low,high);}
 }

