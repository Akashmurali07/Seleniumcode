package Java;

public class staticVariable {
	
	int x;  //for non-static variable, value increment will be start from beginning for new object
	static int y;  //for static variable, value increment will continue
	
	public void damage() {  // function|method
		x++;
		y++;
		
		System.out.println("non-static = " + x + " | static = " + y);
	}

	public static void main(String[] args) {
		
		staticVariable united = new staticVariable(); // united = object  //staticVariable() = constructor
		united.damage();
		united.damage();
		united.damage();
		
		staticVariable united2 = new staticVariable();
		united2.damage();
		united2.damage();
		
		staticVariable united3 = new staticVariable();
		united3.damage();
		united3.damage();
		

	}

}
