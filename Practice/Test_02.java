package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_02 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		
	//	List<WebElement> email=driver.findElements(By.xpath("(//input[@type='text'])[2]"));
		
		WebElement emailid=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginbt=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		
		emailid.sendKeys("akshaykolhe");
		pass.sendKeys("12334");
		loginbt.click();
		
	}

}
