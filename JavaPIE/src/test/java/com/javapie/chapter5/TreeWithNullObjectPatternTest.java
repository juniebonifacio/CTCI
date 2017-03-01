package com.javapie.chapter5;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.javapie.chapter5.TreeTest.SimpleTree;

public class TreeWithNullObjectPatternTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public interface Tree<E extends Comparable> {
		boolean search(E toFind);
		void insert(E toInsert);
	}
	
	public class Node<E extends Comparable> implements Tree<E>{

		private E value;
		private Tree<E> left;
		private Tree<E> right;
		
		@Override
		public boolean search(E toFind) {
			if(toFind.equals(value)) {
				return true;
			}
			if(toFind.compareTo(value) < 0) {
				return left.search(toFind);
			}
				
			return right.search(toFind);
		}

		@Override
		public void insert(E toInsert) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public class Leaf<E extends Comparable> implements Tree<E> {

		@Override
		public boolean search(E toFind) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void insert(E toInsert) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
