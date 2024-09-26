package MyPackage;
import java.io.*;
import java.util.*;

 class Assignment1{
	  // Static method
	  static  int a=10;
	  static void myStaticMethod() {
		
		System.out.println(a);
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public static void myPublicMethod() {
		int b=7;
		System.out.println(b);
	    System.out.println("Public methods must be called by creating objects");
	  }
}
	  // Main method
	  public class Assignment{
	  public static void main(String[ ] args) {
	    //Assignment1.myStaticMethod(); // Call the static method
	    // myPublicMethod(); This would output an error
        
	    Assignment1 myObj = new Assignment1(); // Create an object of Main
	    Assignment1.myPublicMethod();
	    myObj.myStaticMethod();
	    // Call the public method
	    //System.out.println(b);
	    //System.out.println(a);
	  }
	}
