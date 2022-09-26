import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceLabs {
	
	public static final String username = "nikit.umb@gmail.com";
	public static final String access_key = "a31dfef7-433c-40af-8ef5-ec5edd650c71";
	  public static final String URL = "https://" + username + ":" + access_key + "@ondemand.saucelabs.com:80/wd/hub";



	  public static void main(String[] args) throws MalformedURLException {

	  // TODO Auto-generated method stub



		 DesiredCapabilities caps = new DesiredCapabilities();
		/*/ * caps.setCapability("browser", "chrome"); caps.setCapability("platform",
		 * "Windows 7");
		 * 
		 * caps.setCapability("version", "51.0");
		 */

	  WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

	  driver.get("http://google.com");

	  System.out.println(driver.getTitle());

	  }



	  }
