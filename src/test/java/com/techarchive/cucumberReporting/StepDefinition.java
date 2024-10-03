package com.techarchive.cucumberReporting;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;


public class StepDefinition {
	 //System.setProperty("webdriver.chrome.driver", "C:/Users/sandeep.s8/IdeaProjects/test/chromedriver.exe");
	PageObjects obj = new PageObjects();

	@Given("I am at some place")
	public void i_am_at_some_place() {

     System.out.println("This is Given");
	}

	@When("I do some action")
	public void i_do_some_action() {
		System.out.println("This is When");
	}

	@Then("Open Url")
	public void open_url() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://selenium.dev");
		String var;
		var = driver.getTitle();

		 	assertEquals(var, "Selenium");

		driver.quit();
		//driver.get("http://www.google.com");
		System.out.println("Tested");
	}


}
