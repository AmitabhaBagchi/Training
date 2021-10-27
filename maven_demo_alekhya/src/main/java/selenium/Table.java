package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
@Test
public void ab() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/table.html");
	Thread.sleep(1000);
	
		 List<WebElement> x= driver.findElements(By.xpath("//tbody/tr"));
	 System.out.println(x.size());
	 
	 for(int i=0;i<x.size();i++) {
	 System.out.println(x.get(i).getText());
	 }
	 Thread.sleep(1000);
	 

	 List<WebElement> y= driver.findElements(By.xpath("//tbody/tr[1]/th"));
	 System.out.println(y.size());
	 for(int j=0;j<y.size();j++) {
	 System.out.println(y.get(j).getText());
	 }
	 Thread.sleep(1000);
	 
	String a= driver.findElement(By.xpath("//td[text()=\"Learn to interact with Elements\"]/../td[2]")).getText();
	 System.out.println(a);

List<WebElement> z= driver.findElements(By.xpath("//tbody/tr/td[2]"));
System.out.println(z.size());
String firt_str=z.get(0).getText();
int min=  Integer.parseInt(firt_str.replace("%", ""));
for(int k=1; k<z.size();k++) {
	String str=z.get(k).getText();
	String max_str=str.replace("%", "");	
	if(min>Integer.parseInt(max_str))
	{
	min=Integer.parseInt(max_str);
	}	
}
System.out.println(min);
driver.close();
}
}
