package stepdefinition;

import cucumber.api.java.en.Given;

public class TagsStepDefinitionDemo {
	
	@Given("^executing scenario_one$")
	public void executing_scenario_one() throws Throwable {
	    System.out.println("Scenario 1 executed");
	}
	
	@Given("^executing scenario_two$")
	public void executing_scenario_two() throws Throwable {
		System.out.println("Scenario 2 executed");
	}
	@Given("^executing scenario_three$")
	public void executing_scenario_three() throws Throwable {
		System.out.println("Scenario 3 executed");
	}

	@Given("^executing scenario_four$")
	public void executing_scenario_four() throws Throwable {
		System.out.println("Scenario 4 executed");
	}

	@Given("^executing scenario_five$")
	public void executing_scenario_five() throws Throwable {
		System.out.println("Scenario 5 executed");
	}

}
