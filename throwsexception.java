package MyPackage;

import java.io.*;
import java.lang.*;
public class throwsexception {
public void m() throws IOException{
	 System.out.println("In m");
	 throw new IOException("myException");
}
public void n() throws IOException {
	 System.out.println("In n");
	 m();
}
public void p() throws IOException {
	 System.out.println("In p");
	 n();
}
public void exe() {
	 System.out.println("In exe");
	 try {
		 System.out.println("In try");
		 p();
	 }
	 catch(Exception e) {
		 System.out.println("In exe exception");
		 System.out.println("Exception is:"+e);
		 System.out.println("Exception cleared");
	 }
	 finally{
		 System.out.println("final block");
	 }
}
public static void main(String[] args){
	 throwsexception obj=new throwsexception();
	 obj.exe();
}

}

