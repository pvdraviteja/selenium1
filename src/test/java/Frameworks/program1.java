package Frameworks;

import org.testng.annotations.Test;

public class program1 {

	@Test(priority=-1)
	public void a() {
		System.out.println("a");
		
	}
	
	@Test

	public void b() {
		System.out.println("b");
		
	}
	
	@Test(priority=-3)

	public void c() {
		System.out.println("c");
		
	}
	
	@Test(priority=2)

	public void d() {
		System.out.println("d");
		
	}
	
	@Test(priority=3)

	public void e() {
		System.out.println("e");
		
	}
	
	@Test

	public void f() {
		System.out.println("f");
		
	}
	
	@Test(priority=3)

	public void g() {
		System.out.println("g");
		
	}

}

