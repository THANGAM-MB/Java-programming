package MyPackage;
import java.util.*;
class address{
	int doorNo;
	String areaName,city;
	address(int doorNo,String areaName,String city){
		this.doorNo=doorNo;
		this.areaName=areaName;
		this.city=city;
	}
}
public class Aggrication {
	int empId;
	String dept;
	address address;
	Aggrication(int empId,String dept,address address){
		this.empId=empId;
		this.dept=dept;
		this.address=address;
	}
	void display(){
		System.out.println("empId:"+empId);
		System.out.println("dept:"+dept);
		System.out.println("address:"+address.doorNo+" "+address.areaName+" "+address.city);
		
		
	}
	public static void main(String[] args) {
		address ad=new address(14,"pallava_garden","pallavaram");
		Aggrication myobj=new Aggrication(101,"Developement",ad);
		myobj.display();
	}

}
