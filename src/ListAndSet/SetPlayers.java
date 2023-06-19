package ListAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPlayers {

	public static void main(String[] args) {
		
		
		Set<String> myset = new HashSet<String>();  //HashSet Class-> It will print the set in random order
		myset.add("Bruno");
		myset.add("Rashford");
		myset.add("Varane");
		myset.add("Bruno");
		myset.add("Degea");
		
		System.out.println("----------HASHTAG--------------");
		
		for (String AllSetPlayers : myset) {  //ForeachLoop
			System.out.println(AllSetPlayers);		
		}
		
		System.out.println(myset.size()); //Checking size of the set
		
		System.out.println("----------LINKED HASHTAG--------");
		
		
		Set<String> myset1 = new LinkedHashSet<String>(); //LinkedHashSet --> It will print the set value in same order
		myset1.add("Martial");
		myset1.add("Antony");
		myset1.add("Licha");
		myset1.add("Martial");
		myset1.add("Shaw");
		
		for (String AllSet1Players : myset1) {  //ForeachLoop
			System.out.println(AllSet1Players);		
		}
		
		System.out.println("----------TREE SET--------------");
		
		Set<String> myset2 = new TreeSet<String>();  //TreeSet --> It will print the set value in alphabetic order
		myset2.add("Eriksen");
		myset2.add("Dalot");
		myset2.add("Eriksen");
		myset2.add("Casemiro");
		myset2.add("garnacho");
		
		for (String AllSet2Players : myset2) {  //ForeachLoop
			System.out.println(AllSet2Players);		
		}
				
	}

}
