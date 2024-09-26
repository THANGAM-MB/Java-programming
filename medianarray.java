package MyPackage;

public class medianarray {
	int i=0;
	int j=0;
	void merge(int[]arr1,int[]arr2,int[] arr) {
		for(int k=0;i<arr.length;i++) {
		while(i<arr1.length &&j<arr2.length) {
			if(arr1[i]>arr2[j]) {
				arr[k]=arr2[j];
				k++;
				j++;
			}else {
				arr[k]=arr1[i];
				k++;
				i++;
			}}
			while(i<arr1.length) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length) {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		
		
	}
	for(i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}System.out.println(" ");
	if((arr.length%2)==0) {
		System.out.print("Median is:"+arr[(arr.length/2)-1]);
		System.out.print(" "+arr[arr.length/2]);
	}
	else {
		System.out.println("Median is:"+arr[arr.length/2]);
	}
}

	


	public static void main(String[] args) {

		int[] arr1= {1,2,5,6};
		int[] arr2= {3,4,7,8};
		int[]arr=new int[arr1.length+arr2.length];
		medianarray myobj=new medianarray();
		myobj.merge(arr1,arr2,arr);
//		void med(int arr[]) {
//			if((arr.length%2)!=0) {
//				System.out.println(arr[arr.length/2]);
//			}else {
//				continue;
//			}
//		}
//		myobj.medium(arr);
		
	}}
