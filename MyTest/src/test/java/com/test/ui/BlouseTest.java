package com.test.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.*;
import static Data.TestData.*;

public class BlouseTest extends SetTheBrowser{
    @BeforeClass
    public void beforeClass(){
        openBrowser();
    }
    @Test()
    public void blouseTest(){

        SearchPage srchPg = PageFactory.initElements(driver, SearchPage.class);
        srchPg.searchAction(KEY);
        DressPage drsPg = PageFactory.initElements(driver, DressPage.class);
        drsPg.dressPage(EXACT_NAME);
        BlousePage blsPg = PageFactory.initElements(driver, BlousePage.class);
        blsPg.quantityChoose(QUANTITY);
        blsPg.sizeChoose(SIZE);
        blsPg.addingToCart();
        blsPg.proceedToCheckout();
        Assert.assertEquals(driver.getTitle(), "Order - My Store");
        Assert.assertTrue(blsPg.IsAddedMatchedSearched(EXACT_NAME));
    }


    @AfterClass
    public void quit(){
        driver.quit();
    }
}
