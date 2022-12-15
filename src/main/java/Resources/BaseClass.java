package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;

	public void BrowserInitialization() throws IOException {

	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\first.properties");
		Properties prop = new Properties();

		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			// firefox code
		} else {
			System.out.println("please enter valid browser name");
		}

	}

	@BeforeMethod
	public void launch() throws IOException {
		BrowserInitialization();

		driver.get("https://login.salesforce.com/?locale=in");

	}

}
