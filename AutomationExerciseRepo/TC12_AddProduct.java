package Test_Objects;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC12_AddProduct {
	
WebDriver driver;
	
	public  TC12_AddProduct(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	//@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	@FindBy(xpath = "//a[text()=' Products']")public WebElement products;
	@FindBy (xpath="//div//a[@data-product-id='1']") WebElement addToCart;
	@FindBy (xpath="//button[contains(text(),'Continue Shopping')]") WebElement continueShop;
	@FindBy (xpath="(//a[@data-product-id='2'])[1]") WebElement addToCart2;
	@FindBy (xpath="//a//u[contains(text(),'View Cart')]") WebElement viewCart;
	
	
	
	
	
	public void addProduct(String SearchInput) {
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
	
	
	
	addToCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	continueShop.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	addToCart2.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	viewCart.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	List<WebElement> firstProduct = driver.findElements(By.id("product-1"));
	List<WebElement> secondProduct = driver.findElements(By.id("product-2"));
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	
	map.put(1,"Blue Top");
	map.put(1,"Women > Tops");
	map.put(1,"Rs. 500");
	map.put(1,"1");
	map.put(1,"Rs. 500");
	
	map.put(2,"Men Tshirt");
	map.put(2,"Men > Tshirts");
	map.put(2,"Rs. 400");
	map.put(2,"1");
	map.put(2,"Rs. 400");
	
	for(int i=0;i<firstProduct.size();i++) {
		assertTrue(firstProduct.get(i).getText().contains(map.get(1)));
		assertTrue(secondProduct.get(i).getText().contains(map.get(2)));
		
		
				
	}
	
	
	
//	Actions action = new Actions(driver);
//	
//	action.moveToElement(product1).perform();
//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//	System.out.println("Hovered on Product");
	
//	AddtoCartButtonproduct1.click();
//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//	System.out.println("Product 1 clicked");
	
	//continueShopping.click();
	
	
	
		}
		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
		
		}

}
