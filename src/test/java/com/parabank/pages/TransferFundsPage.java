package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage extends BasePage{
    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }
    public TransferFundsPage enterAmount(String amount){
        getWebElement(By.cssSelector("#amount ")).sendKeys(amount);
        return this;

    }

    public TransferFundsPage selectFromAccount(int index) {
        new Select(getWebElement(By.id("fromAccountId"))).selectByIndex(index);;
        return this;
    }

    public TransferFundsPage selectToAccount(int index) {
        new Select(getWebElement(By.id("toAccountId"))).selectByIndex(index);;
        return this;
    }

        public TransferFundsPage clickTransferBtn(){
        getWebElement(By.cssSelector("input[value='Transfer']"));
        return this;

    }

    public boolean hasCompleteTransfer(){
         return getWebElements(By.cssSelector("div[id='showResult'] h1[class='title']")).size()>0;
    }
}
