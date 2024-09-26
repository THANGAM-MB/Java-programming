package MyPackage;
import java.math.*;


public class Assignment65 {
	int startPoint,endPoint,ticketAmount;
	Assignment65(){
		this.startPoint=0;
		this.endPoint=0;
		this.ticketAmount=0;
		validateTravelPoints();
		calcTicketAmt();
	}
	Assignment65(int startPoint,int endPoint){
		this.startPoint=startPoint;
		this.endPoint=endPoint;
		this.ticketAmount=10;
		validateTravelPoints();
		calcTicketAmt();
	}int getstartPoint() {
		System.out.println(startPoint);
		return startPoint;
	}
	int getendPoint() {
		System.out.println();
		return endPoint;
	}
	boolean validateTravelPoints() {
		if((endPoint-startPoint)!=0) {
			System.out.println("true");
			return true;
		}else {
			System.out.println("False");
			return false;
		}
	}
	void calcTicketAmt() {
		System.out.println("total amount is:"+Math.abs((endPoint-startPoint)*ticketAmount));
		
	}
	public static void main(String[] args) {
		Assignment65 myobj=new Assignment65();
		Assignment65 myobj1=new Assignment65(10,1);
		Assignment65 myobj2=new Assignment65(1,10);
	}

}
