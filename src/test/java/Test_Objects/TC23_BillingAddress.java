package Test_Objects;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC23_BillingAddress {
	
	
	
WebDriver driver;
	
	public  TC23_BillingAddress(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")public WebElement NewUser;
	@FindBy(name = "name")public WebElement name;
	@FindBy (xpath="//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")public WebElement email;
	@FindBy(xpath = "//button[contains(text(),'Signup')]") public WebElement submit;
	
	@FindBy(xpath = "//b[contains(text(),'Enter Account Information')]") public WebElement title;
	@FindBy(id = "id_gender2") public WebElement gender;
	@FindBy(id = "password") public WebElement password;
	@FindBy(id = "days") public WebElement days;
	@FindBy(id = "months") public WebElement months;
	@FindBy(id = "years") public WebElement years;
	
	@FindBy(xpath = "//input[@id='newsletter']") public WebElement checkbox1;
	@FindBy(xpath = "//input[@id='optin']") public WebElement checkbox2;
	
	
	
	
	@FindBy(xpath = "//input[@id='first_name']") public WebElement firstName;
	@FindBy(xpath = "//input[@id='last_name']") public WebElement lastName;
	@FindBy(xpath = "//input[@id='address1']") public WebElement address;
	@FindBy(id = "country") public WebElement country;
	@FindBy(xpath = "//input[@id='state']") public WebElement state;
	@FindBy(xpath = "//input[@id='city']") public WebElement city;
	@FindBy(xpath = "//input[@id='zipcode']") public WebElement zipcode;
	@FindBy(xpath = "//input[@id='mobile_number']") public WebElement mobileNum;
	@FindBy(xpath = "//button[contains(text(),'Create Account')]") public WebElement createAcc;
	
	@FindBy(xpath = "//b[text()='Account Created!']") public WebElement successMsg;
	@FindBy(xpath = "//a[text()='Continue']") public WebElement continueBtn;
	//@FindBy(xpath = "//a[text()=' Logged in as ']/b[text()='Sushma']") public WebElement loggedIn;
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]") public WebElement loggedIn;
	
	
	@FindBy (xpath="(//div//a[@data-product-id='1'])[1]") WebElement addToCart;
	@FindBy (xpath="//u[contains(text(),'View Cart')]") WebElement viewCart;
	@FindBy (xpath="//a[contains(text(),'Blue Top')]") WebElement cartProduct;
	@FindBy (xpath="//a[contains(text(),'Proceed To Checkout')]") WebElement proceedToCheckout;
	@FindBy (xpath="//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]") WebElement deleteAcc;
	@FindBy (xpath="//b[contains(text(),'Account Deleted!')]") WebElement successMsgDeleteAcc;
	
	
	
	
	public void billingAddress(String SearchInput) {
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
			name.sendKeys("Soumya");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			email.sendKeys("soumya1045728@gmail.com");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			submit.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			title.isDisplayed();
			System.out.println(title.getText());
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			gender.click();
			password.sendKeys("newSoumya123");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			Select daysDropDown = new Select(days);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			daysDropDown.selectByVisibleText("9");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			Select monthDropDown = new Select(months);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			monthDropDown.selectByVisibleText("June");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			Select yearDropDown = new Select(years);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			yearDropDown.selectByVisibleText("1998");
			
			checkbox1.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			checkbox2.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			firstName.sendKeys("Sushma");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			lastName.sendKeys("G R");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			address.sendKeys("Banalore south");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			Select countryDropDown = new Select(country);
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			countryDropDown.selectByVisibleText("India");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			state.sendKeys("Karnataka");
			
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			city.sendKeys("Bangalore");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			zipcode.sendKeys("560051");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			mobileNum.sendKeys("6485738489");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			createAcc.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			successMsg.isDisplayed();
			System.out.println(successMsg.getText());
			
			continueBtn.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			loggedIn.isDisplayed();
			System.out.println(loggedIn.getText());
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			addToCart.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			viewCart.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			cartProduct.isDisplayed();
			System.out.println(cartProduct.getText()+"visible in cart");
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			proceedToCheckout.click();
			
			
			
			
			WebElement BillingName = driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]"));
			WebElement GivenName = driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[1]/ul[1]/li[2]"));
			
			
			BillingName.isDisplayed();
			System.out.println("Billing name" + BillingName.getText() + " Matches with " + "Given Name" + GivenName.getText());
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			
			deleteAcc.click();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			successMsgDeleteAcc.isDisplayed();
			System.out.println(successMsgDeleteAcc.getText());
			
			
			
}
		
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
	}	
}
