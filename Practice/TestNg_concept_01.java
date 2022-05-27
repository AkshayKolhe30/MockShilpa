package Practice;

import org.testng.annotations.Test;

public class TestNg_concept_01 {
	
	@Test(priority=2)
	public void m1(){
		System.out.println("M1");
	}
	@Test(priority=1)
	public void m2(){
		System.out.println("m2");
	}
	@Test(priority=0)
	public void m3() {
		System.out.println("m3");
	}
	
}
