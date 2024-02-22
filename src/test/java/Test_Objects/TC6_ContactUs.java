package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC6_ContactUs {
	
	
	WebDriver driver;
	
	public TC6_ContactUs (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	

	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")public WebElement contactUs;
	@FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")public WebElement GetInTouch;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]")public WebElement name;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]")public WebElement email;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]")public WebElement subject;
	@FindBy(xpath = "//textarea[@id='message']")public WebElement message;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[5]/input[1]")public WebElement upload;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[6]/input[1]")public WebElement submit;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[2]")public WebElement success;
	@FindBy(xpath = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/a[1]")public WebElement homebtn;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	public void contactUs(String SearchInput) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			
			
			contactUs.click();
			
			GetInTouch.isDisplayed();
			System.out.println(GetInTouch.getText());
			name.sendKeys("Nayana");
			email.sendKeys("nayanagr9698@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			subject.sendKeys("Automation Excercise notes");		
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			message.sendKeys("Trying out Automation scenarios wit TestNG framework");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			upload.sendKeys("D:\\New folder\\Screenshot.png");			
			submit.click();			
			Alert alt = driver.switchTo().alert();		
			alt.accept();			
			success.isDisplayed();
			System.out.println(success.getText());
			homebtn.click();
			
			if(homepage.isDisplayed()) {
				System.out.println("User landed to homepage successfully");
			}
			else {
				System.out.println("User is not in homepage");
			}
	
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}	
	
	
	
}
