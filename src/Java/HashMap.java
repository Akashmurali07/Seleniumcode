package Java;

public class HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.HashMap<Integer, String> Rollno = new java.util.HashMap<>();
		Rollno.put(1, "Manchester United");
		Rollno.put(2, "Arsenal");
		Rollno.put(3, "Mancity");
		Rollno.put(4, "NewCastle");
		
		System.out.println(Rollno.get(1));
		for (Integer i : Rollno.keySet()) {
			System.out.println("Team Position : " + i + " , " + Rollno.get(i));
		}
	}

}
