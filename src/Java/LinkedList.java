package Java;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.LinkedList<Integer> numbers = new java.util.LinkedList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers.get(1));
		for (Integer Allnumbers : numbers) {
			System.out.println("Number : " + Allnumbers);
		}

	}

}
