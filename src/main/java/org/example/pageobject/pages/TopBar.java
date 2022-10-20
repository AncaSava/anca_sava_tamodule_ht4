package org.example.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.example.amazon_page_object.SearchResultsPage;
public class TopBar extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBar;

    public TopBar(WebDriver driver) {
        super(driver);
    }
    public TopBar open() {
        driver.get("https://www.amazon.com/");
        return this;
    }

    public SearchResultsPage searchMethod(String searchedElement) {
        searchBar.sendKeys(searchedElement);
        searchBar.submit();
        return new SearchResultsPage(driver);

    }

}
