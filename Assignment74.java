package MyPackage;
import java.util.*;
class shape{
	public double area() {
		System.out.println("In shape class");
		return 0.0;
	}
	public double perimeter() {
		System.out.println("In shape class");
		return 0.0;
	}
}
class rectangle extends shape{
	private double length;
	private double breath;
	rectangle(double length,double breath){
		this.length=length;
		this.breath=breath;
	}
	public double area(double length,double breath) {
		System.out.println("In rectangle class");
		double area=length*breath;
		System.out.println("area:"+area);
		return area; 
	}
	public double perimeter(double length,double breath){
		System.out.println("In rectangle class");
		return 2*(length+breath);
		
	}
}
class square extends shape{
	private double length;
	square(int length){
		this.length=length;
	}
	public double area(double length) {
		System.out.println("In square class");
		return length*length;
	}
	public double perimeter(double length){
		System.out.println("In square class");
		return 4*(length);		
	}
}
public class Assignment74 {
	public static void main(String [] args) {
		shape obj=new shape();
		obj.area();
		obj.perimeter();
		rectangle obj2=new rectangle(2,3);
		obj2.area(5,3);
		obj2.perimeter(8,2);
		square obj3=new square(10);
		obj3.area(6);
		System.out.println("peimeter is:"+obj3.perimeter(7));
		
	}

}
