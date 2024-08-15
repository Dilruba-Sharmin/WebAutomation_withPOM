package com.parabank.testcases;

import com.parabank.pages.BasePage;
import com.parabank.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    Page page;

    @BeforeMethod
    
    public void setUpBrowser(){
        driver=new FirefoxDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();

        page= new BasePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
