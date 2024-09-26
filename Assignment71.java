package MyPackage;
import java.util.*;
class customerInformation{
	private String customerName;
	private int customerId;
	private String customerCity;
    customerInformation(String customerName,int customerId,String customerCity){	
    	
    	this.customerName=customerName;
    	this.customerId= customerId;
    	this.customerCity=customerCity;
    	System.out.println("customerName:"+customerName);
		System.out.println("customerId:"+customerId);
		System.out.println("customeCity:"+customerCity);  
    }
    
}
class childCustomerInformation extends customerInformation{
	childCustomerInformation(String customerName,int customerId,String customerCity){	
    	super(customerName,customerId,customerCity);
    	displayCustomerInformation(customerName,customerId,customerCity);
	}
	public void displayCustomerInformation(String customerName,int customerId,String customerCity) {
		System.out.println("customerName:"+customerName);
		System.out.println("customerId:"+customerId);
		System.out.println("customeCity:"+customerCity);    		
	}
}
class childclass2 extends customerInformation{
	childclass2(String customerName,int customerId,String customerCity){
		super(customerName,customerId,customerCity);
		displayCustomerInformation(customerName,customerId,customerCity);
	}
	public void displayCustomerInformation(String customerName,int customerId,String customerCity) {
		System.out.println("customerName:"+customerName);
		System.out.println("customerId:"+customerId);
		System.out.println("customeCity:"+customerCity);    		

	}
}

public class Assignment71 {
	public static void main(String[] args) {
		customerInformation myobj=new customerInformation("jey",1001,"chennai");
		childCustomerInformation myobj1=new childCustomerInformation("devi",5005,"tzy");
		childclass2 myobj2= new childclass2("kavi",2009,"palavaram");
	}
}
