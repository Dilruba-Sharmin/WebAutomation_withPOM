package com.parabank.testcases;

import com.parabank.pages.HomePage;
import com.parabank.pages.LoginPage;
import com.parabank.pages.OpenNewAccountPage;
import com.parabank.util.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BaseTest{

 @Test (enabled = false)  // testcase template=1
    public void openAccountShouldSucceed(){
     LoginPage loginPage=page.getInstance(LoginPage.class);
     Assert.assertEquals(loginPage.getPageTitle(), General.LOGIN_TITTLE);

     HomePage homePage=loginPage
             .doLogin(getUsername(),getPassword());
     Assert.assertTrue(homePage.hasLogoutLink());

     OpenNewAccountPage openNewAccountPage=homePage
                           .clickOpenAccountLink()
                           .selectAccountType(1)
                           .selectAccountNumber(0)
                       .clickNewAccountBtn();
     Assert.assertTrue(openNewAccountPage.hasAccountId());



 }

 @Test (enabled = false)       // testcase template=2,LoginViaRegistration
 public void openAccountShouldSucceed2(){
  OpenNewAccountPage newAccountPage=page.getInstance(LoginPage.class)
          .doLoginViaRegistration()
           .clickOpenAccountLink()
          .selectAccountType(1)
          .selectAccountNumber(0)
          .clickNewAccountBtn();
  Assert.assertTrue(newAccountPage.hasAccountId());



 }

 @Test(priority = 0)       // testcase template=3
 public void openAccountShouldSucceed3(){
  OpenNewAccountPage newAccountPage=page.getInstance(LoginPage.class)
          .doLogin(getUsername(),getPassword())
          .clickOpenAccountLink()
          .clickNewAccountBtn();
  Assert.assertTrue(newAccountPage.hasAccountId());



 }

}
