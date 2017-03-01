package com.wb.datastructures.stack;

import java.util.EmptyStackException;

/**
 * A Stack uses LIFO (Last In First Out) ordering. That is, as in a stack of dinner plates,
 * the most recent item added to the stack is the first item to be removed.
 * @author juniebonifacio
 *
 * @param <T>
 */
public class Stack<T> {

	/**
	 * 
	 */
	private StackNode<T> top;
	
	/**
	 * Removes the top item from the stack.
	 * @return
	 */
	public T pop() {
		if(top == null) {
			throw new EmptyStackException();
		}
		
		T item = top.data;
		top = top.next;
		return item;
	}
	
	/**
	 * Adds an item to the top of the stack.
	 * @param item
	 */
	public void push(T item){
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top = t;
	}
	
	/**
	 * Return the top of the stack.
	 * @return
	 */
	public T peek(){
		if(top == null) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	/**
	 * Returns true if and only if the stack is empty.
	 * @return
	 */
	public boolean isEmpty(){
		return top == null;
	}
	
	/**
	 * Static inner class
	 * @author juniebonifacio
	 *
	 * @param <T>
	 */
	public static class StackNode<T> {
		private T data;
		private StackNode<T> next;
		
		public StackNode(T data) {
			this.data = data;
		}
	}
	
	
}
