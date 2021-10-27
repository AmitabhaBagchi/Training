package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Images {
@Test
public void img() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://leafground.com/pages/Image.html");
	
	driver.findElement(By.xpath("//img[@src=\"../images/home.png\"]")).isDisplayed();
	driver.findElement(By.xpath("//img[@src=\"../images/home.png\"]")).getLocation();
	driver.findElement(By.xpath("//img[@src=\"../images/home.png\"]")).isEnabled();
	driver.findElement(By.xpath("//img[@src=\"../images/home.png\"]")).click();
	Thread.sleep(1000);
	String title = driver.getTitle();
	if (title.equals("TestLeaf - Selenium Playground")) {
		System.out.println(title);
	} else {
		System.out.println("not navigated");
	}
	Thread.sleep(1000);
	driver.navigate().back();
	
	
//	List<WebElement> images=driver.findElements(By.xpath("//img"));
//	System.out.println(images.size());
//for(WebElement image:images) {
//	brokenImage(image);
//	
//}
	
driver.findElement(By.xpath("//img[@src=\"../images/keyboard.png\"]")).sendKeys(Keys.ENTER);
Thread.sleep(1000);
String s = driver.getTitle();
if (s.equals("TestLeaf - Selenium Playground")) {
	System.out.println(s);
} else {
	System.out.println("not navigated");
}
Thread.sleep(1000);
driver.navigate().back();	
	
}

//private void brokenImage(WebElement image) {
	// TODO Auto-generated method stub
	
}

