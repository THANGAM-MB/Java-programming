package MyPackage;
import java.util.*;
class cus1{
	private int customer_id;
	private long mobile_no;
	public void setCustomer_Id(int c_id) {
		customer_id=c_id;
	}
	public void setMobile_No(long m_no) {
		mobile_no=m_no;
	}
	public int getCustomer_Id() {
		return(customer_id);
	}
	public long getMobile_No() {
		return(mobile_no);
	}
}

public class assignment24 {
	public static void main(String[] args)throws Exception {
		int cus_id;
		long mo_no;
		cus1 myobj=new cus1();
		Scanner sc=new Scanner(System.in);
		cus_id=sc.nextInt();
		mo_no=sc.nextLong();
		new cus1().setCustomer_Id(cus_id);
		myobj.setMobile_No(mo_no);
		System.out.println("customer_id:"+myobj.getCustomer_Id());
		System.out.println("mobile_no:"+myobj.getMobile_No());
		System.out.println(new cus1());
		
	}

}
