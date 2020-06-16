package runnerfile;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@Test
	@CucumberOptions(features="./src/test/java/featurefiles/LoginFeature3.feature",glue= {"stepdefinition"},dryRun=false,
	/*tags = {"@smoketest","@End2End"})*///=>works as AND operator
	tags = {"@smoketest,@End2End"})//=>works as OR operator
	public class Runner3 extends AbstractTestNGCucumberTests {
		

}
