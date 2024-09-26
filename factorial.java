package MyPackage;
import java.io.*;

class factorial {
	public static void main(String[] args) {
	
		factorial f=new factorial();
		f.fact1(5);
	}
	void fact1(int n){ 
		int sum=1;
		for(int i=n;i>=1;i--){
			sum=sum*i;}
		System.out.println("Fatorial is:"+sum);
	}

}
