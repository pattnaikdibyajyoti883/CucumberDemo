package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void setUp()
	{
		System.out.println("Executed before scenario");
	}
	@After
	public void tearDown()
	{
		System.out.println("Executed after scenario");
	}
	@Before("@smoketest")
	public void smokesetUp()
	{
		System.out.println("Executed before smoke scenario");
	}
	@After("@smoketest")
	public void smoketearDown()
	{
		System.out.println("Executed after smoke scenario");
	}
}
