package SelenideTest;

import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.MainPage;

import static Data.DataTest.*;

public class LogTest extends BaseTest{

    @Test
    public void logTest(){
        MainPage pg = new MainPage().signIn(USER_MAIL, USER_PASSW);
        Assert.assertTrue(Selenide.title().equals("My account - My Store"));
    }
}
