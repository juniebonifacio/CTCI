package com.wb.bigocomplexity;

public class BigOofNComplexity {

	/**
	 * Stack space in recursive calls also take O(n) complexity.
	 * Each call adds a level to the stack.
	 * @param number
	 * @return
	 */
	public int sum(int number) {
		if(number <= 0) {
			return 0;
		}
		
		return number + sum(number-1);
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int pairSumSequence(int n) {
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum +=	pairSum(i, i+1);
		}
		
		return sum;
	}
	
	
	private int pairSum(int a, int b){
		return a + b;
	}
	
	
	public void getMinMax(int[] array){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x: array) {
			if(x < min) min = x;
			if(x > max) max = x;
		}
	}
	
	public void getMinMax2(int[] array){
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int x : array) {
			if(x < min) min = x;
		}
		for(int x : array) {
			if(x > max) max = x;
		}		
	}
	
}
