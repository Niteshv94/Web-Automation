/**
 * 
 */
package testcase;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Nitesh
 *
 */
public class Launcher {

	WiniumDriver driver;
	WebDriver webDriver;
	//WebElement element;
	String treziAppPath = "D:\\Trezi\\App Version\\Trezi Setup 2.0.1.exe";
	String workspace_name= "Automation Demo";

	@BeforeClass
	public void launch_app() throws InterruptedException, IOException {

		DesktopOptions options = new DesktopOptions();

		options.setApplicationPath(treziAppPath);

		String winiumDriverPath = System.getProperty("user.dir") + "./driver/Winium.Desktop.Driver.exe";
		File file = new File(winiumDriverPath);
		if (!file.exists()) {
			throw new IllegalArgumentException("The file" + winiumDriverPath + "does not exist");
		}
		Runtime.getRuntime().exec(file.getAbsolutePath());

		try {
			driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		System.out.println("======Trezi Launcher Application Started======");
		Thread.sleep(25000);
		System.out.println("-------");
		//boolean d= driver.findElement(By.name("Email address")).isEnabled();
		//System.out.println("Displayed" + d);
		
		//boolean e= driver.findElement(By.name("Password")).isEnabled();
		//System.out.println("Displayed" + e);
		
		//boolean f= driver.findElement(By.name("Sign in")).isEnabled();
		//System.out.println("Displayed" + f);
		
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

	}
	
	/*private void click(String elementName) throws InterruptedException
	{
		WebElement element=null;
		
		for(int i=1;i<=10;i++)
		{
			try {
				element = driver.findElementByName(elementName);
				break;
			} catch (Exception e) {
				Thread.sleep(1000);
			}
		}
		
		for(int i=1;i<=10;i++)
		{
			Exception exc = null;
			
			try {
				if(element.isEnabled()==true)
				{
					element.click();
					break;
				}
			} catch (Exception e) {
				Thread.sleep(1000);
				exc=e;
			}
		}
	}*/

	@Test 
	public void login_page() throws InterruptedException {
		
		//WebDriverWait wait = new WebDriverWait(webDriver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='full-width']//input[@name='email']")));

		//System.out.println("====== User Landed to Login Page======");
		//Thread.sleep(10000);
		
		//WebElement parentFrame=driver.findElement(By.className("full-width"));
		//parentFrame.findElement(By.xpath("//input[@name='email']")).click();
		
		
		///driver.findElement(By.name("Password")).sendKeys("Niteshvats@94");
		//driver.findElementByXPath("//div[@class='full-width']//input[@name='email']").click();
		
		
		/*WebElement email_address=driver.findElement(By.name("Email address"));
		if(email_address.isSelected() ==true)
		{
			email_address.click();
			
			email_address.sendKeys("nitesh.k@trezi.com");
		}
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.name("Password"));
		if(password.isSelected()==true)
		{
			password.click();
			password.sendKeys("Niteshvats@94");
		}*/
		
		
		
		driver.findElement(By.name("email")).sendKeys("nitesh.k@trezi.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='full-width']//input[@name='email']")).sendKeys("nitesh.k@trezi.com");
		//try {
			//driver.findElement(By.name("Password")).sendKeys("Niteshvats@94");
			//Thread.sleep(2000);
			//driver.findElement(By.name("Microsoft")).click();
		//} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.out.println("Entered in login page");
		//}
		//Thread.sleep(4000);
		
		//click("Email address");
		

	}
	
	/*@Test (priority = 2)
	public void create_projects()
	{
		//Click on Projects
//		driver.findElementByXPath("//*[@id='nav-main']/aside/nav/a[4]").click();
//		
//		//Click on Create New
//		driver.findElementByXPath("//li[contains(text(),'Create new')]").click();
//		
//		//Enter Workspace Name
//		driver.findElementByXPath("//input[@name='workspaceName']").sendKeys(workspace_name);
//		
//		//Browse The File.
//		
//		
//		
//		//Click on Start Processing button
//		driver.findElementByXPath("//span[contains(text(),'Start processing')]").click();
		
	}*/
}
