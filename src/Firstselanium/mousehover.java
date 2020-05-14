package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.thehindu.com/");
 Thread.sleep(1000);
 driver.manage().window().maximize();
 Thread.sleep(1000);
 Actions action=new Actions(driver);
 WebElement parentitem=driver.findElement(By.className("dropdown-toggle"));
 action.moveToElement(parentitem);
 WebElement childitem=driver.findElement(By.className("//a[@content='Economy']"));
 action.moveToElement(childitem);
 action.click().build().perform();
 
 
 

	}

}
