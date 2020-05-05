package subjective;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit {
	public static void main(String[] args) throws InterruptedException {
		// open firefox
		WebDriver driver = new ChromeDriver();
		// open google.com
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[@class='alert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30 /* timeout in seconds */);
		// throws TimeoutException if no alert is present
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}
}