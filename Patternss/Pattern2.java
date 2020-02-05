package Patternss;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args)
	{
	//int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n =  sc.nextInt();
		n++;
		for(int i=1;i<=n;i++)
		{
			
				for(int j=1;j<=n-i;j++) {
					
					System.out.print(j*i + " ");
				}
			
			System.out.println();
		}
		sc.close();
	}
}
