package com.pagesactions.pages;

import com.web.WebDriverFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomePage {

    @Autowired
    WebDriverFactory webDriverFactory;

    public void login(){
        webDriverFactory.getWebDriver().get("https://www.onlinesbi.com/");
    }

}
