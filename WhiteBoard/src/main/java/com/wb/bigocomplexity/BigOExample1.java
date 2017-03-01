package com.wb.bigocomplexity;

public class BigOExample1 {

	/**
	 * This takes an array of unknown size, and it needs to find the last element, 
	 * and say is that an even number or an odd number. 
	 * Code first grabs the length of the array. We use the length to index right 
	 * to that last element, divide by 2, and see if the remainder is 0.
	 * 
	 * 
	 * Let's imagine on our imaginary computer, it takes 0.00001 of a second. 
	 * Grabs the length, use it go straight to the last element, check it, 
	 * write out the Boolean, fine. But now, instead of passing an array of ten items, 
	 * I passed this an array with a million items. Well, this is going to take exactly 
	 * the same amount of time. Again, 0.00001 of a second. Because getting the length 
	 * of an array is always very quick. We don't have to go through the entire array to do it. 
	 * Arrays always know their own length. 
	 * And then indexing to any one specific element in an array is always very quick.
	 * 
	 * As long as we know which one we're going to, we just go right to it. 
	 * So there's no variability here. This is predictable. This is constant. 
	 * 
	 * So this algorithm, such as it is, would be referred to as having a big O of 1, 
	 * or order 1 complexity or constant time. 
	 * Whatever amount of data we pass into this, it's always going to take exactly the 
	 * same amount of time.
	 * 
	 * O(1) complexity - constant time
	 * pronounced as "Big O of 1 complexity"
	 * @param unSortedArray
	 * @return
	 */
	public boolean isLastNumberEven(int[] unSortedArray) {
		int length = unSortedArray.length;
		
		if(unSortedArray[length] % 2 == 0) {
			return true;
		}
		
		return false;
	}
}
