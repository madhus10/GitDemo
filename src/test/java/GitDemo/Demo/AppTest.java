package GitDemo.Demo;

import org.testng.annotations.Test;

public class AppTest

{
	@Test
	public void t1() {
		System.out.println("t1 printed");
	}
	@Test
	public void t2() {
		System.out.println("t2 printed");
	}
	@Test(priority=2)
	public void DriverInit1() {
		System.out.println("Done");
		
		
	}
	@Test(priority=3)
	public void DriverInit123() {
		System.out.println("Done 123");
		
		
	}
@Test(priority=4)
	public void DriverInit1234() {
		System.out.println("Done 1234");
		
		
	}
}
