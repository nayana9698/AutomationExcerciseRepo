package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC3_LoginInvalid {
	
WebDriver driver;
	
	public TC3_LoginInvalid (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")public WebElement error;
	
	
	public void invalidlogin(String mail) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			
			signup.click();
			email.sendKeys("abcdefg@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			password.sendKeys("123456");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			loginbutton.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			error.isDisplayed();
			System.out.println(error.getText());
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}

}
