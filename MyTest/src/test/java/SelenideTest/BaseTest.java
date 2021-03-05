package SelenideTest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class BaseTest {

    private static final String URL = "http://automationpractice.com/";

    @BeforeTest
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = 4000;
        Configuration.pageLoadTimeout = 20000;
    }

    @BeforeMethod
    public void startDriver(){
        Selenide.open(URL);
    }

    @AfterTest
    public void closeDriver(){
        Selenide.closeWebDriver();
    }
}
