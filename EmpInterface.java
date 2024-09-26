package MyPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


//Bonus functional interface
interface BonusCalculator {
    double calculateBonus(emp employee);
}

class emp {
    private int empId;
    private String empName;
    private String designation;
    private double salary;
    private int empAge;

    // Constructor
    public emp(int empId, String empName, String designation, double salary, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.salary = salary;
        this.empAge = empAge;
    }
    public emp() {
    	
    }
    // Getter and Setter methods

    public emp(String empName, int empAge, double increasedSalary) {
         this.empName=empName;
         this.empAge=empAge;
        
    
    }
	public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    
    

    public static String getEmployeeName(emp employee) {
        return employee.getEmpName();
    }
    
    public static List<emp> multiplySalaries(List<emp> employeeList, double factor) {
    	 return employeeList.stream()
                 .map(employee -> {
                     try {
                         return new emp(
                                 employee.getEmpId(),
                                 employee.getEmpName(),
                                 employee.getDesignation(),
                                 employee.getSalary() * factor,
                                 employee.getEmpAge()
                         );
                     } catch (IllegalArgumentException e) {
                         // Handle illegal argument exception
                         System.err.println("IllegalArgumentException: " + e.getMessage());
                         return null; // or handle accordingly based on your requirements
                     }
                 })
                 .filter(employee -> employee != null) // Filter out null employees
                 .collect(Collectors.toList());
    }
    public static double calculateBonus(emp employee, BonusCalculator bonusCalculator) {
        try {
            return bonusCalculator.calculateBonus(employee);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
            return 0.0;
        }
}
	public static double calculateBonus1(emp employee, Double salary) {
		return employee.getSalary() * salary;
	}
	@Override
	public String toString() {
		return "emp [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary=" + salary
				+ ", empAge=" + empAge + "]";
	} 
	
}
    
public class EmpInterface {
	public static void main(String[] args) {
        
        List<emp> employeeList = new ArrayList<>();
        employeeList.add(new emp(1, "Alice", "Manager", 60000, 30));
        employeeList.add(new emp(2, "Bob", "Developer", 50000, 25));
        employeeList.add(new emp(3, "Charlie", "Analyst", 45000, 28));
        
        employeeList.stream()
       .map(emp::getEmployeeName)
       .forEach(employeeName -> System.out.println("Employee name: " + employeeName));
        
        
        BonusCalculator bonusCalculator = emp -> emp.getSalary() * 0.1;
        employeeList.stream()
                .map(employee -> emp.calculateBonus(employee, bonusCalculator))
                .forEach(bonus -> System.out.println("Bonus: " + bonus));
    
        double factor = 1.1;
        List<emp> multipliedSalaries =
        		emp.multiplySalaries(employeeList, factor);
        multipliedSalaries.forEach(emp -> System.out.println(emp.getEmpName()
        		+ "'s new salary: " + emp.getSalary()));
	
	    
	
        List<Integer> salaryIntegers = employeeList.stream()
                .map(emp::getSalary) // Extract salaries
                .map(Double::intValue) // Convert salaries to integers
                .collect(Collectors.toList());

        System.out.println("Salaries as Integers: " + salaryIntegers);
        
        List<String> salaryStrings = employeeList.stream()
                .map(employee -> "Salary of " + employee.getEmpName() + ": " + employee.getSalary())
                .collect(Collectors.toList());

        System.out.println("Salaries as Strings: " + salaryStrings);

	
        Function<emp, Function<Double, String>> curriedBonus = employee ->
        salary -> employee.getEmpName() + "'s bonus: " + employee.calculateBonus1(employee,salary);
        
        List<String> bonusMessages = employeeList.stream()
                .map(employee -> curriedBonus.apply(employee).apply(0.1)) // Example: 10% bonus
                .collect(Collectors.toList());
        
        System.out.println(bonusMessages);
        
	    List<String> empName=employeeList.stream()
	    		.map(emp::getEmpName)
	    		.sorted()
	    		.collect(Collectors.toList());
	    List<Integer> empAge=employeeList.stream()
	    		.map(emp::getEmpAge)
	    		.sorted()
	    		.collect(Collectors.toList());
	    
	    List<emp> sortedEmployees = employeeList.stream()
                .sorted(Comparator.comparingDouble(emp::getEmpAge)
                        .thenComparing(Comparator.comparing(emp::getEmpName)))
                .collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);
        
        
        
     // Using a closure with filter
        int minAge = 30;
        Predicate<emp> ageFilter = employee -> employee.getEmpAge() >= minAge;

        List<emp> filteredEmployees = employeeList.stream()
                .filter(ageFilter)
                .collect(Collectors.toList());
        
        System.out.println("Employees older than or equal to " + minAge + ":");
        filteredEmployees.forEach(employee -> System.out.println("Name: " + employee.getEmpName() + ", Age: " + employee.getEmpAge() + ", Salary: " + employee.getSalary()));
     // Using a closure with map
        double salaryIncreasePercentage = 0.10;
        employeeList.stream()
                .map(employee -> {
                    double increasedSalary = employee.getSalary() * (1 + salaryIncreasePercentage);
                    return new emp(employee.getEmpName(), employee.getEmpAge(), increasedSalary);
                })
                .forEach(System.out::println);

        
        
        
        System.out.println("Original Employee List:");
        employeeList.forEach(System.out::println);
        
        // Example 1: Filter employees younger than 30
        System.out.println("\nFilter by Age (younger than 30):");
        
       filterAndPrint(employeeList, "^(2[0-9]|1[0-9]|[1-9])$", emp -> emp.getEmpAge());
       
        // Example 2: Filter employees with 'Developer' in their designation
        System.out.println("\nFilter by Designation (contains 'Developer'):");
        filterAndPrint(employeeList, ".*Developer.*",emp ->emp.getDesignation());

        // Example 3: Filter employees with a salary between 50000 and 60000
        System.out.println("\nFilter by Salary Range (50000 to 60000):");
        filterAndPrint(employeeList, "^(50000.0|55000.0|56000|57000|58000|"
        		+ "59000|60000.0)$",emp->emp.getSalary());

        // Example 4: Filter employees with names longer than 5 characters
        System.out.println("\nFilter by Name Length (longer than 5 characters):");
        filterAndPrint(employeeList, "^.{6,}$",emp->emp.getEmpName());
    }

	private static void filterAndPrint(List<emp> employees, String regex, Function<emp, ?> attributeExtractor) {
	    List<emp> filteredEmployees = employees.stream()
	            .filter(employee -> {
	                String attribute = String.valueOf(attributeExtractor.apply(employee));
	                return Pattern.matches(regex, attribute);
	            })
	            .collect(Collectors.toList());

	    filteredEmployees.forEach(System.out::println);
	}
}	
	
	
	
	

	



