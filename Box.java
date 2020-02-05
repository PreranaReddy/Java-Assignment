
public class Box {
	
	 double length =0, breadth = 0,height = 0;
	 double vol;
	
	Box(double l,double b,double h){
		this.length = l;
		this.breadth = b;
		this.height = h;
		
	}
	public Box(Box ob)
	{
		length=ob.length;
		breadth = ob.breadth;
		height = ob.height;
	}
	
	void volume() {
		 vol = length * breadth * height;
		//System.out.println("The volume of the box having length " + length+ ",breadth " +breadth+ " and height " +height + " is: " +vol);
	}
	
	public static void main(String[] args) {
		Box obj = new Box(11.5, 5.25,15);
		Box ob1=new Box(obj);
		obj.volume();
		System.out.println("The volume of the box having length " + obj.length+ ",breadth " +obj.breadth+ " and height " +obj.height + " is: " + obj.vol);
	}

}
