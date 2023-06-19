package Java;

public class MaxArrays {

	public static void main(String[] args) {
		
		int arr[] = {44, -1, 88, 34, 77, 65};
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
