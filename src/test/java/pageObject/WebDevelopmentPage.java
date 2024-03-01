package pageObject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class WebDevelopmentPage extends BasePage{

	public WebDevelopmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "(//input[@type='checkbox'])[6]")
	WebElement lang;
	
	@FindBy(xpath = "//span[text()='Beginner']" )
	WebElement level;
	
	@FindBy(xpath="//h3[text()='Meta Front-End Developer']")
	WebElement course1;
	
	@FindBy(xpath = "//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']" )
	WebElement courseTitle1;
	
	@FindBy(xpath = "(//div[@class='css-lt1dx1'])[2]/div[1]/div")
	WebElement crsRating1;
	
	@FindBy(xpath = "(//div[@class='css-lt1dx1'])[2]/div[3]")
	WebElement crsDuration1;
	
	@FindBy(xpath = "//h3[text()='Introduction to Web Development']" )
	WebElement course2;
	
	@FindBy(xpath = "//h1[@class='cds-119 cds-Typography-base css-1xy8ceb cds-121']")
	WebElement courseTitle2;
	
	@FindBy(xpath = "(//div[@class='cds-119 cds-Typography-base css-h1jogs cds-121'])[1]")
	WebElement crsRating2;
	
	@FindBy(xpath = "//div[@class='cds-119 css-1h3hs08 cds-121']")
	WebElement crsDuration2;
//-----------------------------------------------------------------------
//	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[1]")
//	WebElement course1;
//	@FindBy(xpath = "(//p[@class='cds-119 css-11uuo4b cds-121'])[1]")
//	WebElement crsRating1;
//	
//	@FindBy(xpath = "(//div[@class='css-lt1dx1'])[2]/div[3]")
//	WebElement crsDuration1;
//    
//	@FindBy(xpath="(//h3[@class='cds-CommonCard-title css-1sktkql'])[2]")
//	WebElement course2;
//	@FindBy(xpath = "(//p[@class='cds-119 css-11uuo4b cds-121'])[2]")
//	WebElement crsRating2;
//	
//	@FindBy(xpath = "//div[@class='cds-119 css-1h3hs08 cds-121']")
//	WebElement crsDuration2;
	
	
	
	
	//Action
	public void filterByLang() {
		lang.click();
        js.executeScript("window.scrollBy(0,700);");
	}
	public void filterByLevel() {
	
		level.click();	
	}
	
	
	public void courseOne() {
	      js.executeScript("arguments[0].click();",course1);
	}
	public void courseOneDetails() {
	    String parentId = handleWindows();
	    String courseTitle = courseTitle1.getText();
//	    String courseTitle = course1.getText();
	    String courseRating = crsRating1.getText();
	    String courseDuration = crsDuration1.getText();
	    System.out.println(courseTitle);
	    System.out.println(courseRating);
	    System.out.println(courseDuration);
	    try {
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 1, 0, courseTitle);
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 2, 0, courseRating);
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 3, 0, courseDuration);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    driver.close();
	    driver.switchTo().window(parentId);
	}

	
	public void courseTwo() {
	      js.executeScript("arguments[0].click();",course2);
	}
	public void courseTwoDetails() {
	    String parentId = handleWindows();
	    String courseTitle = courseTitle2.getText();
//	    String courseTitle = course2.getText();
	    String courseRating = crsRating2.getText();
	    String courseDuration = crsDuration2.getText();
	    System.out.println(courseTitle);
	    System.out.println(courseRating);
	    System.out.println(courseDuration);
	    try {
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 1, 1, courseTitle);
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 2, 1, courseRating);
	        excelUtils.setCellData("./Excel/OutputData.xlsx", "CourseDetails", 3, 1, courseDuration);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    driver.close();
	    driver.switchTo().window(parentId);
	}
	

}
