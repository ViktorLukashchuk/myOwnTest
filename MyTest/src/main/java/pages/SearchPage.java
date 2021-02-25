package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Data.TestData.KEY;

public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){

        this.driver=driver;
    }
    //locating search field
    @FindBy(id = "search_query_top")
        WebElement searchField;

    //locating keyWord
    @FindBy(xpath = "//h1/span[@class=\"lighter\"]")
        WebElement keyWord;

    public void  searchAction(String keys){
            searchField.click();
            searchField.sendKeys(keys);
            searchField.submit();
    }


    public Boolean isMatch(String searchWord){

        return keyWord.getText().toLowerCase().equals("\"" + searchWord + "\"");
    }
}
