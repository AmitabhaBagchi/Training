package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	@Test
	public void wnd() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://leafground.com/pages/Window.html");

		driver.findElement(By.id("home")).click();
		System.out.println("new window opened");
		Set<String> parent = driver.getWindowHandles();
		Iterator<String> iterator = parent.iterator();
		String ParentWindow = iterator.next();
		String ChildWindow = iterator.next();
		driver.switchTo().window(ChildWindow);
		System.out.println("navigated to chiled window");
		Thread.sleep(5000);
		driver.close();
 
		
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("//button[@onclick=\"openWindows()\"]")).click();
		Set<String> p2 = driver.getWindowHandles();
		Iterator<String> it = p2.iterator();
	//	String P2 = it.next();
		String c1 = it.next();
		String c2 = it.next();
		driver.switchTo().window(c1);
		System.out.println("navigated to first chiled window");
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(c2);
		System.out.println("navigated to second window");
		Thread.sleep(1000);
		driver.close();


		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("//button[@onclick=\"openWindows();\"]")).click();
		Set<String> par = driver.getWindowHandles();
		Iterator<String> itor = par.iterator();
	//	String Par = itor.next();
		String cld1 = itor.next();
		String cld2 = itor.next();
		driver.switchTo().window(cld1);
		System.out.println("navigated to first window");
		driver.manage().window().maximize();
		driver.switchTo().window(cld2);
		System.out.println("navigated to second window");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().window(ParentWindow);

		
		driver.findElement(By.xpath("//button[@onclick=\"openWindowsWithWait();\"]")).click();
		Thread.sleep(5000);
		Set<String> prnt = driver.getWindowHandles();
		Iterator<String> itr = prnt.iterator();
	//	String p3 = itr.next();
		String ch1 = itr.next();
		String ch2 = itr.next();
		driver.switchTo().window(ch1);
		System.out.println("navigated to chiled window1");
		Thread.sleep(500);
		driver.close();
		driver.switchTo().window(ch2);
		System.out.println("navigated to child window2");
		Thread.sleep(500);
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		driver.quit();

	}
}