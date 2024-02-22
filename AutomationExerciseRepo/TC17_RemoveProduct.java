package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC17_RemoveProduct {
	
	
WebDriver driver;
	
	public  TC17_RemoveProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewProduct;
	
	@FindBy(xpath= "//button[@type='button']") public WebElement addToCart;
	@FindBy(xpath= "//a//u[text()='View Cart']") public WebElement viewCartClick;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	
	@FindBy(xpath= "//tbody/tr[@id='product-1']/td[6]/a[1]") public WebElement x;
	
	@FindBy(xpath= "//b[contains(text(),'Cart is empty!')]") public WebElement cartEmpty;
	
	public void removeProduct(String SearchInput) {
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
	
	
	products.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	viewProduct.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	viewCartClick.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	x.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cartEmpty.isDisplayed();
	System.out.println(cartEmpty.getText());
	
	
	
		}	

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
	}
