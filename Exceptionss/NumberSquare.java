package Exceptionss;



public class NumberSquare {
	public static void main(String[] args) {
		int i;
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11};
		
		for(int elements : arr) {
			System.out.print(elements + "\t");
		}
		System.out.println();
		
		
		for( i=0; i<arr.length; i++) {
			arr[i] = (int) Math.pow(arr[i], 2);
		}
		
		for(int square :  arr) {
			System.out.print(square + "\t");	
	}
		try {
			if(arr.length > 10) {
				throw new MyException("\n Range exceeds 10");
			}
		} 
		catch(MyException ex)
		{
			System.out.println("\n Exception caught");
			
			System.out.println(ex.getMessage());
		}

}
}
