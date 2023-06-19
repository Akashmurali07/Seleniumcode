package Java;

public class Overloading {
	
	
	static String names(String a, String b) {
		return a + b;
	}
	
	static String names(String man, String ars, String liv) {
		return man;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String output1 = names("Akash", "Murali");
		String output2 = names("Reddevil", "Arsenal", "Liverpool");
		System.out.println(output1 + " is " + output2);

	}
}
