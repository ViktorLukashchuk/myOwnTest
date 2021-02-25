package com.test.ui;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.*;


import static Data.TestData.*;


public class SearchTest extends SetTheBrowser {
    @BeforeClass
    public void beforeClass(){

        openBrowser();
    }

    @Test//(dependsOnGroups = {"LoginTest.loginTest"})--- tried to make one test depended on another? but not this time(((
    public void searchTest(){
        LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
        loginPg.signInPage();
        loginPg.Login_Action(USER_EMAIL, USER_PASS);
        SearchPage srchPg = PageFactory.initElements(driver, SearchPage.class);
        srchPg.searchAction(KEY);
        Assert.assertTrue(srchPg.isMatch(KEY));
    }

    @AfterClass
    public void quit(){
        driver.quit();
    }
}
