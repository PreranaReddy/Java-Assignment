
public class Student {
	String usn,name;
	int grade;
	
	Student(String usn,String name,int grade){
		this.usn = usn;
		this.name = name;
		this.grade = grade;
	}
	
	boolean isEqual(Student ob) {
		if(usn == ob.usn && name == ob.name && grade == ob.grade)
		
		return true;
		return false;	
		
	}
	
	public static void main(String[] args) {
	Student obj1 = new Student("123cc","prer",10);
	Student obj2 = new Student("123cc","prer",10);
	if(obj1.isEqual(obj2)) 
		System.out.println("The objects are equal");
	else
		System.out.println("the objects are not equal");
	
	
	}
	 

}
