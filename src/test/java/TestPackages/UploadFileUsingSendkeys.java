package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		WebElement	chooseToFile=driver.findElement(By.id("fileupload1"));
		act.moveToElement(chooseToFile).perform();
		chooseToFile.sendKeys("D:\\TestFile.text");
	}

}