package Java;

public class Constructors {
	
	public Constructors(int x){ 
		this.x = x;
	}
	
	public Constructors(String name, boolean choose) { //Overloading
		this.name = name;
		this.choose = choose;
	}
	
	int x;
	String name;
	boolean choose;
	
	public void display() {
		
		System.out.println(x + " by " + name + " is " + choose);
	}

	public static void main(String[] args) {
		
		Constructors Const = new Constructors(10);
		Const.display();
		
		Constructors Constant = new Constructors("Akash", false);
		Constant.display();
		

	}




}
