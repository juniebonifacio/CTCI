package com.ctci.chapter1;

import org.junit.Test;

public class Problem_1_3 {

	@Test
	public void testURLify(){
		String input = "Mr John Smith     ";
		urlify(input);
	}
	
    public String urlify(String input) {
        
        if(null == input || input.isEmpty())
            return null;
        
        char space = ' ';
        char[] charArray = input.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if(currentChar == space) {
                //charArray[i] = '%20';
            }
        }
    
        return null;
    }
    
}
