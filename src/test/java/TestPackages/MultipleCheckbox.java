package TestPackages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		
		List<WebElement>checks=driver.findElements(By.xpath("//div[@id=\"checkbox-example-div\"]/fieldset"));
		for (WebElement allchecks : checks) {
			System.out.println("All check list are :"+allchecks.getText());
		}

		List<WebElement> checklist = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Number of check box are :" + checklist.size());
		
		
		String checkBoxToBeSelected="BMW";
		
		for (int i = 0; i < checklist.size(); i++) {
			if(checklist.get(i).getAttribute("value").equalsIgnoreCase(checkBoxToBeSelected));
			checklist.get(i).click();
			break;
			
		}

	}

}
