package com.javapie.chapter5;

import org.junit.Test;

public class ExtendingTheSizeOfAnArray {

	@Test
	public void testArrayCopy() {
		int[] integers = {0, 1, 2, 3 ,4};
		int[] newIntegersArray = new int[integers.length + 1];
		
		System.arraycopy(integers, 0, newIntegersArray, 0, integers.length);
	}

}
