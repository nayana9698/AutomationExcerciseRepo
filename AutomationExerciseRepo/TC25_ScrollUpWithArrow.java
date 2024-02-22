package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;

public class TC25_ScrollUpWithArrow {

	
WebDriver driver;
	
	public  TC25_ScrollUpWithArrow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;	
	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")public WebElement footerele;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement topele;	
	
	
	
	
	public void scrollWithArrow(String SearchInput) {
		try {
			
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);


	if(homepage.isDisplayed()) {
		System.out.println("User landed to homepage successfully");
	}
	else {
		System.out.println("User is not in homepage");
	}

	JavascriptExecutor js = (JavascriptExecutor)driver;	
	js.executeScript("arguments[0].scrollIntoView();", footerele);
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	System.out.println("Subscription displayed successfully");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
//	EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
//	
//	eventFiringWebDriver.executeScript("document.querySelector('#header > div > div > div').scrollTop=500");
	//scroll up
	
	
	js.executeScript("arguments[0].scrollIntoView();", topele);
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	System.out.println("Automation Engineers displayed successfully");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	
		}
		
		
		
		

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
	}