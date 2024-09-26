package MyPackage;
import java.util.*;
public class binarySearch {
	public static void main(String[] args)
	{
		int i=0,count=0;
		int a[]= {10,20,30,40,50,60,70};
		int firstValue=0;
		int lastValue=(a.length)-1;
		int midValue=(a.length)/2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the searchElement:");
		int searchElement=sc.nextInt();
		for(i=firstValue;i<=lastValue;i++) {
		if(searchElement==a[midValue]) {
			System.out.println("searchElement "+searchElement+" is exist");
		    count=count+1;
		    break;
		}
		else if(searchElement>a[midValue]) {
			firstValue=midValue+1;
		}
		else {
			lastValue=midValue-1;
		}}
		if(count==0) {
			System.out.println("searchElement "+searchElement+" is not exist");
		}
	}
}
