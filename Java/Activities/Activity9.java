package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Saumya");
		myList.add("Laxmi");
		myList.add("Rita");
		myList.add("Lata");
		myList.add("Mayur");
		
		System.out.println("The List is : ");
		for(int i=0;i<myList.size();i++) {	
			System.out.println(myList.get(i));
		}
		
		if(myList.contains("Lata")) {
			System.out.println("The name is in the list");
		}else {
			System.out.println("The name is not in the list");
		}
		
		System.out.println("The size of the list is : " + myList.size());
		
		myList.remove("Mayur");
		
		System.out.println("The size of the list after removing name : " + myList.size());

	}

}
