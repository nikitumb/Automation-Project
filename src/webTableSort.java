import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class webTableSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Automation/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//TO DO
		// Click on the column 
		// Capture all the web elements  in to one list 
		// Get text and capture text for all web elements in to new (Original list ) list 
		// Apply sort on that new list say it is sorted list - (Sorted list)
		// Compair origianl vs sorted list 
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		// Click on the column 
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		// Capture all the web elements  in to one list 
       	List<WebElement> elementlist =  driver.findElements(By.xpath("//tr/td[1]"));
       	
       	
       	// Capture all the web elements  in to one list 
       	List<String> origianlList =  elementlist.stream().map(s->s.getText()).collect(Collectors.toList()); 
       	
       	
       	// Apply sort on that new list say it is sorted list - (Sorted list)
       	List<String> sortedList =  origianlList.stream().sorted().collect(Collectors.toList());
       	
       	// Compare original vs sorted list 
       	Assert.assertTrue(origianlList.equals(sortedList));
       	List<String> price;
       	// Get price of each vegetables - > get price for beans 
       	// Login - scan the column name and get text for rice > Print the price of that vegetable 
       	do
       	{
       	List<WebElement> rows =  driver.findElements(By.xpath("//tr/td[1]"));
        price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect(Collectors.toList());
       	price.forEach(s->System.out.println(s));
       	
       	if(price.size()<1)
       	{
       		driver.findElement(By.cssSelector("[aria-label='Next']")).click();
       	}
       	 
       	}while(price.size()<1);
       	
	}

	private static String  getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return pricevalue;
	}

}
