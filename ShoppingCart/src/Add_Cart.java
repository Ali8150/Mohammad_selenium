import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] Names={"Brocolli","Cucumber"};
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
				// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver(); 
				WebDriverWait W = new WebDriverWait(driver,5);	 //
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				driver.manage().window().maximize();
				Thread.sleep(3000);
				
				Add(driver,Names);
				 
				driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
				 W.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoCode"))); //Exlipit wait
				driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
				   driver.findElement(By.className("promoBtn")).click();
				   W.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));
				 System.out.println(driver.findElement(By.className("promoInfo")).getText());
				 
				 
			 W.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoInfo")));
			  
			   driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}
	
		public static void Add(WebDriver driver,String[] Names) { 
			int j=0 ;
		
		
		
	List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));

	//convert array to arraylist
	
	
for(int i=0;i<products.size();i++ ) {
	
	
	String[] name = products.get(i).getText().split("-");
	String formatingName = name[0].trim();
//	String[] trimName = name.split("-");
	List iteams = Arrays.asList(Names);
if(iteams.contains(formatingName))	{
	j++;
	 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	if(j==Names.length) {
		break;
	}
	
}

}

}
}

	
	
	
	
	
	
	
	
	
	
