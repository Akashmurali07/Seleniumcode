package Java;

public class Variables {
	
	int c; //Instance variable
	
	void addtwonumbers(int a, int b) {
		//int c=5; //Local Variable
		System.out.println(a+b+this.c); //if we mention this. func it will take instance variable value
	}

	public static void main(String[] args) {
		
		Variables Add = new Variables();
		Add.addtwonumbers(55, 11);

	}

}
