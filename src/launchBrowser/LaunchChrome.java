package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\siddh\\Selenium\\1st_selenium_project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		// get the website
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		// identify and perform action
		driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		driver.close(); 
		
		
	}
	
}
