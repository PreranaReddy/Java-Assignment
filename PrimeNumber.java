import java.util.Scanner;
public class PrimeNumber{
public static void main (String[] args){
    
	int m=0,flag = 0;
    /*Scanner sc = new Scanner (System.in);
    System.out.println("Enter the size:");
    int n  = sc.nextInt();
    System.out.println("Enter the elements of the array: ");
    int[] a = new int [n]; 
	
    for(int i=0; i<args.length; i++)
    {
        
    	a[i] = sc.nextInt();
    }*/
    for(int i=0; i<args.length; i++) {
    	m = Integer.parseInt(args[i]);
          
         flag=0;
        for(int j=2;j<=m/2;j++) {
        	if(m%j == 0) {
        		flag = 1;
        		break;
        	}   		
        }
        if(flag == 0)
        {
            System.out.println(m);
            
        }
     }
    System.out.println("prime numbers");
    //sc.close();
}
}