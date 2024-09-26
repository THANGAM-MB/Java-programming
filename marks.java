package MyPackage;
import java.util.*;
class student{
	int m1,m2,m3,m4,m5,sum,avg;
	 int calculation(int m1,int m2,int m3){
		sum=m1+m2+m3+m4+m5;
		System.out.println("Sum is :"+sum);
		avg=sum/5;
		System.out.println("Avg is :"+avg);
		return 7;
	}
	 boolean result(){
		if(avg>=50)
			System.out.println("pass");
		else
			System.out.println("Fail");
		return true;
	}
}


public class marks {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
			int m1 = sc.nextInt(),m2 = sc.nextInt(),m3 = sc.nextInt(),m4 = sc.nextInt(),m5 = sc.nextInt();
			/*System.out.println("m1 is:"+m1);
			//int m2 = sc.nextInt();
			System.out.println("m2 is:"+m2);
			//int m3 = sc.nextInt();
			System.out.println("m3 is:"+m3);*/
	
		student myobj = new student();
		int ans1=myobj.calculation(m1,m2,m3);
		boolean ans=myobj.result();
		System.out.println(ans1);

}}
