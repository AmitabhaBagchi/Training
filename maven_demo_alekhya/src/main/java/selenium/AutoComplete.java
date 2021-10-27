package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoComplete {
@Test
public void text() throws InterruptedException {
	WebDriverManager.chromiumdriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("http://leafground.com/pages/autoComplete.html");
	driver.findElement(By.xpath("//input[@id=\"tags\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"tags\"]")).sendKeys("Selenium");	
	driver.findElement(By.xpath("//input[@id=\"tags\"]")).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(By.xpath("//input[@id=\"tags\"]")).sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.close();
}
}
