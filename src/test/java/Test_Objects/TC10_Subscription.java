package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC10_Subscription {
	
	
WebDriver driver;
	
	public  TC10_Subscription(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//h2[contains(text(),'Subscription')]")public WebElement footerele;
	@FindBy(xpath = "//input[@id='susbscribe_email']")public WebElement email;
	@FindBy(xpath = "//button[@id='subscribe']")public WebElement subscribeBtn;
	@FindBy(id = "success-subscribe")public WebElement successMsg;
	
	

	public void subscription(String SearchInput) {
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
	//WebElement footerele = driver.findElement(By.xpath("//h2[contains(text(),'Subscription')]"));
	
	js.executeScript("arguments[0].scrollIntoView();", footerele);
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	System.out.println("Subscription displayed successfully");
	
	email.sendKeys("nayanagr9698@gmail.com");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	subscribeBtn.click();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	successMsg.isDisplayed();
	System.out.println(successMsg.getText());
	
		}
	catch (Exception e) {
		System.out.println("Exception Caught "+ e.getMessage());
	}
	
	}
}
