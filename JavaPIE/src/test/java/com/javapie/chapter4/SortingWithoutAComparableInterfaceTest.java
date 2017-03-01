package com.javapie.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SortingWithoutAComparableInterfaceTest {

	private static class NotComparable {
		private int i;
		
		public NotComparable(final int i) {
			this.i = i;
		}
	}
	
	@Test
	public void sortNotComparable() {
		
		final List<NotComparable> objects = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			objects.add(new NotComparable(i));
		}
		
		try {
			Arrays.sort(objects.toArray());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//fail();
	}
	
}
