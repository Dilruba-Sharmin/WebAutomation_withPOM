package com.parabank.pages;

import com.aventstack.extentreports.Status;
import com.parabank.report.ReportTestManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page{
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle().trim();
    }

    @Override
    public WebElement getWebElement(By locator) {
        addInfo(locator.toString() + " Locator going to find");
        WebElement element=null;
        try {
            element=driver.findElement(locator);

        }catch (Exception e){
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElements(By locator) {
        addInfo(locator.toString() + " Locator going to find");
        List<WebElement> elements=null;
        try {
            elements=driver.findElements(locator);

        }catch (Exception e){
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }
        return elements;

    }

    @Override
    public void waitForElement(By locator) {
        try {

        }catch (Exception e){
            System.out.println(locator.toString() + " Select or Locator Not Found");
        }

    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }
}
