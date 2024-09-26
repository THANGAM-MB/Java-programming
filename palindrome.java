package MyPackage;
import java.io.*;


public class palindrome {
	int sum=0,temp;
	void pali(int n) {
		temp=n;
		while(n>0) {
		
		int rem=n%10;
		sum=sum*10+rem;
		n=n/10;}
		if(sum==temp) {System.out.print(temp +" is a palindrome");}
		else {System.out.print(temp+" is not a palindrome");}
			
		}
	

	public static void main(String[] args) {
		palindrome p=new palindrome();
		p.pali(121);

}}
