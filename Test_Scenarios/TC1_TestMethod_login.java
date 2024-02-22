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

import Test_Objects.TC1_login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_TestMethod_login {
	
	WebDriver driver;
	TC1_login pagefactory;
	
	
	
	@BeforeTest
	
	public void beforetest() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		
		
		
		//Code for Ad block
		
//		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("C:\\Users\\user\\Downloads\\AdBlock-—-best-ad-blocker.crx"));
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(capabilities);
//		driver = new ChromeDriver(options);
		
	}
	
	@Test
	public void loginpage(){
		pagefactory = new TC1_login(driver);
		pagefactory.loginPage("login");
		
	}
	@AfterTest
	public void close() {
		driver.close();	}
	
	

}
