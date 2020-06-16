package runnerfile;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@Test
	@CucumberOptions(features="./src/test/java/featurefiles",glue= {"stepdefinition"},dryRun=false)
	public class Runner extends AbstractTestNGCucumberTests {
		

}
