package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drive/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://qa.modeler2.decisionsfirst.com/login");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("test_claim2@gmail.com");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("defaultUserPass@123");
			driver.findElement(By.xpath("//button[@class='btn form-control btn-info mr-2 login-btn']")).click();
			
			driver.findElement(By.xpath("//nb-list-item[1]//dfm-preview-container[1]//div[1]//dfm-search-list-item[1]//div[1]//div[1]//span[1]//span[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//i[@class='eva eva-settings-2-outline']")).click();
			Thread.sleep(4000);

	}

}
