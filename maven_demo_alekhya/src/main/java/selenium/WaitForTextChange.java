package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextChange {


@Test
public void textchainge() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leafground.com/pages/TextChange.html");
	
	
	String before= driver.findElement(By.xpath("//*[@id=\"btn\"]")).getText();
	System.out.println(before);

	WebDriverWait wait = new WebDriverWait(driver, 10);

	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click ME!']")));
	String after= driver.findElement(By.xpath("//button[text()='Click ME!']")).getText();
	System.out.println(after);
	
	driver.findElement(By.xpath("//button[text()='Click ME!']")).click();
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	
}
}
