package Goals.Selenium_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_Setup {

	public static WebDriver driver;
	public static String driverPath = System.getProperty("user.dir").concat("\\src\\test\\resources\\drivers\\");

	@Test
	public void test() throws MalformedURLException, InterruptedException {

		String URL = "http://www.DemoQA.com";
		String Node = "http://172.16.17.78:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		driver = new RemoteWebDriver(new URL(Node), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.quit();
	}
}
