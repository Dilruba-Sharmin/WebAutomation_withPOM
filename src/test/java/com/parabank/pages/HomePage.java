package com.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean hasLogoutLink(){
        return getWebElements(By.cssSelector("a[href='logout.htm']")).size()>0;
    }

    public OpenNewAccountPage clickOpenAccountLink(){
        waitForElement(By.cssSelector("a[href='openaccount.htm']"));
        getWebElement(By.cssSelector("a[href='openaccount.htm']")).click();
        return getInstance(OpenNewAccountPage.class);

    }

    public TransferFundsPage clickTransferFundsLink(){
        waitForElement(By.cssSelector("a[href='transfer.htm']"));
        getWebElement(By.cssSelector("a[href='transfer.htm']")).click();
        return getInstance(TransferFundsPage.class);
    }

    public BillPayPage clickBillPayLink(){
        waitForElement(By.cssSelector("a[href='billpay.htm']"));
        getWebElement(By.cssSelector("a[href='billpay.htm']")).click();
        return getInstance(BillPayPage.class);

    }
}
