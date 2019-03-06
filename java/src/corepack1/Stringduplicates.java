package corepack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @author Praveen
 *
 * In this we are converting String into character list and set. 
 * using set, we are verifying in list for number occurrences for each and every character
 * by using Java provided method 'frequency'.
 * 
 */
public class Stringduplicates {

	public static void main(String[] args) {
		
		String str = "Hello welome";
		List <Character> charList = new ArrayList <Character> () ; 
		HashSet<Character>  hs = new HashSet <Character> () ;
		
		for (char c : str.toCharArray()) {
			charList.add(c);        /// adding each char to List
			hs.add(c);              // add chars to set 
		}

		
		// count no of occurrences for each latter 	
		for (char obj : hs) {
		int count =	Collections.frequency(charList, obj );
			System.out.println("Latter  '"+obj +"' And count is " +count);
		}
			
	}
}
