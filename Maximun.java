import java.util.Scanner;

public class Maximun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n;
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all elements"); 
		int max = a[0];*/
		int max = Integer.parseInt(args[0]);
		
		for(int i=0;i<args.length;i++) 
		{
			
			//a[i] = sc.nextInt();
			
			int x = Integer.parseInt(args[i]);
			if(x>max) 
				max = x;
			
		}
		System.out.println("Max value in the array is: " +max);
		
		

	}

}
