package com.javapie.chapter5;

import static org.junit.Assert.assertEquals;

import java.util.Deque;
import java.util.LinkedList;

import org.junit.Test;

public class DoubleEndedQueueTest {

	/**
	 * Deque = Double Ended Queue
	 * 
	 * A Deque (pronounced “deck”) is an extension of Queue, 
	 * and allows addition and removal from either end of the data structure.
	 */
	@Test
	public void testDeque() {
		Deque<String> deque = new LinkedList<>();
		
		deque.add("first");
		deque.add("second");
		deque.add("third");
		
		assertEquals("first", deque.removeFirst());
		assertEquals("second", deque.removeFirst());
		assertEquals("third", deque.peekFirst());
		assertEquals("third", deque.removeLast());

	}
	

}
