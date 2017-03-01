package com.javapie.chapter5;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

	@Test
	public void testBinaryTree() {
		final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
		root.insert(3);
		root.insert(9);
		root.insert(10);
		
		Assert.assertTrue(root.search(10));
		Assert.assertEquals(Integer.valueOf(10), root.getRight().getValue());
	}
	
	public class SimpleTree<E extends Comparable> {
		private E value;
		private SimpleTree<E> left;
		private SimpleTree<E> right;
		
		public SimpleTree(E value, SimpleTree<E> left, SimpleTree<E> right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
		public E getValue() {
			return value;
		}
		public void setValue(E value) {
			this.value = value;
		}
		public SimpleTree<E> getLeft() {
			return left;
		}
		public void setLeft(SimpleTree<E> left) {
			this.left = left;
		}
		public SimpleTree<E> getRight() {
			return right;
		}
		public void setRight(SimpleTree<E> right) {
			this.right = right;
		}
		
		/**
		 * If the value to find is equal, you have a match.
		 * 
		 * If the value to find is less than the current node,
		 * and the left node is not null, repeat the search on the left node.
		 * 
		 * Otherwise, if the right node is not null,
		 * repeat the search on the right node.
		 * 
		 * If a child node to search is null, you have reached the bottom of
		 * the tree, and the value to find is not in the tree.
		 * 
		 * @param toFind
		 * @return
		 */
		public boolean search(final E toFind) {
			if(toFind.equals(value)) {
				return true;
			}
			
			if(toFind.compareTo(value) < 0 && left != null) {
				return left.search(toFind);
			}
			
			return right != null && right.search(toFind);
		}
		
		/**
		 * Inserting values into a tree follows a similar structure.
		 * You follow the tree, comparing each node with the value to insert,
		 * going left if the value to insert is less than the value at the current node,
		 * or right otherwise.
		 * 
		 * If the node to inspect is null, this is where your new value is to be inserted.
		 * 
		 * @param toInsert
		 */
		public void insert(final E toInsert) {
			if(toInsert.compareTo(value) < 0) {
				if(left == null) {
					left = new SimpleTree<>(toInsert, null, null);
				} else {
					left.insert(toInsert);
				}
			} else {
				if(right == null) {
					right = new SimpleTree<>(toInsert, null, null);
				} else {
					right.insert(toInsert);
				}
			}
		}
	}
}
