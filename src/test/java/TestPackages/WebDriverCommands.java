/**
 * 
 */
package TestPackages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Parashuram
 * Browser Specific Commands
 * Browser Navigation Commands and,
 * Element Specific Commands
 */
public class WebDriverCommands {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		/*********Browser Specific Commands:*******/
		
		//1. Maximize window:
		driver.manage().window().maximize();
		
		//2. Delete cookies
		driver.manage().deleteAllCookies();
		
		//3. Get command:
		driver.get("https://en.wikipedia.org/wiki/Cognizant");
		
		//4. GetTitle:
		String title = driver.getTitle();
		
		//5. GetCurrentUrl:
		driver.getCurrentUrl();
		
		//6. GetPageCource:
		boolean result = driver.getPageSource().contains("String to find");
		
		//7. Close:
		driver.close();
		
		//8. Quit
		driver.quit();

		/*********Browser Navigation Commands:*******/
		
		//1. Navigate To:
		driver.navigate().to("www.automationtestinginsider.com"); 
		
		//2. Backward:
		driver.navigate().back(); 
		
		//3. Forward:
		driver.navigate().forward();
		
		//4. Refresh:
		driver.navigate().refresh();

		/*************Element Specific Commands:***********/
		
		//1. Clear:
		//driver.findElement(By.id("userName")).sendKeys("Admin").clear();
		
		//2. Click:
		driver.findElement(By.id("button")).click();
		
		//3. getText:
		String elementText = driver.findElement(By.id("Text")).getText();
		
		//4. IsSelected:
		boolean ele= driver.findElement(By.id("button")).isSelected();
		
		//5. IsEnabled:
		boolean ele1= driver.findElement(By.id("button")).isEnabled();
		
		//6. IsDisplayed:
		boolean ele11= driver.findElement(By.id("button")).isDisplayed();
		
		//7. getAttribute:
		driver.findElement(By.id("findID")).getAttribute("value");
		
		//8. sendkeys:
		driver.findElement(By.id("userName")).sendKeys("Admin");
		
		//9. Submit:
		
		//10. getSize:
		
		//11. getCssValue: - getCssValue method in selenium fetches the value of a CSS property of an web element.
		
		//12. getLocation: In Selenium WebDriver APIs, there is a method getLocation() which returns point, containing location of top left hand corner of the element. Let's say, it returns (x, y).
		
		//13. getTagname: This method gets the tag name of this element. This accepts nothing as a parameter and returns a String value. Command – element.getTagName();



       
         //implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement	Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DropDwon")));
		Element.click();
		
		//FluentWait
		Wait<WebDriver>wait2=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is custom messages")
				.ignoring(NoSuchElementException.class);
 
		
		
		

	}

}
