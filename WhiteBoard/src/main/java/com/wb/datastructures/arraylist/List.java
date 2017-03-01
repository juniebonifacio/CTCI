/**
 * 
 */
package com.wb.datastructures.arraylist;

/**
 * @author juniebonifacio
 *
 */
public interface List<T> {

	/**
	 * Returns the size of the ArrayList.
	 * @return
	 */
	public int size();
	
	/**
	 * Returns true/false. If size is greater than 0, return true, else false.
	 * @return
	 */
	public boolean isEmpty();
	
	/**
	 * return true.
	 * @param t
	 */

	public boolean add(T t);	
	
	/**
	 * Clears the list.
	 */
	public void clear();
	
	/**
	 * Returns the element at the specified index or position in this list.
	 * @param index
	 * @return
	 */
	public T get(int index);
	
	
	/**
	 * 
	 * @return
	 */
	/**
	 * Remove the element from the ArrayList and shift the elements positions.
	 * @param index
	 * @return
	 */
	public T remove(int index);

	
}
