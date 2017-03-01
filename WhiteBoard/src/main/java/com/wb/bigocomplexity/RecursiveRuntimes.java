package com.wb.bigocomplexity;

public class RecursiveRuntimes {

	/**
	 * 
	 * @param n
	 * @return
	 */
	public int f(int n) {
		int f = 1;
		
		if(n <= 1) {
			return f;
		}
		
		int e = f(n - 1);
		f = e + e;
		System.out.println("e: " + e + "; f: " + f + "; n: " + n);
		return f;
	}
	
	public static void main(String[] args) {
		RecursiveRuntimes r = new RecursiveRuntimes();
		int f = r.f(4);
		System.out.println("f: " + f);
	}
}
