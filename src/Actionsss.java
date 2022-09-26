import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsss {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); 
		
		Actions a = new Actions(driver);
			
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("HELLO").doubleClick().build().perform();
		
		a.moveToElement(move).contextClick().build().perform();

	}

}
