package Practice;

import org.testng.annotations.Test;

public class TestNg_3 {

	@Test(groups={"Sanity"})
	public void m1() {
		System.out.println("m1");
	}
	@Test(groups={"Regression"})
	public void m2() {
		System.out.println("m2");
	}
	@Test(groups={"Regression"})
	public void m3() {
		System.out.println("Regression");
	}
	@Test(groups={"Sanity"})
	public void m4() {
		System.out.println("m4 sanity");
	}
	
}
