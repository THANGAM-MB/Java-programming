package MyPackage;
import java.io.*;
public class GCD {
	int smallerNo,i,n1,n2;
	
		
	void Gcd(int n1,int n2) {
		
		if(n1<n2) {
			smallerNo=n1;
		}else {
			smallerNo=n2;
		}System.out.println("s:"+smallerNo);
		
	
		for(i=smallerNo;i>=1;i--)
		{
			if((n1%i==0)&& (n2%i==0)) {
				
				System.out.println("GCD is "+i);
				break;}
			else {
				continue;
			}
		}}
	
	public static void main(String[] args) {
		GCD myobj=new GCD();
		
		myobj.Gcd(6,5);
				
	}

	}
