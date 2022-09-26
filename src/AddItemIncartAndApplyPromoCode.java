import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemIncartAndApplyPromoCode {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int i=0;
		int j=0;
		String[] itemsneeded = {"Brocolli","Beetroot", "Cucumber", "Banana"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		// //button[text()='ADD TO CART'] - xpath to find maching elements 
		List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));
		
		for(i=0; i<products.size(); i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattedname = name[0].trim();
			
			List itemsneededList = Arrays.asList(itemsneeded);
			
			
			if(itemsneededList.contains(formattedname))
			{
				j++;
				// Click on ADD TO CART
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsneeded.length)
				{
					break;
				}
				
				
			}
		}
		
		
		System.out.println("OK");
	}

}
