package MyPackage;
import java.util.*;
import java.lang.Math.*;

public class quadfunction<T> {
	static double result;
	T quad(double a,double b,double c,double x){
		result=(a*Math.pow(x,2))+b*x+c;
		System.out.println("result:"+result);
		return null;
	}
	T root(double a,double b,double c){
		int r1=(int)((-b+(Math.sqrt(b*b-(4*a*c))))/(2*a));
		System.out.println("r1:"+r1);
		int r2=(int) ((-b-(Math.sqrt(b*b-(4*a*c))))/(2*a));
		System.out.println("r2:"+r2);
		return null;
		
	}
	public static void main(String[] args){
		quadfunction<Integer> obj=new quadfunction<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		double a=sc.nextDouble();
		System.out.println("enter b:");
		double b=sc.nextDouble();
		System.out.println("enter c:");
		double c=sc.nextDouble();
		System.out.println("enter x:");
		double x=sc.nextDouble();
		obj.quad(a,b,c,x);
		System.out.println(result);
		obj.root(a,b,c);
		}
}
