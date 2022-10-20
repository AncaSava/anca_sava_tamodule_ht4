package org.example.stepdefinitions;

import io.cucumber.java.Before;
import org.example.factory.WebDriverFactory;
import org.example.pageobject.pages.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class BaseSteps {
    public static  final Map<String, BasePage> PAGE_STORAGE = new HashMap<>();
    public static WebDriver driver;
    @Before
    public  void initWebDriver(){
        driver = new WebDriverFactory().getWebDriver();
    }
//    @After
//    public void afterScenario(){
//        webDriver.quit();
//    }
}
