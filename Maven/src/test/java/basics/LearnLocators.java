package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LearnLocators {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();Thread.sleep(500);
	driver.manage().window().maximize();Thread.sleep(500);
	driver.get("https://fb.com/");Thread.sleep(500);
	WebElement login = driver.findElement(By.name("login"));
	login.click();Thread.sleep(500);
	WebElement tbx = driver.findElement(By.name("email"));Thread.sleep(500);
	tbx.sendKeys("Virat@18");
	
}
}
