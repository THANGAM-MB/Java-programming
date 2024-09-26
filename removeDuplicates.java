package MyPackage;

public class removeDuplicates {
public static void main(String[] args) {
	int i,j;

	int arr[]= {1,2,3,4,1,3,5,4,6};
	for(i=0;i<arr.length;i++){
		for(j=i+1;j<arr.length;j++){
			if(arr[i]==arr[j]) {
				//System.out.println(arr[i]);
				arr[j]= -1;
			}
			
		}
}for(i=0;i<arr.length;i++) {
	if(arr[i]!=-1) {
		System.out.print(arr[i]);
	}
}
	
}
}
