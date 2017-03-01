package com.javapie.chapter4;

import java.util.Arrays;

import org.junit.Test;

public class BubbleSortAlgorithmTest {

	/**
	 * for i between 0 and (array length - 1){
	 * 		if ( array[i + 1] < array[i] ) {
	 * 			switch array[i] and array[i + 1]		
	 *  	}
	 * }
	 * 
	 * @param numbers
	 */
	public Integer[] bubbleSort(Integer[] numbers) {
		
		if(null == numbers || numbers.length == 0)
			return null;
		
		System.out.println("input: " + Arrays.asList(numbers));
		
		boolean hasSwitched = false;
		
		do {
			hasSwitched = false;
			for(int i = 0; i < numbers.length - 1; i++) {
				
				if(numbers[i + 1] < numbers[i]) {
					int temp = numbers[i + 1];
					numbers[i + 1]  = numbers[i];
					numbers[i] = temp;
					hasSwitched = true;
				}
			}	
			System.out.println("numbers: " + Arrays.asList(numbers));
			
		} while (hasSwitched);
				
		return numbers;
	}

	
	public Integer[] bubbleSort2(Integer[] numbers) {
		
		if(null == numbers || numbers.length == 0)
			return null;
		
		for(int i = 0; i < numbers.length - 1; i++) {
			
			if(numbers[i + 1] < numbers[i]) {
				int temp = numbers[i + 1];
				numbers[i + 1]  = numbers[i];
				numbers[i] = temp;
			}
			System.out.println("i: " + i + "; numbers: " + Arrays.asList(numbers));
		}
		
		return numbers;
	}
	
	@Test
	public void testBubbleSort(){
		Integer[] numbers = {6, 4, 9, 5};

		Integer[] resultOfBubbleSort = bubbleSort(numbers);
		System.out.println("resultOfBubbleSort: " + Arrays.asList(resultOfBubbleSort));
		
		//Integer[] resultOfBubbleSort = bubbleSort2(numbers);
		//System.out.println("resultOfBubbleSort: " + Arrays.asList(resultOfBubbleSort));
	}
}
