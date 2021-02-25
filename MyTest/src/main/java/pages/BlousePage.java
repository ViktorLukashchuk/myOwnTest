package pages;

import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Data.TestData.*;
        import java.util.List;

public class BlousePage {
    WebDriver driver;
    public BlousePage(WebDriver driver){
        this.driver=driver;
    }

    //locating quantity field
    @FindBy(xpath = "//input[@id=\"quantity_wanted\"]")
        WebElement quantity;

    //locating size dropdown
    @FindBy(xpath = "//select[@id=\"group_1\"]")
        WebElement size;

    //locating add to cart button
    @FindBy(xpath = "//button[@name=\"Submit\" and @class=\"exclusive\"]")
        WebElement addToCart;

    //locating procced
    @FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]/span/i")
        WebElement proceed;

    @FindBy(xpath = "//td/p[@class=\"product-name\"]")
        WebElement productName;

    public void quantityChoose(String quantityOfItems){
        quantity.clear();
        quantity.sendKeys(quantityOfItems);
    }

    public void sizeChoose(String desiredSize){
        Select selection = new Select(size);
        selection.selectByVisibleText(desiredSize);
    }

    public void addingToCart(){
        addToCart.click();
    }

    public void proceedToCheckout(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement proceed1 = wait.until(ExpectedConditions.elementToBeClickable(proceed));
        proceed1.click();
    }

    public Boolean IsAddedMatchedSearched(String search) {
        return productName.getText().equals(search);
    }
}
