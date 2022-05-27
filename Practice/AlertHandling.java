package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("aksh");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//Thread.sleep(500);
		
//		Alert alert=driver.switchTo().alert();
//		System.out.println(alert.getText());
//		driver.switchTo().alert().accept();
//		//Thread.sleep(1000);
//		
//		Alert alert1=driver.switchTo().alert();
//		System.out.println(alert1.getText());
//		driver.switchTo().alert().accept();
//		Thread.sleep(1000);
		
		String st=driver.switchTo().alert().getText();
		System.out.println(st);
		driver.switchTo().alert().accept();
		//Thread.sleep(1000);
		
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		driver.switchTo().alert().accept();
		
		driver.close();
		

	}

}
