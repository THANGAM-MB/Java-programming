package MyPackage;

public class exceptionPropagation {
	
 public void m() {
	 System.out.println("In m");
	 int data=10;
	 double div=data/0;
 }
 public void n() {
	 System.out.println("In n");
	 m();
 }
 public void p() {
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
	 exceptionPropagation obj=new exceptionPropagation();
	 obj.exe();
 }

}
