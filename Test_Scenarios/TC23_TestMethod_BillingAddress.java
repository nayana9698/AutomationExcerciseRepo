package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test_Objects.TC23_BillingAddress;

public class TC23_TestMethod_BillingAddress {
	
	
	WebDriver driver;
	TC23_BillingAddress pagefactory;
	
	
@BeforeTest
	
	public void beforetest() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
}
	
	@Test
	public void saree(){
		pagefactory = new TC23_BillingAddress(driver);
		pagefactory.billingAddress("billing address");
		
		
	}
	@AfterTest
	public void close() {
		driver.close();	}
	

}
