package com.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.WebDriverFactory;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.springframework.stereotype.Component;

public class Hooks {
	
    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    
    @Autowired
    WebDriverFactory webDriverFactory;
    
	@Before
	public void setup(){
		logger.info("Setting up Web Driver!");
		webDriverFactory.setUpWebDriver();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		logger.info("Tear down Web Driver!");
		
        if (scenario.isFailed()) {
            try {
                scenario.write("Current page title is: " + webDriverFactory.getWebDriver().getTitle());
                byte[] screenshot = ((TakesScreenshot) webDriverFactory.getWebDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "img/png");
            } catch (WebDriverException somePlatformsDontSupportScreenShots) {
                logger.error(somePlatformsDontSupportScreenShots.getMessage());
            }
        }
        webDriverFactory.getWebDriver().manage().deleteAllCookies();
        webDriverFactory.getWebDriver().close();
        webDriverFactory.getWebDriver().quit();
	}
}
