import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Nikit Umbarkar";

		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://3.110.88.201/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("input[id='alertbtn']")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
