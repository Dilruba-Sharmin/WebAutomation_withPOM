package com.parabank.testcases;


import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.pages.RegisterPage;
import com.thedeanda.lorem.LoremIpsum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void registrationShouldFailWithData() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        RegisterPage registerPage = loginPage
                .clickRegistrationLink()
                .clickRegisterLink();
        Assert.assertTrue(registerPage.hasFirstNameRequiredFieldError());
        Assert.assertTrue(registerPage.hasError(10));
    }

    @Test
    public void registerShouldSucceed() {
        String username = LoremIpsum.getInstance().getName();
        HomePage homePage = page.getInstance(LoginPage.class)
                .clickRegistrationLink()
                .fillFirstName(LoremIpsum.getInstance().getFirstName())
                .fillLastName(LoremIpsum.getInstance().getLastName())
                .fillAddress(LoremIpsum.getInstance().getTitle(3))
                .fillCity(LoremIpsum.getInstance().getCity())
                .fillState(LoremIpsum.getInstance().getCity())
                .fillZipCode(LoremIpsum.getInstance().getZipCode())
                .fillPhone(LoremIpsum.getInstance().getPhone())
                .fillSsn("522-83-1308")
                .fillUsername(username)
                .fillPassword(username)
                .fillConfirmPassword(username)
                .clickRegisterBtn();
        Assert.assertTrue(homePage.hasLogoutLink());
    }

}
