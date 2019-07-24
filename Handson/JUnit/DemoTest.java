package junit.first;


import org.junit.Test;

import junit.framework.Assert;

public class DemoTest {

	@Test
	public void testStringConcat() {
	 Demo d=new Demo();
	 String str1="a";
	 String str2="b";
	 System.out.println("Inside testStringConcat method...");
     Assert.assertEquals(str1+str2,d.stringConcat(str1, str2));
     }

}
