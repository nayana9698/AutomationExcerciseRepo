package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC4_Logout {
	WebDriver driver;
	
	public  TC4_Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")public WebElement user;
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]")public WebElement logout;
	
	
	public void logout(String mail) {
		try {
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Automation Excercise";
			Assert.assertNotEquals(ActualTitle, ExpectedTitle);

			
			signup.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			email.sendKeys("nayanagr9698@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			password.sendKeys("nayana9698");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			loginbutton.click();
			user.isDisplayed();
			//user.getText();
			System.out.println(user.getText());
			logout.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			//driver.getCurrentUrl();
			System.out.println("User loggedout successfully and is in home page");
			
		
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}


}
