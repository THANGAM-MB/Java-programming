package MyPackage;
import java.util.*;
import java.lang.Math.*;

public class template<T extends Number> {
	private  double result;
	private T a;
	private T b;
	public template(T a,T b) {
		this.a=a;
		this.b=b;
	}
	<T extends Number>void quad(T a,T b,T c,T x){
		T res=a;
		T res1=b;
		if(a instanceof Double&& b instanceof Double) {
		result=(Double)((Double)a+(Double)b);
		System.out.println("Result:"+result);}
	}
	<T extends Number> void root(double a,double b,double c){
		double r1=(-b+(Math.sqrt(b*b-(4*a*c))))/(2*a);
		System.out.println("r1:"+r1);
		double r2=(-b-(Math.sqrt(b*b-(4*a*c))))/(2*a);
		System.out.println("r2:"+r2);
	}
	public static void main(String[] args){
		template<Double>obj=new template<Double>(5.0,5.0);
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
		//System.out.println(result);
		obj.root(a,b,c);
		
		}
}

