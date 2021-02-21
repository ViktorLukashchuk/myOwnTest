package com.test.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;


public class SiteTest {
    WebDriver driver;


    @BeforeClass
        public void setupDriver() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/");
            driver.manage().window().maximize();
    }
    @AfterClass
        public void tearDown() {
            driver.quit();
    }
    @Test
    @Description("Checking if we reached correct site")
        public void thisSite () {
            Assert.assertTrue(driver.getTitle().equals("My Store"));
            WebElement search = driver.findElement(By.cssSelector("#search_query_top")); //cssSelector used just as an example of different types of locators
            search.click();
            search.sendKeys("dress");
            search.submit();
    }
    @Test(dependsOnMethods = "thisSite")
    @Description("Checking if we found correct dress")
        public void thisDress () {

            List<WebElement> result = driver.findElements(By.xpath("//li[contains(@class, \"ajax_block_product\")]"));
            WebElement dress = result.stream().filter(element -> element.getText().contains("Blouse")).findAny().orElseThrow();
            Assert.assertTrue(dress.getText().contains("$27.00"));
            Assert.assertEquals(driver.getTitle(), "Search - My Store");
    }
    @Test(dependsOnMethods = "thisDress")
    @Description("Checking if we choose correct dress")
        public void blouse () {
            WebElement blouse = driver.findElement(By.linkText("Blouse")); //linkText used just as an example of different types of locators
            blouse.click();
            Assert.assertEquals(driver.getTitle(), "Blouse - My Store");
    }
    @Test(dependsOnMethods = "blouse")
    @Description("Checking if we added to cart correct dress")
        public void addToCart () {
            WebElement quantity = driver.findElement(By.xpath("//input[@id=\"quantity_wanted\"]"));
            quantity.clear();
            quantity.sendKeys("5");

            WebElement size = driver.findElement(By.xpath("//select[@id=\"group_1\"]"));
            Select selection = new Select(size);
            selection.selectByVisibleText("L");

            WebElement color = driver.findElement(By.xpath("//li/a[@id=\"color_11\"] "));
            color.click();

            WebElement addToCart = driver.findElement(By.xpath("//button[@name=\"Submit\" and @class=\"exclusive\"]"));
            addToCart.click();

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-default button button-medium\"]")));
            proceed.click();

            Assert.assertEquals(driver.getTitle(), "Order - My Store");
            WebElement check = driver.findElement(By.xpath("//td[@class= \"cart_description\"]/p/a"));
            Assert.assertEquals(check.getText(), "Blouse");
    }
}

