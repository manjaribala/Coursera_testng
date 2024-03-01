package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.CourseraPage;
import pageObject.WebDevelopmentPage;
import testBase.BaseClass;

public class TC_001_WebDevelopment extends BaseClass {

	@Test(priority=1,groups= {"sanity"})
	public void navigatingToWebDevelopment() throws IOException {
		CourseraPage h = new CourseraPage(driver);
		//logger.info("------Searching Web Development-------");
		logger.info("------Searching Web Development-------");
		h.webDevelopment();
	}
	@Test(priority=2)
	public void filterLanguage() {//filter by lang and level
		WebDevelopmentPage wd=new WebDevelopmentPage(driver);
		wd.filterByLang();
		logger.info("-----Filter By Language to English and Level to Begineer-------");
	}
	@Test(priority=3)
	public void filterLevel() {//filter by lang and level
		WebDevelopmentPage wd=new WebDevelopmentPage(driver);
		wd.filterByLevel();
		logger.info("-----Filter By Language to English and Level to Begineer-------");
	}
	
	@Test(priority=4)
	public void courseOneDetails() {
		WebDevelopmentPage wd=new WebDevelopmentPage(driver);
		wd.courseOne();
		logger.info("-----Display Course 1-----");
		wd.courseOneDetails();
	}
	
	@Test(priority=5)
	public void courseTwoDetails() {
		WebDevelopmentPage wd=new WebDevelopmentPage(driver);
		logger.info("-----Display Course 2-----");
		wd.courseTwo();
		wd.courseTwoDetails();
	}
	
}
