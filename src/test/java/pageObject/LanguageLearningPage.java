package pageObject;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.excelUtils;

public class LanguageLearningPage extends BasePage{

	public LanguageLearningPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    JavascriptExecutor js = (JavascriptExecutor) driver;

	@FindBy(xpath = "(//span[text()='Show more'])[2]") 
	WebElement showmore ;
	
	@FindBy(xpath = "//div[@id='checkbox-group']//div//div")
	List<WebElement> Languages;
	
	@FindBy(xpath = "(//span[text()='Close'])[2]")
	WebElement closeLang ;
	
	@FindBy(xpath = "(//div[@class='cds-215 cds-formControl-root css-wns57a'])[4]//div/span")
	List<WebElement> Levels;
	

	//Action
	public void languagesList() {
	    js.executeScript("arguments[0].click();", showmore);
	    int rowNum = 1;
	    for (WebElement l : Languages) {
	        String language = l.getText();
	        try {
	            excelUtils.setCellData("./Excel/OutputData.xlsx","Language", rowNum, 0, language);
	            System.out.println(language);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        rowNum++;
	    }
        System.out.println("Total Number of Languages: "+Languages.size());

	    js.executeScript("arguments[0].click();", closeLang);
	}
	
	public void levelList() {
	    int rowNum = 1;
	    for (WebElement l : Levels) {
	        String Levels = l.getText();
	        try {
	            excelUtils.setCellData("./Excel/OutputData.xlsx","Language", rowNum, 1, Levels);
	            System.out.println(Levels);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        rowNum++;
	    }
        System.out.println("Total Number of Levels: "+Levels.size());

	}


}
