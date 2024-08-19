package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage extends BasePage{
    public BillPayPage(WebDriver driver) {
        super(driver);
    }

    public BillPayPage enterPayeeName(String payeeName){
        getWebElement(By.cssSelector("input[name='payee.name'] ")).sendKeys(payeeName);
        return this;

    }
    public BillPayPage clickSendPayment(){
        getWebElement(By.cssSelector("input[value='Send Payment']"));
        return this;
    }

    public boolean hasDoneBillPayment(){
        return getWebElements(By.cssSelector("div[id='billpayResult'] h1[class='title']")).size()>0;
    }
}
