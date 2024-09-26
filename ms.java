package MyPackage;

public class ms {
	
	void merge(int[] leftArray , int [] rightArray) {
		int[] temp = new int[leftArray.length + rightArray.length];
		
	}
	
	void split(int[] list,int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			int[] leftTree= new int [mid+1];
			int[] rightTree= new int [high-(mid+1)];
			
			for(int i =0 ;i < list.length;i++) {
				if(i<=mid) {
					leftTree[i]=list[i];
				}
				else {
					rightTree[i-mid-1]=list[i];
				}
			}
			
			split(leftTree,low,mid);
			split(rightTree,mid+1,high);
			merge(leftTree,rightTree);
		}
		
	}
	
 public static void main(String[] args) {
	 int arr[]= {67,89,4,24,3,7,12,9,45};
	 ms merge = new ms();
	 merge.split(arr,0,arr.length);
 
 }
}
