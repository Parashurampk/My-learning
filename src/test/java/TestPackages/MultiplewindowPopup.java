package TestPackages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplewindowPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();

		Set<String> handlers = driver.getWindowHandles();
		
		Iterator<String>it=handlers.iterator();
		
		String parentWindowId=it.next();
		System.out.println("parent window id:"+parentWindowId);
		
		String childWindowId=it.next();
		System.out.println("child window id:"+childWindowId);
		
		driver.switchTo().window(childWindowId);
		Thread.sleep(2000);
		
		System.out.println("child window pop up title : "+driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		Thread.sleep(2000);
		
		System.out.println("parent window title : "+driver.getTitle());
		driver.quit();
		

	}

}



















