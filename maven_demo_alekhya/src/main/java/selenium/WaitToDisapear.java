package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitToDisapear {
	@Test
	public void disapear() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://leafground.com/pages/disapper.html");
	
	boolean button =driver.findElement(By.xpath("//*[@id=\"btn\"]/b")).isDisplayed();
	String a=driver.findElement(By.xpath("//*[@id=\"btn\"]/b")).getText();
	System.out.println(a);
			if(button) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"btn\"]/b")));
	}
			String text=driver.findElement(By.xpath("//*[@id=\"show\"]/p/strong")).getText();
			System.out.println(text);
	}
}
