package subjective;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicit
{
	public static void main(String[] args) throws InterruptedException
	{System.setProperty("webdriver.chrome.driver", "src/main/java/driver/chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies(); 
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
}}