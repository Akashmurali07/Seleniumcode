package Java;

import java.util.Arrays;

public class arrays {

	
	public static void main(String[] args) {
		
		int[] out = new int[3]; //Arrays with object
		out[0] = 100;
		out[1] = 120;
		out[2] = 150;
		System.out.println(out[1+1]);
		
		
		
		String[] positions = {"CF","CMF","CB","GK"}; //Array syntax
		System.out.println(positions[2]);
		System.out.println(positions.length); //length func used to find the num of values in arrays
		System.out.println(positions.length-1);
		System.out.println(positions);
		System.out.println(Arrays.toString(positions)); //toString is used to print all the values
	}

}
