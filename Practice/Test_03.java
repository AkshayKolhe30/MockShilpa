package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_03 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
		firstname.sendKeys("Akshay");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		lastname.sendKeys("Kolhe");
		
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		phone.sendKeys("8669372727");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='userName']"));
		email.sendKeys("akshaykolhe");
		
		WebElement addr=driver.findElement(By.xpath("//input[@name='address1']"));
		addr.sendKeys("Gokul Nagar,");
		
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		city.sendKeys("Ambajogai");
		
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		state.sendKeys("Maharastra");
		
		WebElement pcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		pcode.sendKeys("431517");
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(country);
		select.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		username.sendKeys("akshaykolhe");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("akshay@123");
		
		WebElement confirmpass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpass.sendKeys("akshay@123");
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
	}

}
