package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC16_PlaceOrder16 {
	
	
WebDriver driver;
	
	public  TC16_PlaceOrder16(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")public WebElement user;
	
	
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
	
	
	public void placeOrder16(String SearchInput) {
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
	
	signup.click();
	email.sendKeys("nayanagr9698@gmail.com");
	password.sendKeys("nayana9698");
	loginbutton.click();
	user.isDisplayed();
	System.out.println(user.getText());
	
	

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
	
	
	nameOnCard.sendKeys("Nayana");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cardNum.sendKeys("65567842356");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cvc.sendKeys("635");
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
