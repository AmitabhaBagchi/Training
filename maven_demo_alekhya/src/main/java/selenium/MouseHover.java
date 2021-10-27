package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	@Test
	public void mouse() throws InterruptedException, Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions obj = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	driver.get("http://leafground.com/pages/mouseOver.html");
	
	WebElement button=driver.findElement(By.xpath("//a[@class=\"btnMouse\"]"));
	obj.moveToElement(button).build().perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@class=\"listener\"])[1]")).click();
	Thread.sleep(500);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("(//a[@class=\"listener\"])[2]")).click();
	Thread.sleep(500);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("(//a[@class=\"listener\"])[3]")).click();
	Thread.sleep(500);
	driver.switchTo().alert().accept();
	Thread.sleep(500);
	driver.close();
	}
}
