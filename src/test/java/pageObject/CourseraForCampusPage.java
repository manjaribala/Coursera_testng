package pageObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.excelUtils;

public class CourseraForCampusPage extends BasePage{

	public CourseraForCampusPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "//h1[text()='Coursera for Campus']")
	WebElement crsForCampus;
	
	@FindBy(xpath ="(//span[text()='Learn more'])[2]" )
	WebElement learnmore;	
	
	@FindBy(xpath = "//input[@name='FirstName']" )
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement lastName;	
	
	@FindBy(xpath = "//input[@name='Email']" )
	WebElement email;
	
	@FindBy(xpath = "//input[@name='Phone']")
	WebElement phoneNo;
	
	@FindBy(name = "Institution_Type__c")
	WebElement instiType;
	
	@FindBy(xpath = "//input[@name='Company']")
	WebElement company;
	
	
	@FindBy(id = "Title" )
	WebElement jobTitle;	
	
	@FindBy(id = "Department")
	WebElement department;
	
	@FindBy(id = "What_the_lead_asked_for_on_the_website__c" )
	WebElement description;
	
	@FindBy(id = "Country")
	WebElement country;
	
	@FindBy(id = "State")
	WebElement state;
	
	@FindBy(name = "Express_Consent__c")
	WebElement checkBox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;
	
	@FindBy(id = "ValidMsgEmail")
	WebElement errorMessage;
	
	
//Action
	public void clckCrsForCampus() {
		js.executeScript("arguments[0].scrollIntoView();", crsForCampus);
		learnmore.click();
	}
    public void form() throws InterruptedException, IOException{
    
    List<String> data= new ArrayList<String>();
	for(int i=0;i<11;i++) {
		String input=excelUtils.getCellData("./Excel/InputData.xlsx", "Sheet2", 1, i);
		data.add(input);
	}

	js.executeScript("arguments[0].scrollIntoView();", firstName);
    firstName.sendKeys(data.get(0));
    lastName.sendKeys(data.get(1));
    email.sendKeys(data.get(2));
    phoneNo.sendKeys(data.get(3));
    
    Select instituion =new Select(instiType);
    instituion.selectByValue(data.get(4));
    
    company.sendKeys(data.get(5));

    Select jobtlt =new Select(jobTitle);
    jobtlt.selectByValue(data.get(6));
    
    Select dpmt =new Select(driver.findElement(By.id("Department")));
    dpmt.selectByValue(data.get(7));
    
    Select descript =new Select(description);
    descript.selectByValue(data.get(8));
    
    Select cntry =new Select(country);
    cntry.selectByValue(data.get(9));
    
    Select ste =new Select(state);
    ste.selectByValue(data.get(10));
    
    
    js.executeScript("arguments[0].click();",checkBox);
    
    js.executeScript("arguments[0].click();",submit);
    
    System.out.println("Error Message: " + errorMessage.getText());
    String msg=errorMessage.getText();
    excelUtils.setCellData("./Excel/OutputData.xlsx", "ErrorMsg", 0, 0, msg);

    }
}
