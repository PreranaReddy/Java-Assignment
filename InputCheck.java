import java.util.Scanner;

public class InputCheck {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
	    char ch[] = str.toCharArray();
	    
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[i] >= 'A' && ch[i]<='Z' ) {
	    		System.out.println("\n " + ch[i] + " is uppercase Char");
	    		
	    	}
	    	else if(ch[i] >='a' && ch[i]<= 'z') {
	    		System.out.println("\n " + ch[i] + " is an lowercase Char");
	    	}
	    	else if(ch[i]>='0' && ch[i]<='9') {
	    		System.out.println("\n " + ch[i] + " digit");
	    	}
	    	else {
	    		System.out.println("\n " + ch[i] + " is a special character");
	    	}
	    }
		

	}

}
