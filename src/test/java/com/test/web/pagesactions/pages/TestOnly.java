package com.test.web.pagesactions.pages;

import com.test.web.WebDriverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class TestOnly {

    @Autowired
    WebDriverFactory webDriverFactory;

    public void loginClick(){

        System.out.println("Webdriver in loginClick: "+webDriverFactory.getWebDriver());
    }

}
