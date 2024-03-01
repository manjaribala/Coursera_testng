package stepDefinitions;
import org.openqa.selenium.WebDriver;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.CourseraPage;
import pageObject.WebDevelopmentPage;

public class Step1_WebDevelopPage {
    static WebDriver driver;
	CourseraPage h;
	WebDevelopmentPage wd;
	
    @Given("the user is on the homepage of the Coursera website")
    public void the_user_is_on_the_homepage_of_the_Coursera_website() {
        driver = BaseClass.getDriver();
        BaseClass.getLogger().info("----Launching Coursera website-----");
		 h = new CourseraPage(BaseClass.getDriver());
		 wd= new WebDevelopmentPage(BaseClass.getDriver());
    }

    @When("the user searches for web development courses")
    public void the_user_searches_for_web_development_courses() throws Exception {
        BaseClass.getLogger().info("------Search for web development courses------");
		 h.webDevelopment();   	
    }

    @When("the user filters the courses for English language")
    public void the_user_filters_the_courses_for_english_language() {
        BaseClass.getLogger().info("----Filter the course by English Language----");
        wd.filterByLang();    }

    @When("the user filters the courses for beginners level")
    public void the_user_filters_the_courses_for_beginners_level() {
        BaseClass.getLogger().info("----Filter the course by Beginners Level----");
		wd.filterByLevel();

    }

    @When("the user selects the first course displayed to take its title, rating, and duration")
    public void the_user_selects_the_first_course_displayed_to_take_its_title_rating_and_duration() {
        BaseClass.getLogger().info("Course One Details are displayed");
    	wd.courseOne();
		wd.courseOneDetails();
    }

    @When("the user selects the second course displayed to take its title, rating, and duration")
    public void the_user_selects_the_second_course_displayed_to_take_its_title_rating_and_duration() {
        BaseClass.getLogger().info("Course Two Details are displayed");
    	wd.courseTwo();
		wd.courseTwoDetails();  
    }

 
    
   
}