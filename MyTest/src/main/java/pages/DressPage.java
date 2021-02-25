package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Data.TestData.*;
import java.util.List;

public class DressPage {
    WebDriver driver;
    public DressPage(WebDriver driver){
        this.driver=driver;
    }
    //storing all result of search in a list
    @FindBy(xpath = "//h5/a[@class=\"product-name\"]")
        List<WebElement> result;

    //getting price of current dress
    @FindBy(xpath = "//p[@class=\"our_price_display\"]/span[@id=\"our_price_display\"]")
        WebElement currentPrice;

    public void dressPage(String nedeedDress){
        WebElement dress = result.stream().filter(element -> element.getText().contains(nedeedDress)).findAny().orElseThrow();
        dress.click();
    }

    public Boolean isPriceMatch(String priceSet){
        return currentPrice.getText().equals(priceSet);
    }
}
