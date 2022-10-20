package org.example.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  org.example.amazon_page_object.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.example.stepdefinitions.BaseSteps.PAGE_STORAGE;
import static org.example.stepdefinitions.BaseSteps.driver;

public class SearchResultsSteps {
    List<WebElement> searchResults;
    @When("user clicks on sonyOption on {string}")
    public void userClicksOnSonyOptionOn(String pageName) {
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        searchResults  = searchResultsPage.clickOnSony().returnSearchResultsForSony();
        PAGE_STORAGE.put("Search Results Page", searchResultsPage);
    }

    @Then("User is provided with a list of results in the {string};")
    public void userIsProvidedWithAListOfTheElementsInThe(String pageName) {
        List<WebElement> verifySearchResults = searchResults
                .stream()
                .filter(x -> x.getText().toLowerCase().contains("sony") & x.getText().contains("Headphones"))
                .toList();
        Assert.assertEquals(searchResults.size(), verifySearchResults.size());
    }
}
