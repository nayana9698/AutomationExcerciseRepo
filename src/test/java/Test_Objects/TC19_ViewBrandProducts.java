package Test_Objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC19_ViewBrandProducts {
	
WebDriver driver;
	
	public  TC19_ViewBrandProducts(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	

	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	
	
	@FindBy(xpath = "//h2[contains(text(),'Brands')]")public WebElement brands;
	@FindBy(xpath = "//a[text()='Polo']")public WebElement brandPolo;
	@FindBy(xpath = "//h2[contains(text(),'Brand - Polo Products')]")public WebElement poloProducts;
	
	@FindBy(xpath = "//body/section[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement brandMadame;
	@FindBy(xpath = "//h2[contains(text(),'Brand - Madame Products')]")public WebElement madameProducts;
	
	
	public void viewBrands(String SearchInput) {
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
	
	brands.isDisplayed();
	System.out.println(brands.getText());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	brandPolo.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	poloProducts.isDisplayed();
	System.out.println(poloProducts.getText());
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	brandMadame.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	madameProducts.isDisplayed();
	System.out.println(madameProducts.getText());
	
		}	

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
	}
