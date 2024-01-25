package Frameworks;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {

	@Test
	void ha() {
		Assert.assertEquals("thursday", "thursday");
		System.out.println("January");
		
		Assert.assertEquals("Samsung", "sony");
		System.out.println("feb");
		
		System.out.println("C");
		System.out.println("A");
		System.out.println("B");

	}
	
	SoftAssert sw = new SoftAssert();
	
	@Test
	void sa() {
		sw.assertEquals("monday", "monday");
		System.out.println("monday");
		sw.assertEquals("tuesday", "tue");
		System.out.println("Tuesday");
		
		System.out.println("Wednesday");
		System.out.println("Thursday");
		System.out.println("Friday");
		System.out.println("Saturday");

	}
	
}
