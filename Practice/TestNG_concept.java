package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_concept {
	
	@BeforeSuite
	public void BS(){
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void BT() {
		System.out.println("Befor Test");
	}
	@BeforeClass
	public void BC() {
		System.out.println("Before class");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
	}
	@Test
	public void test() {
		System.out.println("Test 1");
	}
	@AfterSuite
	public void AF() {
		System.out.println("After Suite");
	}
	@AfterClass
	public void AC() {
		System.out.println(" After class");
	}
	@AfterTest
	public void AT(){
		System.out.println("After Test");
	}
	@AfterMethod
	public void AM() {
		System.out.println("AM");
	}

}
