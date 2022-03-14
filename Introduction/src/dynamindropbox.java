import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dynamindropbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		

		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		 
		Thread.sleep(2000);  
	     WebElement statciDropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
			
			Select dropdown = new Select(statciDropdown );
			dropdown.selectByVisibleText("Bengaluru (BLR)"); 
			Thread.sleep(2000);  
			driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='GOI']")).click();
	     
	     }
	     
	}


