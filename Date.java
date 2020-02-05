import java.util.Scanner;

public class Date {
	int day,month,year;
	
	Date(int day,int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	void validity() {
	
			if(day>=1 && day<=31 || day<=30 || day<=28 || day<=29) 
				System.out.println("day valid");
			
			if(month>=1 && month<=12)
				System.out.println("month valid");
			else
				System.out.println("month not valid");
		
		
	}
	
	void display() {
		System.out.println("Today's date is: \n");
		System.out.println(+day+ "/" +month+ "/" +year);
		
		System.out.println("Tomorrow's date will be: ");
		//System.out.println(+ day+1 + "/" +month+ "/" +year);
		if(day==28 || day==29 && month == 2) {
			System.out.println("1/" +(month+1) + "/" +year);
		}
		if(day==30 && month == 4 || month ==6 || month==9 || month == 11) {
			System.out.println("1/" +(month+1) + "/" +year);
		}
		if(day==31 && month == 1 || month ==3 || month==5 || month == 7 || month == 8 || month == 10) { 
			System.out.println("1/" +(month+1) + "/" +year);
	}
		if(month == 12 && day==31) {
			month = 1;
			year++;
			System.out.println("1/" +month + "/" +year);
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("day: ");
		int day = sc.nextInt();
		System.out.println("month: ");
		int month = sc.nextInt();
		System.out.println("year: ");
		int year = sc.nextInt();
		
		Date obj = new Date(day, month, year);
		obj.validity();
		obj.display();
		
	}

}
