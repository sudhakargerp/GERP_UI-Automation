package runner;

import StepDefntn.HooksImplemetation;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import mar22.week5.day9.TestNG.BaseClass;

@CucumberOptions(features = {"src/test/java/features"},
				 glue = "StepDefntn",
				 monochrome = true,
				 publish = true)
public class CucumberRunner extends HooksImplemetation{

	
}
