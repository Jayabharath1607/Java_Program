import java.util.Scanner;

public class Employee {
	public static void main (String[]args)
	{
		String name;
		int employeeage;
		float employeesalary;
		String employeedept;
		double employeeyearsalary;
		
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Employee: \t");
		name = input.nextLine();
		
		System.out.println("Enter the Age of the Employee: \t");
		employeeage = input.nextInt();
		
		System.out.println("Enter the Salary of the Employee: \t");
		employeesalary = input.nextFloat();
		
		System.out.println("Enter the Department of the Employee:\t");
		employeedept = in.nextLine();
		
		employeeyearsalary = 12*employeesalary;
		
		System.out.println("Name, Age, Department and Salary per year of the Employee are " 
				+name+" , "+employeeage+", "  +employeedept+" and "+employeeyearsalary);
	
	}
	

}
