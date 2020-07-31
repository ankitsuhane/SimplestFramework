package com.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.pagesactions.pages.HomePage;
import com.pagesactions.pages.TestOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import com.web.WebDriverFactory;

import cucumber.api.java8.En;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class TestStepDefinition implements En {

	@Lazy
	@Autowired
	HomePage homePage;

	@Lazy
	@Autowired
	TestOnly testOnly;

	public TestStepDefinition() {
		
		Given("I want to click onlinesbi link", () -> {
			homePage.login();
			assertEquals(0, 0);
		});

		When("do nothing", () -> {
			testOnly.loginClick();
			assertEquals(0, 0);
		});

		Then("do nothings", () -> {
			assertEquals(0, 0);
		});
	}
}
