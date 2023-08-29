package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Saumya");
		hs.add("Laxmi");
		hs.add("Rita");
		hs.add("Lata");
		hs.add("Mayur");
		hs.add("Piyush");
		
		System.out.println("The set is : " + hs);
		System.out.println("The size of the hashset is "+ hs.size());
		hs.remove("Lata");
		hs.remove("Piyush");
		
		if(hs.contains("Lata")) {
			System.out.println("The name is in the set");
		}else {
			System.out.println("The name is not in the set");
		}
		
		System.out.println("The final set is : " + hs);

	}

}
