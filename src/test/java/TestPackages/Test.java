package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("software99testing@gmail.com");
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("7019679975");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        
       
        String act_title=driver.getTitle();
        System.out.println(act_title);
	}

}
