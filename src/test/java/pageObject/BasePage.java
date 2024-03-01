package pageObject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    // Explicit constructor with WebDriver parameter
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public String handleWindows() {
        String parentId=driver.getWindowHandle();
        Set<String> windowids = driver.getWindowHandles();
        for(String w:windowids) {
			if(!w.equals(parentId)) {
				driver.switchTo().window(w);
				break;
			}
		}
		return parentId;
    }
}