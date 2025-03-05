package Activities1;

import java.util.HashSet;
import java.util.Set;


public class Activity10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs = new HashSet<>();
		//Adding element to Handset
		hs.add("M");
		hs.add("B");
		hs.add("A");
		hs.add("C");
		hs.add("M");
		hs.add("X");
		
		//print hashset
		System.out.println("Original Hashset: " + hs);
		//print of size of hashset
		System.out.println("Size of Hashset: " + hs.size());
		
		//remove element
		System.out.println("Removing A from hashset " + hs.remove("A"));
		
		//remove element that is not present
		if (hs.remove("Z")) {
			System.out.println("Z removed from the set ");
			
		}else {
			System.out.println("Z is not present in the set");
			
		}
		System.out.println("Checking if M is present " + hs.contains("M"));
		System.out.println("Update Hashset" + hs);
		
		
		
		
		
	}
}


