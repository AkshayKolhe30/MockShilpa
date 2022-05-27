package MyPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DopdownHandle {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
		driver.manage().window().maximize();
		
		
		
		
		
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
//		driver.findElement(By.xpath("//input[@class='ac_input']")).sendKeys("Pramod");
//		driver.findElement(By.xpath("//input[@class='inputFormatHint ac_input']")).sendKeys("Rushi");
		
		WebElement drpjobtitle=driver.findElement(By.xpath("//select[@id='empsearch_job_title']"));
		Select drpjob=new Select(drpjobtitle);
		drpjob.selectByVisibleText("HR Manager");
		
		WebElement empstatus=driver.findElement(By.xpath("//select[@id='empsearch_employee_status']"));
		Select searchempst=new Select(empstatus);
		searchempst.selectByIndex(2);
		
		WebElement empsubunit=driver.findElement(By.xpath("//select[@id='empsearch_sub_unit']"));
		Select searchsubunit=new Select(empsubunit);
		searchsubunit.selectByValue("7");
		
//		Thread.sleep(6000);
//		driver.close();
		

	}

}
