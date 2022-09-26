import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Give me the count of link on the page

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. Count of links present in the footer section (Limiting web driver scope)

		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3. Links count of 1st column in the footer section

		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// 4. Click on each link in the column and check if links are valid or not

		for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) // starting with one bcz 1st link in
																					// the column is hearder link which
																					// is not wokring, else will start
																					// with 0

		{

			String ClickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLinkTab);

			Thread.sleep(5000L);

		} // opens all the tabs
		// 5. Get the title of each and every tab opened

		Set<String> abc = driver.getWindowHandles();
		java.util.Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
