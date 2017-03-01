package com.wb.logicaloperators;

public class LogicalOperators {

	public boolean hasUniqueCharacters(String str, int n) {
		boolean hasUniqueCharacters = false;
		System.out.println("length: " + str.length());
		if(null == str || str.isEmpty()){
			System.out.println("string is null or empty");
			return false;			
		}
		
		return hasUniqueCharacters;
	}
	
	public static void main(String[] args) {
		LogicalOperators lo = new LogicalOperators();
		String str = "Junie";
		int n = 4;
		boolean hasUniqueCharacters1 = lo.hasUniqueCharacters(str, n);
		System.out.println("hasUniqueCharacters1: " + hasUniqueCharacters1);
		
	}
}
