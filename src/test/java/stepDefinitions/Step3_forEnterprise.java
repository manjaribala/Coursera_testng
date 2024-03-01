package stepDefinitions;

import java.io.IOException;
import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CourseraForCampusPage;
import pageObject.CourseraPage;

public class Step3_forEnterprise {
	CourseraPage h;
	CourseraForCampusPage fc;

	@Given("the user nagivate to Coursera page")
	public void the_user_nagivate_to_coursera_page() {
        BaseClass.getLogger().info("-----Navigating to Cousera Homepage-----");
	}

	@When("the user navigates to the Enterprise section")
	public void the_user_navigates_to_the_enterprise_section() {
		 h = new CourseraPage(BaseClass.getDriver());
	    BaseClass.getLogger().info("-----Click ForEnterprise section-----");
		h.clickEnterprise();
		h.clkprd();
	}

	@When("the user goes to Courses for Campus under Product")
	public void the_user_goes_to_courses_for_campus_under_product() {
		fc=new CourseraForCampusPage(BaseClass.getDriver());
		fc.clckCrsForCampus();
	}

	@When("the user fills the Form with invalid email")
	public void the_user_fills_the_form_with_invalid_email() throws Exception, IOException {
        BaseClass.getLogger().info("-----Fill the details in the form-----");
		fc.form();
	}

	@Then("the user should capture and display the error message")
	public void the_user_should_capture_and_display_the_error_message() {
        BaseClass.getLogger().info("-----Error message should be displayed-----");


	}

}
