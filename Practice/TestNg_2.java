package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_2 {

	@Test
	public void test1() {
		System.out.println("test1");
		Assert.assertTrue(false);
	}
	@Test(dependsOnMethods = "test1")
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
}
