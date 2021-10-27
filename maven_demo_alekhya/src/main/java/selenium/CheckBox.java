package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckBox{
@Test
public void Box () throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://leafground.com/pages/checkbox.html");
	
	List<WebElement> check= driver.findElements(By.xpath("//input"));
	List<WebElement> db= driver.findElements(By.xpath("//input/.."));
		for(int i=0;i<5;i++) {
		String lang=db.get(i).getText();
		
		if(!lang.equals("VB")) {
			System.out.println(lang);
			check.get(i).click();
		}}
	
boolean x=driver.findElement(By.xpath("//div[text()=\"Selenium\"]/input")).isSelected();
System.out.println(x);

List<WebElement> y= driver.findElements(By.xpath("//label[text()=\"DeSelect only checked\"]/../div/input"));
for(int j=0; j<y.size(); j++) {
	boolean z= y.get(j).isSelected();
	if(z) {
		y.get(j).click();
}
}
	List<WebElement> box= driver.findElements(By.xpath("//input"));
	Thread.sleep(1000);
		for(int k=8; k<13 ;k++) {
			box.get(k).click();		
			}
}

}	


