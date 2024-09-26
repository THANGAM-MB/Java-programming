package MyPackage;
import java.util.*;
public class assignment13 {
public static void main(String[] args) {
	int Emp_Id;
	double Basic_Salary,Allowance,Gross_Pay,Income_tax,Income_tax_percentage,Net_pay;
	Scanner sc=new Scanner(System.in);
	System.out.println("Emp_Id:");
	Emp_Id=sc.nextInt();
	System.out.println("Basic salary:");
	Basic_Salary=sc.nextDouble();
	System.out.println("Allowance:");
	Allowance=sc.nextDouble();
	Gross_Pay=Basic_Salary;
	if(5001<=Gross_Pay && Gross_Pay<=10000) {
		Income_tax_percentage=10d;
	Income_tax=Gross_Pay*(Income_tax_percentage/100d);
	Net_pay = Gross_Pay-Income_tax;
	}
	else if(Gross_Pay>10000 && Gross_Pay<=20000) {
		
		Income_tax_percentage = 20d;
		Income_tax=Gross_Pay*(Income_tax_percentage/100d);
		Net_pay = Gross_Pay-Income_tax;
	}
	else if(Gross_Pay>20000) {
		
		Income_tax_percentage = 30d;
		Income_tax=Gross_Pay*(Income_tax_percentage/100d);
		Net_pay = Gross_Pay-Income_tax;
	}
	else {
		Income_tax=0;
		Net_pay = Gross_Pay-Income_tax;
	}
	System.out.println("Emp_Id:"+Emp_Id);
	System.out.println("Basic salary:"+Basic_Salary);
	System.out.println("Allowance:"+Allowance);
	System.out.println("Gross pay:"+Gross_Pay);
	System.out.println("Income tax:"+Income_tax);
	System.out.println("Net pay:"+Net_pay);
}
}
