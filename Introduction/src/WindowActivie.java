import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		
    driver.manage().window().maximize(); //maximize window
    driver.get("http://google.com"); 
    driver.navigate().to("https://rahulshettyacademy.com"); 
    driver.navigate().back();
    driver.navigate().forward();
	}

}
