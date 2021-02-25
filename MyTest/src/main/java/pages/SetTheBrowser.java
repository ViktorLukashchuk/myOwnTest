package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTheBrowser {
        public WebDriver driver;

        public void openBrowser(){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/");
            driver.manage().window().maximize();
        }
}
