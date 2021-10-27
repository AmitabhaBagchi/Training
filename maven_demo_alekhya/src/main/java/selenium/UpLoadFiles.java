package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpLoadFiles {
	@Test
	public void upload() throws InterruptedException, Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/upload.html");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("E:\\alekhya\\training\\Test_Plan");
	Thread.sleep(1000);
	}
	}