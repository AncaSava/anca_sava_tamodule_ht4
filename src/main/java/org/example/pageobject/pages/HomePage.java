package org.example.pageobject.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public void openAmazonHomePageAndJustGoToTopBar() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        new TopBar(driver);
    }
}
