package runnerfile;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@Test
	@CucumberOptions(features="./src/test/java/featurefiles/LoginFeature1",glue= {"stepdefinition"},dryRun=false)
	public class Runner1 extends AbstractTestNGCucumberTests {
		

}