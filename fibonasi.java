package MyPackage;
import java.io.*;

public class fibonasi {
	int previous=1,next_previous=-1;
	void fibo(int n) {
		for(int i=0;i<n;i++) {
		int sum=previous+next_previous;
		next_previous=previous;
		previous=sum;
		System.out.print(sum+" ");}
	}

	public static void main(String[] args) {
         fibonasi f=new fibonasi();
         f.fibo(10);
}
}