package schoolwork;

import java.util.*;

public class CollectionsPractice {
	
	public static void output(List inputList) {
		for (Object list : inputList) { //iterating through the input list using for each
			System.out.print(list + " ");
		}
		
		System.out.println("");
	}

	public static void main(String[] args) {
		ArrayList myInitials = new ArrayList(); // creating arraylist
		
		myInitials.add("E"); // filling
		myInitials.add("N");
		myInitials.add("S");
		
		System.out.println("Initial List");
		output(myInitials);
		
		System.out.println("Reversed List");
		
		Collections.reverse(myInitials);
		output(myInitials);
		
		System.out.println("Copied List");
		
		List copiedList = new ArrayList(myInitials);
		output(copiedList);
		
		System.out.println("R filled List");
		myInitials.set(0, "R");
		myInitials.set(1, "R");
		myInitials.set(2, "R");
		output(myInitials);
	}
}
