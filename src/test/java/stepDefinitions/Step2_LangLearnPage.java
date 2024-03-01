package stepDefinitions;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CourseraPage;
import pageObject.LanguageLearningPage;

public class Step2_LangLearnPage {
    CourseraPage h;
    LanguageLearningPage ll;



    @Given("the user is on the coursera page")
    public void the_user_is_on_the_coursera_page() throws InterruptedException {
    	h = new CourseraPage(BaseClass.getDriver());
        BaseClass.getLogger().info("----Clearing the Searchbox----");
		h.clear();

    }

    @When("the user searches for language learning courses")
    public void the_user_searches_for_language_learning_courses() throws Exception {
    	h = new CourseraPage(BaseClass.getDriver());
        BaseClass.getLogger().info("----User serach for langugae learning----");
		h.clear();
		h.languageLearning();
    }
	@When("they extract all available languages and their total counts")
	public void they_extract_all_available_languages_and_their_total_counts() throws Exception {
		
		ll=new LanguageLearningPage(BaseClass.getDriver());
		Thread.sleep(3000);
        BaseClass.getLogger().info("-----Extract all the Languages----");
		ll.languagesList();

	}

	@When("they extract all different levels and their total counts")
	public void they_extract_all_different_levels_and_their_total_counts() {
        BaseClass.getLogger().info("-----Extract all the Levels-----");
		ll.levelList();
	}
	@Then("they should display the extracted language and level information")
	public void they_should_display_the_extracted_language_and_level_information() {
        BaseClass.getLogger().info("-----Languages and Levels are Displayed------");

	}




}
