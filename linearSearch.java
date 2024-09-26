package MyPackage;
import java .util.*;

public class linearSearch {
	public static void main(String[] args){
		int count=1,i;
		linearSearch ls=new linearSearch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Search element:");
		int searchElement=sc.nextInt();
		int a[]={12,23,45,67,89};
		for(i=0;i<a.length-1;i++) {
			if(a[i]==searchElement) {
				count=count+1;
				System.out.println("searchElement "+searchElement+" is exist");
				break;
			}}
		if(count==1){
				System.out.println("searchElement "+searchElement+" is not exist");
			
			
		}
	}

}
