import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutheticationPopUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
				
		String title = driver.getTitle();
		System.out.println(title);
	}

}
