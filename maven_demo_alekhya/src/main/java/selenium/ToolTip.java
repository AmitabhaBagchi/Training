package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
	@Test
	public void tool() throws InterruptedException, Throwable{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/tooltip.html");
		
		String tip=driver.findElement(By.xpath("//input[@id=\"age\"]")).getAttribute("title");
		System.out.println(tip);
		Assert.assertEquals(tip, "Enter your Name");
		driver.close();
}
}