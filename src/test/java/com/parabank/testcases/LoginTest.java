package com.parabank.testcases;

import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void doLoginWithUsernameShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage=loginPage
                .fillUsername("abddff")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());

    }
    @Test
    public void doLoginWithPasswordShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage=loginPage
                .fillPassword("ab4552a")
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());

    }

    @Test
    public void doLoginShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage=loginPage
                .clickLoginLinkBtn();
        Assert.assertTrue(loginPage.hasError());

    }

    @Test
    public void doLoginShouldSucceed(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        HomePage overviewPage=loginPage
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overviewPage.hasLogoutLink());

    }
    @Test
    public void checkTitle(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);
    }



}


