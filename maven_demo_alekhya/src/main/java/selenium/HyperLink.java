package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {
@Test
public void working() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://leafground.com/pages/Link.html");
	
	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/a")).click();
	Thread.sleep(1000);
	String title = driver.getTitle();
	if (title.equals("TestLeaf - Selenium Playground")) {
		System.out.println(title);
	} else {
	
		System.out.println("not navigated");
	}
	Thread.sleep(1000);
	driver.navigate().back();
	
	
	driver.findElement(By.xpath("//a[@style=\"color:green\"]")).getText();
	
	int links= driver.findElements(By.xpath("//a")).size();
	System.out.println(links);
	
	
}
}
