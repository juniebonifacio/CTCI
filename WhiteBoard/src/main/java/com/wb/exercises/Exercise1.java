package com.wb.exercises;

public class Exercise1 {

	/**
	 * What is the runtime of the below code?
	 * @param array
	 */
	public void foo(int[] array) {
		int sum = 0;
		int product = 1;
		
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		for(int i = 0; i < array.length; i++) {
			product += array[i];
		}
		System.out.println("sum: " + sum + "; product: " + product);
	}
	
	/**
	 * What is the runtime of the below code?
	 * @param array
	 */
	public void printPairs(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	/**
	 * This is very similar code to the above example, but now the inner for loop starts at i + 1.
	 * What is the runtime of the code below?
	 * @param array
	 */
	public void printUnorderedPairs(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i + 1; j < array.length; j++){
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}
	
	
	/**
	 * This is similar to the code above, but now have two different arrays.
	 * @param arrayA
	 * @param arrayB
	 */
	public void printUnorderedPairs(int[] arrayA, int[] arrayB) {
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayB.length; j++) {
				if(arrayA[i] < arrayB[j]) {
					System.out.println(arrayA[i] + ", " + arrayB[j]); 
				}
			}
		}
	}
	
	
	/**
	 * Example 7. The following code reverses an array. What is the runtime?
	 * @param array
	 */
	public void reverse(int[] array) {
		for(int i = 0; i < array.length / 2 ; i++){
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
		}
	}
	
	/**
	 * What is the time complexity of this function?
	 * @param n
	 * @return
	 */
	public boolean isPrime(int n) {
		for(int x = 2; x*x <= n ; x++){
			if(n % n == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Example 10.
	 * @param n
	 * @return
	 */
	public boolean isPrime2(int n) {
		for (int x = 2; x < Math.sqrt(n); x++) {
			if(n % x == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
