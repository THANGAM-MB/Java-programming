package MyPackage;
import java.io.*;

public class primeNumber {
	int n,i;
	void prime(int n) {
		if(n==2 && n==3) {
			System.out.println(n+" is a prime number");
		}
		else if(n>3) {
			int count=1;
			for(i=2;i<n;i++) {
				if(n%i==0) {
					count=count+1;
					System.out.println(n+" is not a prime number");
					break;
				}
				
			}if(count==1) {System.out.println(n+" is a prime number");
		}}
	}
	public static void main(String[] args) {
		primeNumber p=new primeNumber();
		p.prime(9);
		
	}

}
