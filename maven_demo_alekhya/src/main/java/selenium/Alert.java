package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	@Test
	public void b() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Alert.html");
		Thread.sleep(500);

		driver.findElement(By.xpath("//*[text()=\"Alert Box\"]")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick=\"confirmAlert()\"]")).click();
		Thread.sleep(500);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@onclick=\"confirmPrompt()\"]")).click();
		Thread.sleep(1000);
		// driver.switchTo().alert().sendKeys("xyz");
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@onclick=\"lineBreaks()\"]")).click();
		Thread.sleep(500);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("btn")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class=\"swal-button swal-button--confirm\"]")).click();
		Thread.sleep(500);
		driver.close();

	}

}
