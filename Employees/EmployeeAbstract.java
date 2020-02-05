package Employees;

import java.util.Scanner;

abstract class AbstractEmployee {
	int emp_id;
	String name;
	int YOE;
	String designation;
	int basic_salary,net_salary;
	int HRA,DA,GS,IT;
	
	public abstract void netSalary();
	
	public abstract void displayInfo();
	
	AbstractEmployee(int emp_id,String name,
	int YOE,
	String designation,
	int basic_salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.YOE = YOE;
		this.designation =  designation;
		this.basic_salary = basic_salary;
		
	}
}


class Employee extends AbstractEmployee{
public Employee(int emp_id, String name, int YOE, String designation, int basic_salary)
{
	super(emp_id,name,YOE,designation,basic_salary);
}
	@Override
	public void netSalary() {
		// TODO Auto-generated method stub
		
		//assuming values
		
		HRA = (10/100)*basic_salary;
		DA = (73)*basic_salary;
		GS = basic_salary+DA+HRA;
		IT = (30/100)*GS;
		net_salary = GS - IT;
		System.out.println("The net salary of this employee is: " + net_salary);
		
		
	}
	
	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Employee name: " + name);
		System.out.println("Employee id: " + emp_id);
		System.out.println("Empolyee Years of exp: " + YOE);
		System.out.println("Employee designation: " + designation);
		System.out.println("Basic salary: " + basic_salary);
		
	}

}

public class EmployeeAbstract {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("id: ");
		int emp_id = sc.nextInt();
		System.out.println("years of exp: ");
		int YOE = sc.nextInt();
		System.out.println("designation: ");
		String designation = sc.next();
		System.out.println("basic salary: ");
		int basic_salary = sc.nextInt();
		
		Employee emp1 = new Employee(emp_id,name,YOE,designation,basic_salary);
		emp1.netSalary();
		emp1.displayInfo();
		
	}

}
