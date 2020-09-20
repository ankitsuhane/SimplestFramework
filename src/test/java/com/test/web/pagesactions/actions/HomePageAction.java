package com.test.web.pagesactions.actions;

import com.test.web.pagesactions.pages.HomePage;
import com.test.web.BaseWebAction;
import com.test.web.WebDriverFactory;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.junit.Assert.*;

@Lazy
@Component
@Scope("cucumber-glue")
public class HomePageAction extends BaseWebAction {

    @Lazy
    @Autowired
    HomePage homePage;

    @Value("${webui}")
    private String webUI;

     public void login(){

         webDriverFactory.getWebDriver().get(webUI);
         PageFactory.initElements(webDriverFactory.getWebDriver(), homePage);

         homePage.login.click();
    }
}
