package Employees;

//import java.util.Scanner;

public class EmployeePF {
	String name;
	int emp_id;
	double basic_salary;
	
	
	EmployeePF() {
		
	}  //Default Constructor
	
	EmployeePF(String name,int id,double salary){
		this.name = name;
		this.emp_id = id;
		this.basic_salary = salary;
		
	}  //Parameterized constructor
	
	void calculate() {
		double pf  = 10*basic_salary;
		double allowance = 5000 + basic_salary;
	
		System.out.println("pf of 10% will be: " + pf);
		System.out.println("salary after allowance is: " + allowance);
		System.out.println("For " + name + " whose id is " + emp_id + " having salary: " +basic_salary);
		
	}
	
	public static void main(String args[]) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter employee id: ");
		int id = sc.nextInt();
		System.out.println("Enter Salary: ");
		double basic_salary = sc.nextDouble();
		EmployeePF obj = new EmployeePF();*/
		EmployeePF objA = new EmployeePF("Raj", 101, 70000);
		//obj.calculate();
		objA.calculate();
		
		
	}

}
