package com.test.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.test.web.pagesactions.actions.HomePageAction;
import com.test.web.pagesactions.pages.HomePage;
import com.test.web.pagesactions.pages.TestOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import cucumber.api.java8.En;


public class TestStepDefinition implements En {

	@Lazy
	@Autowired
	HomePageAction homePageAction;

	@Lazy
	@Autowired
	HomePage homePage;

	@Lazy
	@Autowired
	TestOnly testOnly;

	public TestStepDefinition() {
		
		Given("I want to click onlinesbi link", () -> {
			homePageAction.login();
		});

		When("do nothing", () -> {
			System.out.println("do nothing:" );
			testOnly.loginClick();
		});

		Then("do nothings", () -> {
			assertEquals(0, 0);

		});
	}
}
