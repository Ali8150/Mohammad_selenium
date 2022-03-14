import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practise3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
	 
  String op = (driver.findElement(By.xpath("//label[@for='benz']")).getText());
  Thread.sleep(5000);
  WebElement statciDropdown = driver.findElement(By.id("dropdown-class-example"));
  
  Select dropdown = new Select(statciDropdown );
	dropdown.selectByVisibleText(op);
 
	driver.findElement(By.id("name")).sendKeys(op);
	driver.findElement(By.id("alertbtn")).click();
	
	//System.out.println(driver.switchTo().alert().getText());
  
 
	Assert.assertEquals(driver.switchTo().alert().getText(), "Hello Option2, share this practice page and share your knowledge");
   
  
		
		
		
		
		
		
	}
	
	
	

}
