package MyPackage;
import java.util.*;
class Finance{
	public float Monthly_pay,NoOfHours,PayRatePerHour,NoOfWeeks; 
	public void Monthly_pay() {
		Monthly_pay=NoOfHours*PayRatePerHour*NoOfWeeks; 
		System.out.println("Monthly pay:"+Monthly_pay);		
	}
}

class assignment10 {
	public static void main(String[] args) throws Exception{
		Finance myobj=new Finance();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("NoOfHours:");
			myobj.NoOfHours=sc.nextFloat();
			System.out.println("PayRatePerHour:");
			myobj.PayRatePerHour=sc.nextFloat();
			System.out.println("NoOfWeeks:");
			myobj.NoOfWeeks=sc.nextFloat();
		}
		myobj.Monthly_pay();
		
		 
	}

}
