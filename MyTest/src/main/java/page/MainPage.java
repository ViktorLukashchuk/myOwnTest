package page;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;

import static Data.DataTest.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    @Step
    public MainPage signIn(String mail, String pass){
        $x("//a[@title=\"Log in to your customer account\"]").click();
        $x("//input[@id=\"email\"]").sendKeys(mail);
        $x("//input[@id=\"passwd\"]").sendKeys(pass);;
        $x("//button[@id=\"SubmitLogin\"]").click();
        return this;
    }

    @Step
    public MainPage dressPage(){
        $x("//a[@class = \"product-name\" and @title = \"" + EXACT_NAME_DRESS + "\"]").click();
        return this;
    }
    @Step
    public Boolean dressValidation(){
        return (
                $("h1").shouldHave(text(EXACT_NAME_DRESS)).exists()
                    & $("#our_price_display").shouldHave(text(EXACT_PRICE)).exists()
                        & $x("//input[@id=\"quantity_wanted\"]").exists()
                            & $x("//select[@id=\"group_1\"]").exists()
                                & $x("//button[@type=\"submit\" and @name=\"Submit\"]").exists());
        }


}
