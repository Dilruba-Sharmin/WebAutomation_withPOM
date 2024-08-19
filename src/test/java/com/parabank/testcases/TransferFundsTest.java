package com.parabank.testcases;

import com.parabank.pages.LoginPage;
import com.parabank.pages.OpenNewAccountPage;
import com.parabank.pages.TransferFundsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest{
    @Test(enabled = false)
    public void transferFundsShouldSucceed(){
        TransferFundsPage fundsPage=page.getInstance(LoginPage.class)
                .doLogin(getUsername(),getUsername())
                .clickTransferFundsLink();
        Assert.assertTrue(fundsPage.hasCompleteTransfer());

    }

    @Test        // testcase template=2
    public void transferFundsShouldSucceed2(){
        TransferFundsPage fundsPage=page.getInstance(LoginPage.class)
                .doLogin(getUsername(),getPassword())
                .clickTransferFundsLink()
                .enterAmount(getAmount())
                .selectFromAccount(0)
                .selectToAccount(0)
                .clickTransferBtn();
        Assert.assertTrue(fundsPage.hasCompleteTransfer());



    }

}
