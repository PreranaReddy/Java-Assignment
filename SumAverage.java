import java.util.Scanner;

public class SumAverage {
	
	public static void main(String[] args)
	{
		
		
		int even_sum = 0,odd_sum = 0;
		int even_avg=0,odd_avg=0;
		int ecount = 0, ocount=0;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter all the elements: ");
		int a[] = new int[n];*/
		
		for(int i=0;i<args.length;i++) {
			//a[i] = sc.nextInt();
			int x = Integer.parseInt(args[i]);
			if(x%2==0) {
				ecount++;
				even_sum = even_sum+x;
				even_avg = even_sum/ecount;
			
			}
			else {
				ocount++;
				odd_sum = odd_sum+x;
				odd_avg = odd_sum/ocount;
			}
		}
		System.out.println("The sum and average of even integers are: " +even_sum+ " and " +even_avg);
		System.out.println("The sum and average of odd integers are: " +odd_sum+ " and " +odd_avg);

	}

}
