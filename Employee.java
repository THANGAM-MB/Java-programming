package MyPackage;
import java.util.*;
class Company{


	private int Emp_id;
	private String Emp_name;
	private String DOB;
	private String DOJ;
	private String Designation;
	private double Exp;
	private double Salary;
	Company(int Emp_id,String Emp_name,String DOB,String DOJ,String Designation,double Exp,double Salary){
		this.Emp_id=Emp_id;
		this.Emp_name=Emp_name;
		this.DOB=DOB;
		this.DOJ=DOJ;
		this.Designation=Designation;
		this.Exp=Exp;
		this.Salary=Salary;
	}
	void display(Company Emp_details[][],int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=3;j++) {
				switch (j){
				case 1:
					Emp_details[i][j]=Emp_id;
					break;
				case 2:
					Emp_details[i][j]=Emp_name;
					break;
				case 3:
					Emp_details[i][j]=Salary;
					break;
				}
			}break;
		}
	}
}
public class Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of employees");
		int n=sc.nextInt();
		Company Emp_details[][]=new Company[n][7];
		
		for(int i=0;i<n;i++) {
			Company myobj=new Company(Emp_id,Emp_name,DOB,DOJ,Designation,Exp,Salary);
			System.out.println("Enter Emp_id: ");
			myobj.setEmp_id=sc.nextInt();
			System.out.println("Enter Emp_name:");
			String Emp_name=sc.next();
			System.out.println("Enter DOB:");
			String DOB=sc.next();
			System.out.println("Enter DOJ:");
			String DOJ=sc.next();
			System.out.println("Enter Designation:");
			String Designation=sc.next();
			System.out.println("Enter Experience:");
			double Exp=sc.nextDouble();
			System.out.println("Enter Salary:");
			double Salary=sc.nextDouble();
				
			//myobj.display(Emp_details,n);
		}
	}

}
