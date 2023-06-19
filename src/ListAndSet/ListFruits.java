package ListAndSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListFruits {

	public static void main(String[] args) {
		
		
		List<String> mylist = new ArrayList<String>(); //Used ArrayList Class here
		mylist.add("Apple");
		mylist.add("Mango");
		mylist.add("Apple");
		mylist.add("banana");
		mylist.add("watermelon");
		
		Collections.sort(mylist); //Sorting
		
		for (String Allfruit : mylist) {   //Foreachloop to print all values in the list
			System.out.println(Allfruit);	
		}
		
		String SecondValue = mylist.get(1); //Using Get Function to get the list value 
		System.out.println("SecondValue is " + SecondValue);
		
		int listsize = mylist.size();  //Used to find the size of the list
		System.out.println("my list size = " + listsize);
		
		System.out.println("------------------------");
		
		mylist.remove("banana");  //Removing the value
		
		for (String Allfruit : mylist) {   //ForLoop
			System.out.println(Allfruit);	
		}
		
		int listafterRemove = mylist.size();  
		System.out.println("my new list size = " + listafterRemove);
		
		boolean iscontains = mylist.contains("watermelon");  //Iscontains > to check the value is contain in the list 
		System.out.println("Is Watermelon contains : " + iscontains);
		
		mylist.clear(); //Clearing the List
		
		boolean IsListEmpty = mylist.isEmpty(); //IsEmpty function to check the list is empty or not
		System.out.println("Is List Empty : " + IsListEmpty);
			

	}

}
