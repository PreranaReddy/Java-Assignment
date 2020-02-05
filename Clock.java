import java.util.Scanner;

public class Clock {
	int hours,minutes,seconds;
	String meridiem;
	
	Clock(int hours,int minutes,int seconds,String meridiem){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.meridiem = meridiem;
	}
	
	void time() {
		if(hours>=1 && hours<=12) 
			if(minutes>=1 && minutes<=60) 
				if(seconds>=1 && seconds<=60) 
					System.out.println("Valid\n");
				
				else 
					System.out.println("not valid");
				
	}
	
	void meridiem() {
		System.out.println("Time now is\n");
		System.out.println(+hours+":"+minutes+":" +seconds+ " " +meridiem);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("hour: ");
		int hours = sc.nextInt();
		System.out.println("minutes: ");
		int minutes = sc.nextInt();
		System.out.println("seconds: ");
		int seconds = sc.nextInt();
		System.out.println("meridiem: ");
		String meridiem = sc.next();
		
		Clock obj = new Clock(hours, minutes, seconds, meridiem);
		obj.time();
		obj.meridiem();
		
		sc.close();
	}

}
