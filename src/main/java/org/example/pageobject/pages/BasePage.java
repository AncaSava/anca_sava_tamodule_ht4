package org.example.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    protected BasePage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
