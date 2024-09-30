package com.techarchive.cucumberReporting;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	@Given("I am at some place")
	public void i_am_at_some_place() {

     System.out.println("This is Given");
	}

	@When("I do some action")
	public void i_do_some_action() {
		System.out.println("This is When");
	}

	@Then("Something happens")
	public void something_happens() {
		System.out.println("This is Then");
	}


}
