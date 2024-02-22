package Test_Objects;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC13_ViewProduct {

	
WebDriver driver;
	
	public  TC13_ViewProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")public WebElement viewProduct;
	@FindBy(xpath = "//h2[contains(text(),'Blue Top')]")public WebElement prodName;
	@FindBy(xpath = "//p[contains(text(),'Category: Women > Tops')]")public WebElement prodCategory;
	@FindBy(xpath = "//span[contains(text(),'Rs. 500')]")public WebElement prodPrice;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[2]")public WebElement prodAvailability;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[3]")public WebElement prodCondition;
	@FindBy(xpath = "//body[1]/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/p[4]")public WebElement prodBrand;
	@FindBy(id= "quantity") public WebElement num;
	
	@FindBy(xpath= "//button[@type='button']") public WebElement addToCart;
	@FindBy(xpath= "//a//u[text()='View Cart']") public WebElement viewCartClick;
	
	@FindBy(xpath= "//td[@class='cart_quantity']") public WebElement prodQuan;
	
	
public void viewProduct(String SearchInput) {
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



viewProduct.click();
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

System.out.println("Product Name is:" +prodName.getText());
System.out.println("Product Category is:" + prodCategory.getText());
System.out.println("Product Price is:" +prodPrice.getText());
System.out.println("Product Availability is:" +prodAvailability.getText());
System.out.println("Product Condition is:" +prodCondition.getText());
System.out.println("Product Brand is:" +prodBrand.getText());



num.clear();
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
num.sendKeys("4");
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);



addToCart.click();
System.out.println("Product added successfully");
driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

viewCartClick.click();

String qty = prodQuan.getText();
assertEquals(qty,"4");


	}
	

	
	
catch (Exception e) {
	System.out.println("Exception Caught "+ e.getMessage());
}
}	

}
