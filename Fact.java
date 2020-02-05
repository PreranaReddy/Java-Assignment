//import java.util.Scanner;

public class Fact {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int i,n, fact=1;
			
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Enter the value:");
			//n = sc.nextInt();
			n=Integer.parseInt(args[0]);
			
			if(n==0 || n==1) 
			{ 
				fact = 1;
			} //System.out.println("Factorial of " +n+ " is: " +fact);
			
			for(i=2;i<=n;i++)
			{
				fact = fact*i;}
				System.out.println("Factorial of " +n+ " is: " +fact);
			//sc.close();
		}

	}


