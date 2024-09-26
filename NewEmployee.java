package MyPackage;
import java.util.*;

public class NewEmployee {
	
	
		private int Emp_id;
		private String Emp_name;
		private String DOB;
		private String DOJ;
		private String Designation;
		private double Exp;
		private double Salary;
	
		
		/*void display(Company Emp_details[][],int n) {
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
		}*/
	
	

		public static void main(String[] args) {
			int index=0 ;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no of employees");
			int n=sc.nextInt();
			NewEmployee Emp_details[]=new NewEmployee[n];
			
			for(int i=0;i<n;i++) {
				NewEmployee myobj=new NewEmployee();
				System.out.println("Enter Emp_id: ");
				myobj.setEmp_id(sc.nextInt());
				System.out.println("Enter Emp_name:");
				myobj.setEmp_name(sc.next());
				System.out.println("Enter DOB:");
				myobj.setDOB(sc.next());
				System.out.println("Enter DOJ:");
				myobj.setDOJ(sc.next());
				System.out.println("Enter Designation:");
				myobj.setDesignation(sc.next());
				System.out.println("Enter Experience:");
				myobj.setExp(sc.nextDouble());
				System.out.println("Enter Salary:");
				myobj.setSalary(sc.nextDouble());
				Emp_details[i]=myobj;	
				//myobj.display(Emp_details,n);
				
			}for(int i=0;i<n;i++) {System.out.print(
					Emp_details[i].getEmp_id()+" "+
					Emp_details[i].getEmp_name()+" "+
					Emp_details[i].getDOB()+" "+
					Emp_details[i].getDOJ()+" "+
					Emp_details[i].getDesignation()+" "+
					Emp_details[i].getSalary()+" "+
					Emp_details[i].getExp());
			System.out.println(" ");}
			
			System.out.println("Do you want to update(true/false):");
			boolean change=sc.nextBoolean();
			do{
				System.out.println("Enter  the user name you want to update:");
				String username=sc.next();
				
				for(int i=0;i<n;i++) {
					if(Emp_details[i].getEmp_name().equalsIgnoreCase(username)) {
						index=i;
					
				
				System.out.println("Do you want to update any information(true/false):");
				boolean update=sc.nextBoolean();
				//System.out.println("1.Emp_id,2.Emp_name,3.DOB,4.DOJ,5.designation,6.Salary,7.Exp");
				//System.out.println("Which details you want to cange:");
				
				do {System.out.println("1.Emp_id,2.Emp_name,3.DOB,4.DOJ,5.designation,6.Salary,7.Exp");
				System.out.println("Which details you want to change:");
				int choice=sc.nextInt();
				switch(choice){
					case 1:
						System.out.println("Change Emp_id:");
						int NewEmp_id=sc.nextInt();
						Emp_details[index].setEmp_id(NewEmp_id);
						break;
					case 2:
						System.out.println("Change Emp_name:");
						String NewEmp_name=sc.next();
						Emp_details[index].setEmp_name(NewEmp_name);
						break;
					case 3:
						System.out.println("Change DOB:");
						String NewDOB=sc.next();
						Emp_details[index].setDOB(NewDOB);
						break;
					case 4:
						System.out.println("Change DOJ:");
						String NewDOJ=sc.next();
						Emp_details[index].setDOJ(NewDOJ);
						break;
					case 5:
						System.out.println("Change designation:");
						String Newdesignation=sc.next();
						Emp_details[index].setDesignation(Newdesignation);
						break;
					case 6:
						System.out.println("Change salary:");
						double NewSalary=sc.nextDouble();
						Emp_details[index].setSalary(NewSalary);
						break;
					case 7:
						System.out.println("Change Exp:");
						double NewExp=sc.nextDouble();
						Emp_details[index].setExp(NewExp);
						break;
				}System.out.println("Do you want to update any information(true/false):");
				update=sc.nextBoolean();
				//System.out.println("1.Emp_id,2.Emp_name,3.DOB,4.DOJ,5.designation,6.Salary,7.Exp");
				//System.out.println("Which details you want to cange:");
				}while(update);}}
				System.out.println("Do you want to update(true/false):");
				change=sc.nextBoolean();
				
			}while(change);
			for(int i=0;i<n;i++) {System.out.print(
					Emp_details[i].getEmp_id()+" "+
					Emp_details[i].getEmp_name()+" "+
					Emp_details[i].getDOB()+" "+
					Emp_details[i].getDOJ()+" "+
					Emp_details[i].getDesignation()+" "+
					Emp_details[i].getSalary()+" "+
					Emp_details[i].getExp());
			System.out.println(" ");}
			
		}
		
		private void setExp(double Exp) {
			this.Exp=Exp;			
		}
		private double getExp() {
			return Exp;			
		}
		private void setSalary(double Salary) {
			this.Salary=Salary;
		}
		private double getSalary() {
			return Salary;			
		}
		private void setDesignation(String Designation) {
			this.Designation=Designation; 
		}
		private String getDesignation() {
			return Designation; 
		}
		private void setDOJ(String DOJ) {
			this.DOJ=DOJ;
		}
		private String getDOJ() {
			return DOJ;	
		}
		private void setDOB(String DOB) {
			this.DOB=DOB;
		}
		private String getDOB() {
			return DOB;			
		}
		private void setEmp_name(String Emp_name) {
			this.Emp_name=Emp_name;			
		}
		private String getEmp_name() {
			return Emp_name;			
		}
		private void setEmp_id(int Emp_id) {
			this.Emp_id=Emp_id;
		}
		private int getEmp_id() {
			return Emp_id;
		}


	}


