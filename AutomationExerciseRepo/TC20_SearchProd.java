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
import org.testng.Assert;

public class TC20_SearchProd {
	
	
WebDriver driver;
	
	public  TC20_SearchProd(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")public WebElement products;
	@FindBy(id = "sale_image")public WebElement img;
	
	@FindBy(id = "search_product")public WebElement search;
	@FindBy(id = "submit_search")public WebElement searchbtn;
	@FindBy(xpath = "//h2[contains(text(),'Searched Products')]")public WebElement searchedProducts;
	
	@FindBy(xpath = "(//div//a[@data-product-id='39'])[1]")public WebElement saree1Add;
	@FindBy(xpath = "//button[contains(text(),'Continue Shopping')]")public WebElement continueShop;
	
	@FindBy(xpath = "(//div//a[@data-product-id='40'])[1]")public WebElement saree2Add;
	
	@FindBy(xpath = "(//div//a[@data-product-id='41'])[1]")public WebElement saree3Add;

	@FindBy(xpath = "//a[text()=' Cart']")public WebElement cart;
	
	@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")public WebElement signup;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]")public WebElement email;
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]")public WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Login')]")public WebElement loginbutton;
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")public WebElement cart1;
	
	public void searchProd(String SearchInput) {
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
	
	
	if(img.isDisplayed()) {
		System.out.println("Products displayed");
	}
	else {
		System.out.println("Products not displayed");
	}
	
	search.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	search.sendKeys("Saree");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	searchbtn.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	if(searchedProducts.isDisplayed()) {
		System.out.println("Searched Products displayed successfully");
	}else {
		System.out.println("Searched products didnt displayed");
	}
	
	saree1Add.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	continueShop.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	
	saree2Add.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	continueShop.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	saree3Add.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	continueShop.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	cart.click();
	
	
	
	List<WebElement> firstProduct = driver.findElements(By.xpath("//a[text()='Cotton Silk Hand Block Print Saree']"));
	List<WebElement> secondProduct = driver.findElements(By.xpath("//a[contains(text(),'Rust Red Linen Saree')]"));
	List<WebElement> thirdProduct = driver.findElements(By.xpath("//a[contains(text(),'Beautiful Peacock Blue Cotton Linen Saree')]"));
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	
	map.put(1,"Cotton Silk Hand Block Print Saree");
	map.put(1,"Women > Saree");
	map.put(1,"Rs. 3000");
	map.put(1,"6");
	map.put(1,"Rs. 18000");
	
	map.put(2,"Rust Red Linen Saree");
	map.put(2,"Women > Saree");
	map.put(2,"Rs. 3500");
	map.put(2,"1");
	map.put(2,"Rs. 3500");
	
	
	map.put(3,"Beautiful Peacock Blue Cotton Linen Saree");
	map.put(3,"Women > Saree");
	map.put(3,"Rs. 5000");
	map.put(3,"1");
	map.put(3,"Rs. 5000");
	
	
	
	for(int i=0;i<firstProduct.size();i++) {
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.get(3));
		
//		assertTrue(firstProduct.get(i).getText().contains(map.get(1)));
//		assertTrue(secondProduct.get(i).getText().contains(map.get(2)));
//		assertTrue(thirdProduct.get(i).getText().contains(map.get(3)));
//	
		}	
	
		
	signup.click();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	email.sendKeys("nayanagr9698@gmail.com");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	password.sendKeys("nayana9698");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	
	loginbutton.click();
	
	cart1.click();
		
		
	List<WebElement> firstProduct1 = driver.findElements(By.xpath("//a[contains(text(),'Cotton Silk Hand Block Print Saree']"));
	List<WebElement> secondProduct1 = driver.findElements(By.xpath("//a[contains(text(),'Rust Red Linen Saree')]"));
	List<WebElement> thirdProduct1 = driver.findElements(By.xpath("//a[contains(text(),'Beautiful Peacock Blue Cotton Linen Saree')]"));
	HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	
	
	map.put(1,"Cotton Silk Hand Block Print Saree");
	map.put(1,"Women > Saree");
	map.put(1,"Rs. 3000");
	map.put(1,"6");
	map.put(1,"Rs. 18000");
	
	map.put(2,"Rust Red Linen Saree");
	map.put(2,"Women > Saree");
	map.put(2,"Rs. 3500");
	map.put(2,"1");
	map.put(2,"Rs. 3500");
	
	
	map.put(3,"Beautiful Peacock Blue Cotton Linen Saree");
	map.put(3,"Women > Saree");
	map.put(3,"Rs. 5000");
	map.put(3,"1");
	map.put(3,"Rs. 5000");
	
	
	
	for(int i=0;i<firstProduct1.size();i++) {
		
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
//		
//		assertTrue(firstProduct1.get(i).getText().contains(map1.get(1)));
//		assertTrue(secondProduct1.get(i).getText().contains(map1.get(2)));
//		assertTrue(thirdProduct1.get(i).getText().contains(map1.get(3)));
	
		}	
	
		
		}

		catch (Exception e) {
			System.out.println("Exception Caught "+ e.getMessage());
		}
			}
	}
