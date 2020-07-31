package com.pagesactions.pages;

import com.web.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class TestOnly {

    @Autowired
    WebDriverFactory webDriverFactory;

    public void loginClick(){
        System.out.println("WEbdriver"+webDriverFactory.getWebDriver());
        webDriverFactory.getWebDriver().getTitle();
        WebElement login =webDriverFactory.getWebDriver().findElement(By.cssSelector(".login-new > .classicTxt"));
        login.click();
    }

}
