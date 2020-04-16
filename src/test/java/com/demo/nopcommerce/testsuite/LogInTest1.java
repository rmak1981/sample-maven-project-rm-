package com.demo.nopcommerce.testsuite;

import com.demo.nopcommerce.loadproperty.LoadProperty;
import com.demo.nopcommerce.pages.HomePage;
import com.demo.nopcommerce.pages.LogInPage;
import com.demo.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest1 extends TestBase {

    HomePage homePage = new HomePage();
    LogInPage loginPage = new LogInPage();
    LoadProperty loadProperty = new LoadProperty();
//    String username = loadProperty.getProperty("username");
//    String password = loadProperty.getProperty("password");

    @Test
    public void verifyUserShouldNavigateToLoginPage1(){

        homePage.clickOnLoginLink();
        String expectedText = "Welcome, Please Sign Inn!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
//    @Test
//    public void doLoginToApplication(){
//        loginPage.loginToApplication(loadProperty.getProperty("abc@gmail.com"),loadProperty.getProperty("abc123"));
//    }

}

