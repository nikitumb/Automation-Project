import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> window = driver.getWindowHandles(); // ParentID,ChildID
		java.util.Iterator<String> it = window.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		driver.switchTo().window(ChildID);
		
		System.out.println(driver.findElement(By.cssSelector("ul[class='clearfix']")).getText());
		String emailID = driver.findElement(By.cssSelector("ul[class='clearfix']")).getText().split("@")[1];
		driver.switchTo().window(ParentID);
		driver.findElement(By.id("username")).sendKeys(emailID);
		
		
		
		

	}

}
