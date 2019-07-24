package junit.first;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testPalindromeCheck() {
		Demo2 d=new Demo2();
	    System.out.println("Inside testPalindrome method...");	    
        if(d.palindromeCheck("madam")==true) {
	    assertTrue(true);
        }
        else {
        	assertFalse(true);
        }
	}

}
