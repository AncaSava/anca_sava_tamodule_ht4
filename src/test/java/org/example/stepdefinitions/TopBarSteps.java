package org.example.stepdefinitions;

import io.cucumber.java.en.Given;
import org.example.pageobject.pages.TopBar;

import static org.example.stepdefinitions.BaseSteps.PAGE_STORAGE;
import static org.example.stepdefinitions.BaseSteps.driver;

public class TopBarSteps {
    TopBar navBar = new TopBar(driver);
    @Given("User  enters  headphones in the searchBar on {string}")
    public void userEntersHeadphonesInTheSearchBarOn(String pageName) {

        navBar.open().searchMethod("headphones");
      //  PAGE_STORAGE.put(pageName, navBar);
    }
}
