package MyPackage;
import java.util.*;
class num{
	private int x,y,n1,d1,n2,d2;
	private double rationalResult;
	num(int n1,int d1,int n2,int d2){
		this.n1=n1;
		this.d1=d1;
		this.n2=d2;
		this.d2=d2;
		System.out.println("constructor");
	}
	num(num Num){
		d1=Num.d1;
		d2=Num.d2;
		n1=Num.n1;
		n2=Num.n2;
		System.out.println("Copy constructor");
	}
	num(){
		n1=0;
		d1=1;
		n2=0;
		d2=1;
		System.out.println("default constructor");
		double x1=rational(n1,d1);
		double y1=rational(n2,d2);
		operation(x1,y1);
		
	}

	double operation(double x,double y) {
		double add=x+y;
		System.out.println("addition:"+add);
		double sub=x-y;
		System.out.println("subration:"+sub);
		double mul=x*y;
		System.out.println("multiply:"+mul);
		double div=(double)x/y;
		System.out.println("division:"+div);
		System.out.println("+=operation result is"+(x+=y));
		System.out.println("-=operation result is"+(x-=y));
		System.out.println("*=operation result is"+(x*=y));
		System.out.println("/=operation result is"+(x/=y));
		return 0;
		
	}
	double rational(double n,double d) {
		double rationalResult=(double)n/d;
		if(d!=0) {
		System.out.println("Rational result is:"+n+"/"+d+"="+rationalResult);}
		else {
			System.out.println("Y is zero");
		}
		return rationalResult;
	}
	
}
public class rational {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numerator1:");
		int numerator1=sc.nextInt();
		System.out.println("Denominator value is not equal to 0");
		System.out.println("Enter Denominator1:");
		int Denominator1=sc.nextInt();
		int d1=Denominator1;
		int n1=numerator1;
		System.out.println("Enter numerator2:");
		int numerator2=sc.nextInt();
		System.out.println("Denominator value is not equal to 0");
		System.out.println("Enter Denominator2:");
		int Denominator2=sc.nextInt();
		int d2=Denominator2;
		int n2=numerator2;
		num obj=new num(n1,d1,n2,d2);
		num obj1=new num(obj);
		double x=obj.rational(n1,d1);
		double y=obj.rational(n2,d2);
		obj.operation(x,y);
		num obj2=new num();
//		double x1=obj2.rational(n1,d1);
//		double y1=obj2.rational(n2,d2);
//		obj2.operation(x1,y1);
		
		}

}
