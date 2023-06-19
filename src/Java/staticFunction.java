package Java;

public class staticFunction {
	
	static int a = 10; //We can't use the non-static variable in static function
	
	public static void counter() { //Static function|method
		System.out.println(a);
	}
	
	public void smallcounter() { //Non-Static function|method
		System.out.println(a);	
	}

	public static void main(String[] args) {
		staticFunction glass = new staticFunction();
		counter();// We can call without class and with class too.. No need of object for static function
		glass.smallcounter();
		
		
		//Example for Integer.parseInt
		String a = "10"; 
		String b = "59";
		int c = Integer.parseInt(a); //this static function used to add/sub the string function
		int d = Integer.parseInt(b);
		System.out.println(c+d);

	}

}
