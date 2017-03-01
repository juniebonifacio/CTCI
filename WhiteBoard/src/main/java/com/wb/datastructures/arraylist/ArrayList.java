package com.wb.datastructures.arraylist;

public class ArrayList<T>{

	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final Object[] EMPTY_ELEMENT_DATA = {};
	
	private int size;
	
	private transient Object[] customArrayElements;

	/**
	 * Constructs an empty ArrayList.
	 */
	public ArrayList() {
		super();
		this.customArrayElements = EMPTY_ELEMENT_DATA;
	}
	
	/**
	 * Constructs an ArrayList with an initial capacity.
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		super();
		if(initialCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
		this.customArrayElements = new Object[initialCapacity];
	}
	
	
	public int size() {
		return size;
	}

	
	public boolean isEmpty() { 
		return size==0;
	}

	
	public boolean add(T t) {
		// TODO Auto-generated method stub
		return true;
	}

	
	public void clear() {
		
		for( int i = 0 ; i < size; i++ ) {
			customArrayElements[i] = null;
		}
		
		size = 0;
		
	}

	
	@SuppressWarnings("unchecked")
	public T get(int index) {
		
		if(index >= size) {
			throw new ArrayIndexOutOfBoundsException("Array Index Out of Bounds Exception with index at: " + index);
		}
		
		return (T) customArrayElements[index];
	}
	
	

	
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
