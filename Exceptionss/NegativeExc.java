package Exceptionss;

import java.util.Scanner;

public class NegativeExc {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		System.out.println("Enter the elements: ");
		int arr[] = new int[n];
		
		for( i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		} 
		
		for( i=0;i<arr.length;i++)
			{
			System.out.print(arr[i] + "\t");
			
		
		try {
			if(arr[i] < 0) {
				throw new MyException("\n Element entered is negative");
			}
		}
		catch(MyException ex)
		{
			System.out.println("\n Exception caught");
			
			System.out.println(ex.getMessage());
		}
	}
sc.close();
}
}
