package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.CourseraForCampusPage;
import pageObject.CourseraPage;
import testBase.BaseClass;

public class TC_003_CourseForCampus extends BaseClass{
	
	@Test(priority=1,groups= {"sanity"})
	public void navigatingToForEnterprise() throws InterruptedException {
		CourseraPage h = new CourseraPage(driver);
		logger.info("-----Click for Enterprise-----");
		h.clickEnterprise();
		logger.info("-----Click product-----");
		h.clkprd();
	}
	
	@Test(priority=2)
	public void navigateToForCampus() {
		CourseraForCampusPage fc=new CourseraForCampusPage(driver);
		logger.info("-----Click Course for Campus-----");
		fc.clckCrsForCampus();
	}
	
	@Test(priority=3)
	public void submitForm() throws InterruptedException, IOException {
		CourseraForCampusPage fc=new CourseraForCampusPage(driver);
		logger.info("-----Fill the form-----");
		fc.form();
	}
}
