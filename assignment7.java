package MyPackage;
import java.util.*;

public class assignment7 {
	public static void main(String[] args) throws Exception{
		try (Scanner sc = new Scanner(System.in)) {
			int Bill_Id = sc.nextInt();
			int Customer_Id = sc.nextInt();
			float Bill_Amount = sc.nextFloat();
			System.out.println("Bill Id:"+Bill_Id);
			System.out.println("Customer Id:"+Customer_Id);
			System.out.println("Bill Amount:"+Bill_Amount);
		}

}}
