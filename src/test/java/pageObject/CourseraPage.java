package pageObject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utilities.excelUtils;

public class CourseraPage extends BasePage{

	public CourseraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	Actions actions = new Actions(driver);
	
	@FindBy(xpath ="(//input[@type='text'])[1]" )
	WebElement search;
	
	@FindBy(xpath = "//a[text()='For Enterprise']")
	WebElement forEnterprise;
	
	
	@FindBy(xpath = "//a[text()='What We Offer']" )
	WebElement product;
	
	//Action
	
	public void webDevelopment() throws IOException{
		String webdevep=excelUtils.getCellData("./Excel/InputData.xlsx", "Sheet1", 0, 0);
        search.sendKeys(webdevep);
        search.sendKeys(Keys.ENTER);
	
	}
//	
//	@Test(dataProvider = "excelData")
//    public void webDevelopment(String webdevep, String langlearn) throws IOException {
//        // Your code for web development
//        // Use the 'webdevep' and 'langlearn' variables as needed
//        webdevep=excelUtils.getCellData("./Excel/InputData.xlsx", "Sheet1", 0, 0);
//        search.sendKeys(webdevep);
//        search.sendKeys(Keys.ENTER);
//    }
//
//    @Test(dataProvider = "excelData")
//    public void languageLearning(String webdevep, String langlearn) throws IOException {
//        // Your code for language learning
//        // Use the 'webdevep' and 'langlearn' variables as needed
//        langlearn=excelUtils.getCellData("./Excel/InputData.xlsx", "Sheet1", 0, 1);
//        search.sendKeys(langlearn);
//        search.sendKeys(Keys.ENTER);
    
	public void clear() throws InterruptedException {
//		search.clear();
		search.click();
		actions.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		actions.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(4000);
	}
	
	public void languageLearning() throws IOException{
		String langlearn=excelUtils.getCellData("./Excel/InputData.xlsx", "Sheet1", 0, 1);
        search.sendKeys(langlearn);
        search.sendKeys(Keys.ENTER);
	}
	public void clickEnterprise() {
		js.executeScript("arguments[0].scrollIntoView();", forEnterprise);
	    js.executeScript("arguments[0].click();",forEnterprise);
	}
	public void clkprd()
	{
		js.executeScript("arguments[0].scrollIntoView();", product);
		js.executeScript("arguments[0].click();",product);
	}	

	
	
}
