package MyPackage;

public class arrayFrequency {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,3,5,4,6};
		//int //count=0;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(arr[i]!=-1)
			{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					count=count+1;
				     arr[j]=-1;
				}
				    
			}
			System.out.println("count of "+arr[i]+"is in"+count+"times");
		
			}}
		
			//arr[i]=-1;
		}
		
		
		
	}


