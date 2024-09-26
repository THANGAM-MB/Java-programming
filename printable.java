package MyPackage;
import java.io.*;

    class printable{
	int a;
	printable(int a)
	{
	this.a=a;
	}

	public class innerClass{

	int b=2;
	public static void main(String[] args){
	printable p=new printable(5);
	System.out.println("a is" +p.a);

	}}



}
