package com.javapie.chapter5;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class QueueTest {

	/**
	 * A Queue is a Java interface that represents 
	 * a “first in, first out” data structure. 
	 * The interface has the methods add, to add a new element, 
	 * remove to remove the oldest element, and peek, which 
	 * returns the oldest element, but does not remove it from the data structure.
	 */
	@Test
	public void testQueueInsertion() {
		
		final Queue<String> queue = new LinkedList<>();
		queue.add("first");
		queue.add("second");
		queue.add("third");
		
		assertEquals("first", queue.remove());
		assertEquals("second", queue.remove());
		assertEquals("third", queue.peek());
		assertEquals("third",queue.remove());
		
	}

}
