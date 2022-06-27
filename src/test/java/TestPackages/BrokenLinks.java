package TestPackages;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
		driver.get("https://vditoolbox.com/manage/wyse-management-suite/");
		driver.manage().window().maximize();

		Thread.sleep(3000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :" + links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}

	}

	private static void verifyLinkActive(String Linkurl) {
		try {
			URL url = new URL(Linkurl);

			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(3000);

			httpURLConnect.connect();

			if (httpURLConnect.getResponseCode() == 200) {
				System.out.println(Linkurl + " - " + httpURLConnect.getResponseMessage());
			}
			if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(Linkurl + " - " + httpURLConnect.getResponseMessage() + " - "
						+ HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {

		}
	}

}
