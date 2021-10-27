package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {
	@Test
	public void text() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//  	WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type][1]")).sendKeys("alekhya5bavisetti@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Append \"]")).sendKeys("hellow");
		Thread.sleep(1000);
		boolean x = driver.findElement(By.xpath("//input[@value=\"TestLeaf\"]")).getText().isEmpty();
		System.out.println(x);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Clear me!!\"]")).clear();
		
		Thread.sleep(1000);
		boolean y = driver.findElement(By.xpath("//input[@disabled=\"true\"]")).isEnabled();
		System.out.println(y);
		Thread.sleep(1000);
		driver.close();
	}

}
