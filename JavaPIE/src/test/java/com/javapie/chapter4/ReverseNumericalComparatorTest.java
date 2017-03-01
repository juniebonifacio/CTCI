package com.javapie.chapter4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class ReverseNumericalComparatorTest {

	class ReverseNumericalOrder implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2 - o1;	
		}
		
	}
	
	@Test
	public void test() {
		final List<Integer> numbers = Arrays.asList(4, 7, 1, 6, 3, 5, 4);
		final List<Integer> expected = Arrays.asList(7, 6, 5, 4, 4, 3, 1);
		
		Collections.sort(numbers, new ReverseNumericalOrder());
		assertEquals(expected, numbers);
	}

}
