package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.pageobject.pages.HomePage;

import static org.example.stepdefinitions.BaseSteps.driver;

public class HomePageSteps {
    HomePage homePage = new HomePage(driver);
    @Given("Amazon Home Page is opened")
    public void amazonHomePageIsOpened() {
        homePage.openAmazonHomePageAndJustGoToTopBar();
    }
}
