package MyPackage;

public class integration {
	public static void main(String[] args) throws Exception{
		int arr[]= {3,7,-5,4,3,2,-10,0};
	for(int i=0;i<arr.length;i+=2) {
		arr[i+1]=arr[i+1]+1;
		arr[i]=arr[i]/arr[i+1];
	}for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	}}
