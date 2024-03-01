package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {".//FeatureFiles"},
//    features = {".//FeatureFiles/langLearnPage.feature"},

    glue = "stepDefinitions",
    plugin= {"pretty", "html:reports/myreport.html", 
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    },
	dryRun=false,
	monochrome=true,    // to avoid junk characters in output
	publish=true   // to publish report in cucumber server
			
  //tags="@sanity"  // this will execute scenarios tagged with @sanity
  //tags="@regression"
  //tags="@sanity or @regression" //Scenarios tagged with both @sanity and @regression
  //tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
  //tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
//	tags="@not sanity and not @regression"
    
)
public class TestRun {
}