package MyPackage;
import java.util.*;
class customer{
	public int Customer_Id,Bill_Id,Item_Id,Quantity_Purchased;
	public double Discount,Original_Item_Price,Item_Price,Dis_Amount,Pay_Amount;
	public void Discount() {
		System.out.println("method is worked");
		if(5000<Item_Id&& Item_Id<=5005) {
			if(Quantity_Purchased<=5) {
				if(Original_Item_Price>=5) {
		            if(Item_Id==5001) {
			            Discount=10/100d;
			            }
		            else if(Item_Id==5002)
		                {System.out.println("5002 is worked");
		                Discount=15/100d;
		                System.out.println(Discount);
		                     }
		            else if(Item_Id==5003) {
			            Discount=12/100d;
		                 }
		            else {
		            	System.out.println("else is worked");
		            	Dis_Amount = 0;
		            }
		            Dis_Amount=Original_Item_Price*Discount;
		            Item_Price=Original_Item_Price-Dis_Amount;	}	
				
				else 
					System.out.print("not there");}
			else
				System.out.print("not there");}
		else
			System.out.print("not there");}
		
				

	public void Pay_amount() {
		
		Pay_Amount=Quantity_Purchased*Item_Price;
		System.out.println("Customer_Id:"+Customer_Id);
		System.out.println("Bill_Id:"+Bill_Id);
		System.out.println("Item_Id:"+Item_Id);
		System.out.println("Quantity_Purchased:"+Quantity_Purchased);
		System.out.println("Item_Price:Rs."+Item_Price);
		System.out.println("Pay_Amount:"+Pay_Amount);
}}

public class assignment11 {
	public static void main(String[] args) throws Exception{
		customer myobj=new customer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Customer_Id:");
		myobj.Customer_Id=sc.nextInt();
		System.out.println("Bill_Id:");
		myobj.Bill_Id=sc.nextInt();
		System.out.println("Item_Id:");
		myobj.Item_Id=sc.nextInt();
		System.out.println("Quantity_Purchased:");
		myobj.Quantity_Purchased=sc.nextInt();
		System.out.println("Original_Item_Price:");
		myobj.Original_Item_Price=sc.nextDouble();
		double answer=10/100d;
		System.out.println("answer:"+answer);
		myobj.Discount();
		myobj.Pay_amount();
		
		
		
	}

}

