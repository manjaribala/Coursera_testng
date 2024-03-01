package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.CourseraPage;
import pageObject.LanguageLearningPage;
import testBase.BaseClass;

public class TC_002_LanguageLearning extends BaseClass{
	
	@Test(priority=1,groups={"sanity","regression"})
	public void navigatingToLanguageLearning() throws InterruptedException, IOException {
		CourseraPage h = new CourseraPage(driver);
		h.clear();
		logger.info("-----Search for Language Learning-----");
		h.languageLearning();
	}
	@Test(priority=2,groups= {"regression"})
	public void prntTotalLang() throws InterruptedException {
		LanguageLearningPage ll=new LanguageLearningPage(driver);
		logger.info("-----Display Language List-----");
		Thread.sleep(3000);
		ll.languagesList();
	}
	@Test(priority=3,groups= {"regression"})
	public void prntTotalLevels() {
		LanguageLearningPage ll=new LanguageLearningPage(driver);
		logger.info("-----Display Level List-----");
		ll.levelList();
	}	

}
