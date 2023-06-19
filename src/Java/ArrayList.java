package Java;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.ArrayList<String> names = new java.util.ArrayList<>();
		names.add("Akash");
		names.add("vicky");
		names.add("Murali");
		names.add("Ezhil");
		names.remove(0);
		System.out.println(names.size());
		for (String Allnames : names) {
			System.out.println(Allnames);
		}

	}

}
