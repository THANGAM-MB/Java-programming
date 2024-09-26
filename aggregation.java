package MyPackage;

class Address{
	String address;
	Address(){
		string address;
	}
	Address(String address){
		this.address=address;
		
	}
	
	public String getaddress() {
		return address;
	}
}
class customernew{
	private Address address;
	customernew(){
		Address address;
	}
	customernew(Address address){
		System.out.println(address);
		this.address=address;
	}
	void display() {
		System.out.println(address.address);
		System.out.println(address.getaddress());
	}
}
public class aggregation {	
 public static void main(String[] args) {
	 Address myobj1=new Address("75fshg");
	 System.out.println(myobj1.getaddress());
	 customernew myobj2=new customernew(myobj1);
	 myobj2.display();
	
	 
 }
}
