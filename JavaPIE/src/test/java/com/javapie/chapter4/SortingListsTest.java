package com.javapie.chapter4;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortingListsTest {

	/**
	 * Natural sorting of array of ints
	 */
	@Test
	public void sortInts() {
		final int[] numbers = {-3, -5, 1, 7, 4, -2};
		final int[] expected = {-5, -3, -2, 1, 4, 7};
		
		Arrays.sort(numbers);
		Assert.assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void sortObjects(){
		final String[] strings = {"z", "x", "y", "abc", "zzz", "zazzy"};
		final String[] expected = {"abc", "x", "y", "z", "zazzy", "zzz"};
		
		Arrays.sort(strings);
		Assert.assertArrayEquals(expected, strings);
	}
	
}
