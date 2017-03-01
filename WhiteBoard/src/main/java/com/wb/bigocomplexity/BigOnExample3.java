package com.wb.bigocomplexity;

import java.util.Arrays;
import java.util.List;

public class BigOnExample3 {

	/**
	 * When we are asking Big O Complexity questions, we have to go with the worst case
	 * for this algorithm, which would be that there's no duplicates at all. 
	 * 
	 * But we still have to compare everything else to figure that out.
	 * 
	 * O(n) squared complexity - also known as "quadratic time"
	 * 
	 * O(n) squared complexity is not what you want, and if possible avoid it.
	 * 
	 * This is what badly written sorting algorithms like bubble sorts do.
	 * It is workable for smaller amounts of data, but the larger it gets, the worse it gets.
	 * 
	 * So n squared, meaning if you doubled the amount of items, you then square that for
	 * the processing time. So if data is times two, processing goes up times four, 
	 * if you add ten times more data, you expect the processing time takes 100 times longer.
	 * 
	 * So, if ever have nested iterations over the same data, 
	 * you're probably looking at order n squared.
	 * 
	 * "Big O of order n squared"
	 * 
	 * @param unSortedArray
	 * @return
	 */
	public boolean findDuplicates(Integer[] unSortedArray) {
		
		//No direct way of getting the index of a value in int[], so converting to ArrayList.
		List<Integer> unSortedArrayList = Arrays.asList(unSortedArray);
		for (Integer i : unSortedArrayList) {
			for (Integer j : unSortedArrayList) {
				if(unSortedArrayList.indexOf(i) == unSortedArrayList.indexOf(j)) {
					//This check makes sure it is not comparing an element to itself
					continue;					
				}
				
				if(i == j) {
					return true;
				}
			}
		}
		
		return false;
	}
}
