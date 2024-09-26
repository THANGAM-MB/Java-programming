package MyPackage;
import java.util.*;

public class sort {
	void qsort(int[] arr,int low,int high) {
		if(low<high) {
			int pivot_position=partition(arr,low,high);
			qsort(arr,low,pivot_position-1);
			qsort(arr,pivot_position+1,high);
		}

	}
	int partition(int[] arr,int low,int high)
	{
		int pivot=arr[low];
		int pivot_pos=low;
		int templow=low;
		int temphigh=high;
		while(low<high)
		{
			while(pivot>=arr[low] && low<temphigh)
			{
				low++;
			}
			while(pivot<=arr[high] && high>templow)
			{
				high--;
			}
			if(low<high)
			{
				int temp=arr[low];
				arr[low]=arr[high];
				arr[high]=temp;
				
			}
			
		}
		int temp=arr[pivot_pos];
		arr[pivot_pos]=arr[high];
		arr[high]=temp;
		return high;
	}
	void run(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		
		sort obj=new sort();
		Scanner sc=new Scanner(System.in); 
        System.out.println("No of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print("Before sorting:");
        obj.run(arr,n);
        System.out.println();
        System.out.print("After sorting:");
        obj.qsort(arr,0,n-1);
        obj.run(arr,n);
	}

}
