package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Exercise18 {

	@Given("Some random text for scenario 1")
	public void some_random_text_for_scenario_1() {
	    System.out.println("SCENARIO 1");
	}

	@Given("Some random text for scenario 2")
	public void some_random_text_for_scenario_2() {
		  System.out.println("SCENARIO 2");
	}

	@Given("Some random text for scenario 3")
	public void some_random_text_for_scenario_3() {
		  System.out.println("SCENARIO 3");
	}

	@Given("Some random text for scenario 4")
	public void some_random_text_for_scenario_4() {
		  System.out.println("SCENARIO 4");
	}
	
	@Then("print text")
	public void print_text() {
		  System.out.println("Ramdom text");
	}
	
}
