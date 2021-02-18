package opencsv;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		
		String email = "oyg51142@eoopy.com";
		String password = "Test12345!";
		
		WebElement search = driver.findElement(By.cssSelector("#search_query_top")); //cssSelector used just as an example of different types of locators
			search.click();
			search.sendKeys("dress");
			search.submit();
		
		WebElement dress = driver.findElement(By.linkText("Faded Short Sleeve T-shirts")); //linkText used just as an example of different types of locators
			dress.click();
			
		WebElement quantity = driver.findElement(By.xpath("//input[@id=\"quantity_wanted\"]"));
			quantity.clear();
			quantity.sendKeys("5");
		
		WebElement size = driver.findElement(By.xpath("//select[@id=\"group_1\"]"));
			Select selection = new Select(size);
			selection.selectByVisibleText("L");
			
		WebElement color = driver.findElement(By.xpath("//li/a[@id=\"color_14\"] "));
			color.click();	
			
		WebElement addToCart = driver.findElement(By.xpath("//button[@name=\"Submit\" and @class=\"exclusive\"]"));
			addToCart.click();
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement proceed = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class=\"btn btn-default button button-medium\"]")));
			proceed.click();
		
		WebElement proceedToCheckput = driver.findElement(By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]"));
			proceedToCheckput.click();
			
		WebElement emailInput = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			emailInput.sendKeys(email);
			
		WebElement passInput = driver.findElement(By.xpath("//input[@id=\"passwd\"]"));
			passInput.sendKeys(password);
			
		WebElement submit = driver.findElement(By.xpath("//button[@id=\"SubmitLogin\"]"));
			submit.click();
			
		driver.findElement(By.xpath("//textarea[@class=\"form-control\"]")).sendKeys("PLease call be before shipping");
		driver.findElement(By.xpath("//button[@type=\"submit\" and @name=\"processAddress\"]")).submit();
		
		WebElement check = driver.findElement(By.xpath("//input[@type=\"checkbox\" and @name=\"cgv\"]"));
			if(!check.isSelected()) {check.click();}
		
		driver.findElement(By.xpath("//button[@type=\"submit\" and @name=\"processCarrier\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"bankwire\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"button btn btn-default button-medium\"]")).click();
		
		driver.quit();
	}

}
