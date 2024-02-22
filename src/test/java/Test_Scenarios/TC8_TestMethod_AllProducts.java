package Test_Scenarios;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test_Objects.TC8_AllProducts;

public class TC8_TestMethod_AllProducts {
	
	WebDriver driver;
	TC8_AllProducts pagefactory;
	
	
@BeforeTest
	
	public void beforetest() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	//driver = new ChromeDriver();
	
	ChromeOptions options = new ChromeOptions();
	options.addExtensions(new File("C:\\Users\\user\\Downloads\\AdBlock-—-best-ad-blocker.crx"));
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	options.merge(capabilities);
	driver = new ChromeDriver(options);
	
	
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://automationexercise.com");
}
	
	@Test
	public void productDescr(){
		pagefactory = new TC8_AllProducts(driver);
		pagefactory.productDetails("product description");
		
		
	}
	@AfterTest
	public void close() {
		driver.close();	}
	
	


}
