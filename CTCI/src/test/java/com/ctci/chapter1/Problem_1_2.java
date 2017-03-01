/**
 * 
 */
package com.ctci.chapter1;

/**
 * @author juniebonifacio
 *
 */
public class Problem_1_2 {

	/**
	 * 1.2 Check Permutation: Given two strings, write a method to decide
	 * if one is a permutation of the other.
	 * 
	 *  Optimization: Observe first that strings of different lengths cannot be
	 *  				permutations of each other.
	 * 
	 * Solution 1: Sort the strings.
	 * 				- First check if size of both strings are equal
	 * 				- Second, sort the strings and check/compare if both are equal.
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean permutation(String x, String y) {
		
		if(isNullOrEmpty(x) && isNullOrEmpty(y)) { //check for special cases remember!
			return false;
		}
		
		if(x.length() != y.length()) 
			return false;
		
		return sort(x).equals(sort(y));
	}
	
	public String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public boolean isNullOrEmpty(String s) {
		if(null == s || s.isEmpty()) {
			return true;
		}
		return false;
	}
	
	/**
	 *  Optimization: Observe first that strings of different lengths cannot be
	 *  				permutations of each other.
	 * 
	 * 
	 * Solution 2: Check if the two strings have identical character counts.
	 * 				- Same optimization first, check if length of both strings are equal.
	 * 
	 * 				- Use the definition of a permutation, two words with same character counts.
	 * 				  Count how many times each character appears, 
	 * 				  then compare the two arrays.
	 * 				
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean permutation_Sol2(String x, String y) {
		
		if(isNullOrEmpty(x) && isNullOrEmpty(y)) { //check for special cases remember!
			return false;
		}
		
		if(x.length() != y.length()) 
			return false;
		
		int[] letters = new int[128]; //Assumption that char set is ASCII.
		//in the interview, you should always check with interviewer about the size
		//of the character
		
		char[] x_array = x.toCharArray();
		
		for(char count : x_array) {
			letters[count]++;
		}
		
		for(int i = 0; i < y.length(); i++) {
			int count = (int) y.charAt(i);
			letters[count]--;
			if(letters[count] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String pairs[][] = {{"apple","papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		
		Problem_1_2 p = new Problem_1_2();
		for (int i = 0; i < pairs.length; i++) {
			String pair[] = pairs[i];
			boolean anagram = p.permutation(pair[0], pair[1]);
			System.out.println("anagram: " + anagram);			
		}
		
		for (int i = 0; i < pairs.length; i++) {
			String pair[] = pairs[i];
			boolean anagram = p.permutation_Sol2(pair[0], pair[1]);
			System.out.println("anagram: " + anagram);			
		}

	}
}
