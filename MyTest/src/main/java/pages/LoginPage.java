package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    //Locating Sign-in button
    @FindBy(xpath = "//div[@class=\"header_user_info\"]/a[@class=\"login\"]")
        WebElement signIn;

    //Locating the username text box
    @FindBy(xpath = "//div[@class=\"form-group\"]/input[@id=\"email\"]")
        WebElement username;

    //Locating the password text box
    @FindBy(xpath = "//div[@class=\"form-group\"]//input[@id=\"passwd\"]")

        WebElement pswd;

    //Locating Login Button
    @FindBy(xpath="//button[@type=\"submit\" and @id=\"SubmitLogin\"]")
        WebElement loginBtn;

    //Reaching Sign in page
    public void signInPage(){

        signIn.click();
    }

    //Method that performs login action using the web elements
    public void Login_Action(String uName, String pwd){
        username.sendKeys(uName);
        pswd.sendKeys(pwd);
        loginBtn.click();
    }
}
