package com.wb.bigocomplexity;

public class BigOExample2 {

	/**
	 *  This is not constant time, it is not order 1 complexity, because the time changes 
	 *  based on the data that I pass into it. 
	 *  
	 *  Because with this kind of algorithm, as the amount of data being passed in doubles, 
	 *  the amount of time it takes doubles. And this is completely fair enough. 
	 *  If it's twice the items, and we have to go through them all, it's twice the amount of work. 
	 *  So this would be considered a big O of n, or order n complexity, it is linear time.
	 *  
	 *  Now order n complexity is very common, and it's actually an idea that seems totally 
	 *  natural to people. If you were to ask a random person on the street, oh okay,
	 *  I have a payroll system, and it takes five hours to process 5,000 people.
	 *  
	 *  O(n) complexity - linear time
	 *  "Big O of n, or order n complexity"
	 * @param unSortedArray
	 * @return
	 */
	public int countAllEvenNumbers(int[] unSortedArray) {
		int evenNumberCount = 0;
		
		for(int i = 0 ; i < unSortedArray.length; i++) {
			if( unSortedArray[i] % 2 == 0 ) {
				evenNumberCount++;
			}
				
		}
		
		return evenNumberCount;
	}
}
