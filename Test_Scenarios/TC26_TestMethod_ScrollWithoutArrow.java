package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Test_Objects.TC26_ScrollWithoutArrow;

public class TC26_TestMethod_ScrollWithoutArrow {
	

	
	WebDriver driver;
	TC26_ScrollWithoutArrow pagefactory;
	
	
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
	public void scrollWithoutArrow(){
		pagefactory = new TC26_ScrollWithoutArrow(driver);
		pagefactory.scrollWithOutArrow("scroll without arrow");
		
		
	}
	@AfterTest
	public void close() {
		driver.close();	}
	
	
}
