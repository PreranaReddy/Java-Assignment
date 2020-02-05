import java.util.Scanner;

class Person {
	
	String name,designation;
	int age;
	double basic;
	
	Person(String name,String designation,int age,double basic){
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.basic = basic;
	}
	
	public void salary() {
		double hra = 30000;
		//double basic = 20000;
		double it = 0.1*basic;
		
		double salary = hra + basic - it;
		System.out.println("salary of employee " + name+ ",designation " +designation+ " is : " +salary);
		
	}
	

}

class Politician extends Person {
	
	String party;
	String symbol;
	
	Politician(String name,String designation, int age,double basic,String party,String symbol){
		super(name,designation,age,basic);
		this.party=party;
		this.symbol = symbol;
	}
	
	
}

class Sportsman extends Person {
	String game;
	int jersey_no;

	Sportsman(String name, String designation, int age,double basic, String game,int jersey_no) {
		super(name, designation, age,basic);
		this.game = game;
		this.jersey_no = jersey_no;
		
	}
	
}

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		String name = sc.next();
		System.out.println("designation: ");
		String designation = sc.next();
		System.out.println("age: ");
		int age = sc.nextInt();
		System.out.println("basic salary: ");
		double basic =sc.nextDouble();
		
		/*Politician objP  = new Politician(name, designation, age, basic, "BJP", "Lotus");
		objP.salary();*/
		
		Sportsman objS = new Sportsman(name,designation,age, basic, "BasketBall", 24);
		objS.salary();
		
		
	
		
	}
	
	
}
