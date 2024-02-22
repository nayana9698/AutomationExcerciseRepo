package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TC15_PlaceOrder15 {
	
	
WebDriver driver;
	
	public  TC15_PlaceOrder15(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	

	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath= "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]") public WebElement Signup;	
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
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]") public WebElement loggedIn;
	
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewProduct;	
	@FindBy(xpath= "//button[@type='button']") public WebElement addToCart;
	@FindBy(xpath= "//a//u[text()='View Cart']") public WebElement viewCartClick;
	@FindBy(xpath= "//a[contains(text(),'Proceed To Checkout')]") public WebElement proceedCheck;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Address Details')]") public WebElement addressDetails;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[6]/textarea[1]") public WebElement description;
	@FindBy(xpath = "//a[contains(text(),'Place Order')]") public WebElement placeOrder;
	
	
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]") public WebElement nameOnCard;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]") public WebElement cardNum;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]") public WebElement cvc;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]") public WebElement expiry;
	@FindBy(xpath = "//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]") public WebElement year;
	@FindBy(xpath = "//button[@id='submit']") public WebElement payAndConfirm;
	@FindBy(xpath = "//a[text()=' Delete Account']") public WebElement DeleteAcc;
	@FindBy(xpath = "//b[text()='Account Deleted!']") public WebElement DeleteMsg;
	@FindBy(xpath = "//a[text()='Continue']") public WebElement continueLast;
	
	public void placeOrder15(String SearchInput) {
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
	
	
	Signup.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	name.sendKeys("Sushma");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	email.sendKeys("sushma126548@gmail.com");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	submit.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	title.isDisplayed();
	System.out.println(title.getText());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	gender.click();
	password.sendKeys("newSushma123");
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
	
	viewProduct.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	viewCartClick.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	proceedCheck.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	System.out.println("added");
	
	addressDetails.isDisplayed();
	System.out.println(addressDetails.getText());
	
	description.sendKeys("Ordering now!");
	placeOrder.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	nameOnCard.sendKeys("Sushma");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cardNum.sendKeys("6578542356");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cvc.sendKeys("638");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	expiry.sendKeys("June");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	year.sendKeys("2030");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	payAndConfirm.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	DeleteAcc.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	DeleteMsg.isDisplayed();
	System.out.println(DeleteMsg.getText());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	continueLast.click();
	
		}
		

	catch (Exception e) {
		System.out.println("Exception Caught "+ e.getMessage());
	}
		}


}
