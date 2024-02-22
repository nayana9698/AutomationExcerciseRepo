package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC2_LoginValid {
	
WebDriver driver;
	
	public  TC2_LoginValid(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")public WebElement user;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")public WebElement delete;
	@FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")public WebElement accDeleted;
	
	public void validlogin(String mail) {
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
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			delete.click();
			accDeleted.isDisplayed();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			System.out.println(accDeleted.getText());
			
			
		}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}

}
