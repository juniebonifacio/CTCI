/**
 * 
 */
package com.ctci.chapter1;

import java.util.Hashtable;

/**
 * @author juniebonifacio
 *
 */
public class Problem_1_1 {

	/**
	 * 1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 * @param str
	 * @return
	 */
	public boolean isUnique(String str) {
		boolean isUnique = true;
		
		if(null == str || str.isEmpty()) {
			return false;
		}
		
		for(int i = str.length() - 1; i > 0 ; i--) {
			char currentChar = str.charAt(i); //begin at the last index
			for(int j = 0; j < i; j++) {
				if(currentChar == str.charAt(j)) {
					isUnique = false;
					break;
				}
			}
		}
		
		return isUnique;
	}
	
	public static void main(String[] args) {
		Problem_1_1 p = new Problem_1_1();
		String str = "Junie";
		boolean isUnique = p.isUnique(str);
		System.out.println("isUnique: " + isUnique);
		
	    str = "JunieBonifacio";
		isUnique = p.isUnique(str);
		System.out.println("isUnique: " + isUnique);
		
		isUnique = p.isUnique_Sol1(str);
		System.out.println("isUnique: " + isUnique);
		
		isUnique = p.isUnique_Sol2(str);
		System.out.println("isUnique: " + isUnique);
	}
	
	/**
	 * Assume ASCII.
	 * Write out the alphabet once
	 * Then go through your string character by character
	 * When you reach a character cross it out of your alphabet
	 * If you go to cross out a character and find that it has already
	 * been crossed out, then you know the character appeared previously in your string
	 * and you can then stop.
	 * 
	 * That's essentially what the code below does, using an array. 
	 * The operation completes in O(N) time 
	 * with O(K) extra space (where K is the number of keys you have).
	 * 
	 * Explanation courtesy of Richard: http://stackoverflow.com/questions/28775354/determine-if-string-has-unique-characters
	 * @param str
	 * @return
	 */
	public boolean isUnique_Sol1(String str) {
		
		if(null == str || str.isEmpty()){
			return false;
		}
		
		/**
		 * Assume that we only deal with ASCII characters i.e. 0-127
		 */
		if(str.length() > 128) {
			return false;
		}
		
		boolean char_set[] = new boolean[128]; //all values default to false
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i); //get the character at the specified index
			//System.out.println("val: " + val);
			if(char_set[val]) { //if the boolean value of the character
				return false;
			}
			char_set[val] = true;
		}
		
		return true;
	}
	
	/**
	 * We can reduce our space by a factor of eight by using a bit vector.
	 * We will assume, in the code below, that the string only uses the lowercase
	 * letters a to z. This will allow us to use just a single int.
	 * 
	 * Explanation: http://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
	 * 
	 * This solution is cute. The basic idea is the following: 
	 * imagine that you have an array of 26 booleans, each one tracking whether a 
	 * particular character has appeared in the string already. You start with all 
	 * of them false. You then iterate across the characters of the string, and 
	 * each time you see a character you look into the array slot for that character. 
	 * If it's false, this is the first time you've seen the character and you can 
	 * set the slot to true. If it's true, you've already seen this character and 
	 * you can immediately report that there's a duplicate.
	 * 
	 * Notice that this method doesn't allocate an array of booleans. 
	 * Instead, it opts for a clever trick. Since there are only 26 different 
	 * characters possible and there are 32 bits in an int, the solution creates 
	 * an int variable where each bit of the variable corresponds to one of the 
	 * characters in the string. Instead of reading and writing an array, the solution 
	 * reads and writes the bits of the number.
	 * 
	 * For example, look at this line:
	 * if ((checker & (1 << val)) > 0) return false;
	 * 
	 * What does checker & (1 << val) do? Well, 1 << val creates an int value that 
	 * has all bits zero except for the valth bit. 
	 * It then uses bitwise AND to AND this value with checker. 
	 * If the bit at position val in checker is already set, then this evaluates 
	 * to a nonzero value (meaning we've already seen the number) and we can return false. 
	 * Otherwise, it evaluates to 0, and we haven't seen the number.
	 * 
	 * The next line is this:
	 * checker |= (1 << val);
	 * 
	 * This uses the "bitwise OR with assignment" operator, which is equivalent to
	 * checker = checker | (1 << val);
	 * 
	 * This ORs checker with a value that has a 1 bit set only at position val, 
	 * which turns the bit on. It's equivalent to setting the valth bit of the number to 1.
	 * 
	 * This approach is much faster than yours. 
	 * First, since the function starts off by checking if the string has length 
	 * greater than 26 (I'm assuming the 256 is a typo), the function never has to 
	 * test any string of length 27 or greater. Therefore, the inner loop runs 
	 * at most 26 times. Each iteration does O(1) work in bitwise operations, 
	 * so the overall work done is O(1) (O(1) iterations times O(1) work per iteration), 
	 * which is significantly faster than your implementation.
	 * 
	 * If you haven't seen bitwise operations used this way, I'd recommend searching 
	 * for "bitwise operators" on Google to learn more.
	 * 
	 * Great answer. This video helps explain some of the core bit operator concepts: youtube.com/watch?v=d0AwjSpNXR0
	 * 
	 * @param str
	 * @return
	 */
	public boolean isUnique_Sol2(String str) {
	    // short circuit - supposed to imply that
	    // there are no more than 256 different characters.
	    // this is broken, because in Java, char's are Unicode,
	    // and 2-byte values so there are 32768 values
	    // (or so - technically not all 32768 are valid chars)
		
		if(str.length() > 256) {
			return false;
		}
		
	    // checker is used as a bitmap to indicate which characters
	    // have been seen already
		int checker = 0;
		for(int i = 0; i < str.length(); i++) {
	        // set val to be the difference between the char at i and 'a'
	        // unicode 'a' is 97
	        // if you have an upper-case letter e.g. 'A' you will get a
	        // negative 'val' which is illegal
			int val = str.charAt(i) - 'a';
	        // if this lowercase letter has been seen before, then
	        // the corresponding bit in checker will have been set and
	        // we can exit immediately.
			if((checker & (1 << val)) > 0) {
				return false;
			}
			// set the bit to indicate we have now seen the letter.	
			checker |= (1 << val); // |= bitwise inclusive OR and assignment operator
			//study https://www.tutorialspoint.com/java/java_basic_operators.htm
		}
		// none of the characters has been seen more than once.
		return true;
	}
	
	/**
	 * If we can't use additional data structures, we can do the following:
	 * 1. Compare every character of the string to every other character of the string.
	 * This will take O(n squared) time and 0(1) space.
	 * This is implemented by my solution above.
	 * @param str
	 * @return
	 */
	public boolean isUnique_Sol3(String str) {
		return isUnique(str);
	}
	
	/**
	 * 2. If we are allowed to modify the input string, we could sort the string in
	 * 0(n log(n)) time and then linearly check the string for neighboring characters 
	 * that are identical. Careful though: many sorting algorithms take up extra space.
	 * @param str
	 * @return
	 */
	public boolean isUnique_Sol4(String str) {
		return false;
	}
	
	/**
	 * Explanation: http://stackoverflow.com/questions/28775354/determine-if-string-has-unique-characters
	 * 
	 * If your input had a large number of elements or you could not know what they 
	 * were ahead of time, you could use a hash table to keep track of which elements 
	 * have already been seen. This again takes O(N) time with O(cK) extra space, 
	 * where K is the number of keys and c is some value greater than 1.
	 * 
	 * But hash tables can take up quite a bit of space. There's another way to do this. 
	 * Sort your array, which will take O(N log N) time but which requires no extra space. 
	 * Then walk through the array checking to see if any two neighbouring characters 
	 * are the same. If so, you have a duplicate.
	 * 
	 * Link to solution: http://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
	 * 
	 * @param str
	 * @return
	 */
	public boolean isUnique_Sol5(String str) {
		
		Hashtable<Character, Integer> charMap = new Hashtable<Character, Integer>();
		for (char ch : str.toCharArray()) {
			
		}
		
		
		return false;
	}
}
