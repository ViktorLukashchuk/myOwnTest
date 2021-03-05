package SelenideTest;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

public class TestDress extends BaseTest{

    @Test
    @Description("Validation of correctness of chosen dress")
    public void dressPage(){
        MainPage pg = new MainPage().dressPage();
        Assert.assertTrue(pg.dressValidation());
    }
}
