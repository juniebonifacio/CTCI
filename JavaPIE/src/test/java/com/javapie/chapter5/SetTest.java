package com.javapie.chapter5;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class SetTest {

	@Test
	public void testSetExample() {
		final Set<String> set = new HashSet<String>();
		set.add("Kent");
		set.add("Seattle");
		set.add("Renton");
		set.add("Bellevue");
		set.add("Kent");
		
		Assert.assertEquals(4, set.size());
	}

}
