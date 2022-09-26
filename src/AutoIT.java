import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class*='btn tooltip--left']")).click();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='processTask']")));

		driver.findElement(By.xpath("//button[@id='processTask']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("[id*='pickfiles']")));
		driver.findElement(By.id("[id*='pickfiles']")).click();
		Thread.sleep(5000);
		
		File f = new File(downloadPath + "/converted.zip");
		if (f.exists())
		{
			System.out.println("FILE FOUND");
		}
		else
		{
			System.out.println("FILE NOT FOUND");
		}
		
	}

}
