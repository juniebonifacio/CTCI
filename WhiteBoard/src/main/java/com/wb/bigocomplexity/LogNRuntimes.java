package com.wb.bigocomplexity;

import java.util.Arrays;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class LogNRuntimes {

	
	public int binarySearch(int	x, int[] array) {
		
		int length = array.length;
		int middle = length / 2;
		
		int[] copyOfRange = Arrays.copyOfRange(array, 0, middle);
		
		System.out.println("length: " + length);
		System.out.println("middle: " + middle);
		System.out.println(); 
		
		
		if(x == middle) {
			return middle;
		} else if(x < middle){
			
		}
		
		
		
		return 0;
	}
	
	public static void main(String[] args) {
		int x = 9;
		int[] array = {1, 5, 8, 9, 11, 13, 15, 19, 21};
		
		
		LogNRuntimes l = new LogNRuntimes();
		l.binarySearch(x, array);
	}
}
