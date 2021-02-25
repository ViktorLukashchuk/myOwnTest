package com.test.ui;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import static Data.TestData.*;

public class DressTest extends SetTheBrowser {
    @BeforeClass
    public void beforeClass(){
        openBrowser();
    }
    @Test()
    public void dressTest(){
        LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
        loginPg.signInPage();
        loginPg.Login_Action(USER_EMAIL, USER_PASS);
        SearchPage srchPg = PageFactory.initElements(driver, SearchPage.class);
        srchPg.searchAction(KEY);
        DressPage drsPg = PageFactory.initElements(driver, DressPage.class);
        drsPg.dressPage(EXACT_NAME);
        Assert.assertTrue(driver.getTitle().equals(EXACT_NAME + " - My Store"));
        Assert.assertTrue(drsPg.isPriceMatch(PRICE));
    }


    @AfterClass
    public void quit(){
        driver.quit();
    }
}
