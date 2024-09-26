package MyPackage;
import java.io.*;

public class amstrong {
	int sum=0,temp;

	void ams(int n) {
		temp=n;
		while(n>0) {
		int rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;}
		if(sum==temp) 
		{System.out.print(temp +" is an amstrong number.");}
		else
		{System.out.print(temp +" is not an amstrong number.");}}
	public static void main(String[] args) {
		amstrong a=new amstrong();
		a.ams(153);
	}}
         

