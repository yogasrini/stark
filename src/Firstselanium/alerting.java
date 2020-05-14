package Firstselanium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		 WebDriver tools = new ChromeDriver();
		 tools.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		 tools.manage().window().maximize();
		 Thread.sleep(2000);
		 tools.findElement(By.id("cookie_action_close_header"));
		 tools.switchTo().alert().accept();
         Thread.sleep(1000);
         tools.findElement(By.xpath("//button[text()='Simple Alert']")).click();
         //tools.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();
		 tools.switchTo().alert().accept();

		 
	//List<WebElement> simple=tools.findElements(By.xpath("//button[text()='Simple Alert']"));
//tools.switchTo().alert().accept();
	}

}
