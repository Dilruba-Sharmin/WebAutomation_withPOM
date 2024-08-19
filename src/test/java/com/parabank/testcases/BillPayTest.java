package com.parabank.testcases;

import com.parabank.pages.BillPayPage;
import com.parabank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillPayTest extends BaseTest{

    @Test
    public void billPayShouldSucceed(){
        BillPayPage billPayPage=page.getInstance(LoginPage.class)
                .doLogin(getUsername(),getPassword())
                .clickBillPayLink();

        Assert.assertTrue(billPayPage.hasDoneBillPayment());

    }
}
