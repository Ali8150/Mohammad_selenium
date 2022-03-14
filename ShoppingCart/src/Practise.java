import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String[] Names = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait W = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//span[contains(text(),'User')]")).click();
		W.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[@id='okayBtn']")));

		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		driver.findElement(By.className("form-control")).click();

		driver.findElement(By.xpath("//option[text()='Consultant']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		mobile(driver, Names);
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();

	}

	public static void mobile(WebDriver driver, String[] Names) {
		int j = 0;

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));

//convert array to arraylist

		for (int i = 0; i < products.size(); i++) {

			String name = products.get(i).getText();

//String[] trimName = name.split("-");
			List iteams = Arrays.asList(Names);
			if (iteams.contains(name)) {
				j++;
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				if (j == Names.length) {
					break;

				}

			}

		}
	}
}
