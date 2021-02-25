package com.test.ui;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import static Data.TestData.*;

public class LoginTest extends SetTheBrowser {

    @BeforeClass
        public void beforeClass(){
            openBrowser();
    }
    @Test//(groups = {"LoginTest.loginTest"}) --- tried to make one test depended on another? but not this time(((
        public void loginTest(){
            LoginPage loginPg = PageFactory.initElements(driver, LoginPage.class);
            loginPg.signInPage();
            loginPg.Login_Action(USER_EMAIL, USER_PASS);
            Assert.assertEquals(driver.getTitle(), "My account - My Store");
    }

    @AfterClass
        public void quit(){
            driver.quit();
    }
}
