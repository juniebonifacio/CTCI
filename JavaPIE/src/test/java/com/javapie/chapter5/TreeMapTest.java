package com.javapie.chapter5;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

public class TreeMapTest {

	@Test
	public void test() {
		final Map<Integer, String> counts = new TreeMap<>();
		counts.put(4, "four");
		counts.put(1, "one");
		counts.put(3, "three");
		counts.put(2, "two");
		
		Iterator<Integer> keys = counts.keySet().iterator();
		Assert.assertEquals(Integer.valueOf(1), keys.next());
		Assert.assertEquals(Integer.valueOf(2), keys.next());
		Assert.assertEquals(Integer.valueOf(3), keys.next());
		Assert.assertEquals(Integer.valueOf(4), keys.next());
		Assert.assertFalse(keys.hasNext());
	}

}
