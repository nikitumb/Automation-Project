import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D://Automation//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a[href*='sign_in']")).click();
		driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("test@test.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("123123123");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}
		
	
	@DataProvider
		public Object[][] getData() 
		{
			// Rows stands for how many different data types test should run
			// column stands for how may values per each test
			Object[][] data = new Object[2][3];
			// 0th row
			data[0][0] = "nonrestricteduser@qw.com";
			data[0][1] = "123456";
			data[0][2] = "Non Restricted user";

			// 1st row

			data[1][0] = "restricteduser@qw.com";
			data[1][1] = "123456";
			data[1][2] = "Restricted user";

			return data;
		
		
	}

}
