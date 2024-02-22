package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC22_RecommendedProduct {
	
	
	
WebDriver driver;
	
	public  TC22_RecommendedProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	
	@FindBy(xpath = "//h2[contains(text(),'recommended items')]")public WebElement recommendedItems;
	
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")public WebElement addToCart;
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/a[1]/i[1]")public WebElement arrow;
	@FindBy(xpath = "//u[contains(text(),'View Cart')]")public WebElement viewCart;
	
	
	
	public void recommendedProd(String SearchInput) {
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
	
	recommendedItems.isDisplayed();
	System.out.println(recommendedItems.getText());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView();", recommendedItems);
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	System.out.println("Recommended items displayed successfully");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	arrow.click();

	
	WebDriverWait wait = new WebDriverWait(driver,30);
	WebElement addToCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")));
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	viewCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	
	WebElement productName = driver.findElement(By.xpath("//a[contains(text(),'Blue Top')]"));
	System.out.println("Recommended product "+productName.getText()+" is addedd to cart");
	
	
		}

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}

}
