import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		//for this line of code java wait 5 sec to imepilement
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.name("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		  String hold = driver.findElement(By.cssSelector("p.error")).getText();
		  
		  if (hold.length() > 0) {
			  
			  driver.findElement(By.className("forgot-pwd-container")).click();
			 
			 Thread.sleep(1000);
			  driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("John");
			  driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rsa.com");
			  driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("01715580403");
			  driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
			  
			  String reset = driver.findElement(By.className("infoMsg")).getText();
			  String[] reset1 = reset.split(" ");
			  String[] reset2 = reset.split("'");
			
			  driver.findElement(By.className("go-to-login-btn")).click();
			  Thread.sleep(1000);
			  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
				driver.findElement(By.name("inputPassword")).sendKeys(reset2[1]);
				
				driver.findElement(By.className("signInBtn")).click();
			  
		  }
	}

}
