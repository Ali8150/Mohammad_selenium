import java.time.Duration;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
						System.setProperty("webdriver.chrome.driver",
								"C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");

						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
						
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		
		driver.findElement(By.className("blinkingText")).click();
		
		//Window handle
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String>it = windows.iterator();
		String parentId = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		
	String userName = driver.findElement(By.xpath("//p[@class='im-para red']")).getText();
     String[] TrimUserName= userName.split(" ");
     
     driver.switchTo().window(parentId);
     driver.findElement(By.xpath("//input[@id='username']")).sendKeys(TrimUserName[4]);
		
		
	}

}
