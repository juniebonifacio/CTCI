package com.javapie.chapter4;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSortAlgorithmTest {

	@Test
	public void testInsertionSort() {
		//									 0  1   2   3  4   5
		Integer[] array = new Integer[] {23, 42, 4, 16, 8, 15};
		insertionSort(array);
	}
	
	public Integer[] insertionSort(Integer[] array) {
		
		for(int i = 1; i < array.length; i++) { 
			//iterate the unsorted list except 1st element (int i = 1), 
			// since 1st element in unsorted will simply become 1st element in sorted.
			
			//keep track of our current place in the unsorted portion
			Integer element = array[i]; //element is what we are currently moving into the sorted portion
			int j = i; //j is the index in the unsorted portion
			
			//iterate the sorted portion from right to left
			//stop iterating when left element of current position < element
			while(j > 0 && array[j - 1] > element) {
				array[j] = array[j - 1]; //shift each element one space to the right.
				j = j - 1; //update counter to continue to move left of the sorted.
			}
			
			array[j] = element; //insert element into the sorted portion of the list
			
		}
		
		System.out.println("array: " + Arrays.asList(array));
		return array;
	}
}
