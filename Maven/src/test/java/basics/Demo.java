package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws InterruptedException {
//It is used to open the browser
	 WebDriver driver = new ChromeDriver();Thread.sleep(500);
//It is used to maximize the browser
	 driver.manage().window().maximize();
	 
//get(String url) is used to trigger the URL of an application
	 driver.get("https://www.qspiders.com");
	 driver.navigate().to("https://www.jspiders.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
//getTitle() is used to get the title of the webpage
	String title = driver.getTitle();
	System.out.println(title);
	//getCurrentUrl() is used to get the URL of the webpage
	String url = driver.getCurrentUrl();
	System.out.println(url);Thread.sleep(500);
//	driver.close();
	driver.quit();
}
}
