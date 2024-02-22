package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC21_ReviewProduct {
	
WebDriver driver;
	
	public  TC21_ReviewProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li/a")public WebElement viewProduct;
	
	@FindBy(xpath = "//a[contains(text(),'Write Your Review')]")public WebElement review;
	
	@FindBy(xpath = "//input[@id='name']")public WebElement name;
	@FindBy(xpath = "//input[@id='email']")public WebElement email;
	@FindBy(xpath = "//textarea[@id='review']")public WebElement comments;
	@FindBy(xpath = "//button[@id='button-review']")public WebElement submit;
	@FindBy(xpath = "alert-success alert")public WebElement success;

	
	public void reviewProd(String SearchInput) {
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
	
//	
//	if(img.isDisplayed()) {
//		System.out.println("Products displayed");
//	}
//	else {
//		System.out.println("Products not displayed");
//	}
	
	viewProduct.click();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	
	review.isDisplayed();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	System.out.println(review.getText());
	
	name.sendKeys("Nayana");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	email.sendKeys("nayanagr9698@gmail.com");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	comments.sendKeys("Good Product and Worth the money, highly recommended");
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	submit.click();
	
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	success.isDisplayed();
	System.out.println(success.getText());
	
	
		}

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
	}
