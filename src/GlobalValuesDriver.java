import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDriver {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	Properties prop = new Properties();
	FileInputStream fls = new FileInputStream("D:\\JavaProjects\\Practice\\src\\data.properties");
		
	prop.load(fls);
	System.out.println(prop.getProperty("browser"));
	System.out.println(prop.getProperty("url"));
	prop.setProperty("browser", "firefox");
	System.out.println(prop.getProperty("browser"));
	
	FileOutputStream flo = new FileOutputStream("D:\\JavaProjects\\Practice\\src\\data.properties");
	prop.store(flo,null);
	
	
	
	
	}

}
