import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(5));
		
		//System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		//WebDriver driver1 = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
				
		WebElement move = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@id='nav-link-accountList']")));
		
		// Moves to specific elements
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("twotabsearchtextbox")));
		
		a.moveToElement(move).contextClick().build().perform();
		

	}

}
