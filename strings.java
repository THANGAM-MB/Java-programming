package MyPackage;

import java.util.*;  

final class stringss
{ 
	final String pancardNumber;    
public stringss(String pancardNumber)  
{    
this.pancardNumber=pancardNumber;    
}  
public String getPancardNumber(){    
return pancardNumber;    
}    
}    
public class strings
{  
public static void main(String[] args)  
{  
stringss e = new stringss("ABC123");  
String s1 = e.getPancardNumber();  
System.out.println("Pancard Number: " + s1);  
}  
}  