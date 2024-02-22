package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC5_ExistingMail {
	
	
	WebDriver driver;
	
	public TC5_ExistingMail (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")public WebElement NewUser;
	@FindBy(name = "name")public WebElement name;
	@FindBy (xpath="//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")public WebElement email;
	@FindBy(xpath = "//button[contains(text(),'Signup')]") public WebElement submit;
	@FindBy(xpath = "//p[contains(text(),'Email Address already exist!')]") public WebElement error;
	
	
	
	public void existingMail(String SearchInput) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			signup.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			NewUser.isDisplayed();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			System.out.println(NewUser.getText());
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			name.sendKeys("Nayana");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			email.sendKeys("nayanagr9698@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			submit.click();
			error.isDisplayed();
			System.out.println(error.getText());
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}	

}
