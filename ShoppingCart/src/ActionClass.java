import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");

				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.com/");
				driver.manage().window().maximize();
				Actions hover = new Actions(driver);
				
				WebElement move =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
				
			hover.moveToElement(move).build().perform();
			
			
			hover.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
				
	}

}
