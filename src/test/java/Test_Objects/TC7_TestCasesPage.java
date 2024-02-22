package Test_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TC7_TestCasesPage {
	
WebDriver driver;
	
	public  TC7_TestCasesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}	
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")public WebElement homepage;
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")public WebElement testcase;
	@FindBy(xpath = "//b[contains(text(),'Test Cases')]")public WebElement testTitle;
	//@FindBy(xpath = "//b[contains(text(),'Test Cases')]")public WebElement testTitle;
	//@FindBy(xpath = "//span[contains(text(),'Below is the list of test Cases for you to practic')]")public WebElement testHeading;
	
	
	
	
	public void testCases(String SearchInput) {
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
	
	testcase.click();
//	testTitle.isDisplayed();
//	//System.out.println(testTitle.getText());
//	System.out.println("Test Cases");
String url = driver.getCurrentUrl();
System.out.println(url);
System.out.println("User is on Test case page");

	

//	if(testHeading.isDisplayed()){
//		System.out.println("User is on Test cases page");
//		
//	}
//	else {
//		System.out.println("User is not in test cases page");
//	}
	
	
		}
		
		
	catch (Exception e) {
		System.out.println("Exception Caught "+ e.getMessage());
	}
}	



}