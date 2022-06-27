package TestPackages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwithToTab {
	
		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://courses.letskodeit.com/practice");
			driver.findElement(By.xpath("//a[@id='opentab']")).click();
			
			/*By using getWindowHandles method get the all browser id , then iterator it.
			 *by using iterator get the parentWindowId and childWindowId the print it both 
			 *by using  switchTo().window method switch to child window tab and perform necessary actions and close that window tab
			 *then switch to parent window tab then continue remaining activities then finally quit the browser session 
			 */
			
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


