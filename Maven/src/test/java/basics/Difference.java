package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Difference {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.qspiders.com");
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		 WebDriverWait wait=new WebDriverWait(driver,5);
//		 wait.until(ExpectedConditions.titleIs(""));
//		 driver.manage().window().minimize();
//		 Actions a=new Actions(driver);
//		 a.scrollByAmount(0, 0).perform();
//		 WebElement e;
//		 e.getShadowRoot();
		 
}
}
