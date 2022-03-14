import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");

				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				
driver.get("https://jqueryui.com/droppable/");
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement source = driver.findElement(By.id("draggable"));

WebElement target = driver.findElement(By.id("droppable"));

Actions drop = new Actions(driver); 
drop.dragAndDrop(source, target).build().perform();


	}

}
