package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TC8_AllProducts {
	
	
WebDriver driver;
	
	public  TC8_AllProducts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	//@FindBy(xpath = "//h2[contains(text(),'All Products')]")public WebElement allProducts;
	@FindBy(id = "sale_image")public WebElement img;
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewProduct;
	@FindBy(xpath = "//h2[contains(text(),'Blue Top')]")public WebElement prodName;
	@FindBy(xpath = "//p[contains(text(),'Category: Women > Tops')]")public WebElement prodCategory;
	@FindBy(xpath = "//span[contains(text(),'Rs. 500')]")public WebElement prodPrice;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[2]")public WebElement prodAvailability;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[3]")public WebElement prodCondition;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[4]")public WebElement prodBrand;
	
public void productDetails(String SearchInput) {
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


//WebDriverWait wait = new WebDriverWait(driver,30);
//WebElement prod=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")));

products.click();

if(img.isDisplayed()) {
	System.out.println("Products displayed");
}
else {
	System.out.println("Products not displayed");
}
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);


viewProduct.click();


driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
System.out.println("Product Name is:" +prodName.getText());
System.out.println("Product Category is:" + prodCategory.getText());
System.out.println("Product Price is:" +prodPrice.getText());
System.out.println("Product Availability is:" +prodAvailability.getText());
System.out.println("Product Condition is:" +prodCondition.getText());
System.out.println("Product Brand is:" +prodBrand.getText());

	}
	
	
catch (Exception e) {
	System.out.println("Exception Caught "+ e.getMessage());
}
}	

}
