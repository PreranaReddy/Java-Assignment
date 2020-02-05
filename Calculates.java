//import java.util.Scanner;

public class Calculates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double income_tax ;
		//double slab_rate = 60000 ;
		double additional_amount;
		double slab_rate = Integer.parseInt(args[0]);
		
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter the slab rate: ");
		slab_rate = sc.nextDouble(); */
		
		if(slab_rate <= 50000) {
			income_tax = 0;
			System.out.println(" IT for " +slab_rate+ "is: " +income_tax);
		}
		
		else if(slab_rate >50000 && slab_rate<=60000) {
			 additional_amount = slab_rate-50000;
			income_tax = additional_amount*(0.1);
			System.out.println("IT for " +slab_rate+ "is: " +income_tax);
		}
		
		else if(slab_rate >60000 && slab_rate<=150000) {
			additional_amount = slab_rate-60000;
			income_tax = additional_amount*(0.2);
			System.out.println(" IT for " +slab_rate+ "is: " +income_tax);
		}
		
		else{
			additional_amount = slab_rate-150000;
			income_tax = additional_amount*(0.3);
			System.out.println("IT for " +slab_rate+ "is: " +income_tax);
		}

	}

}
