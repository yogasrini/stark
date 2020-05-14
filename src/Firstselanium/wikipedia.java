package Firstselanium;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wikipedia {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
 WebDriver tools = new ChromeDriver();
 tools.get("https://en.wikipedia.org/wiki/Selenium_(software)");
 tools.findElement(By.xpath("//a[text()='Main page']")).click();
 Thread.sleep(5000);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[text()='Contents']")).click();
 Thread.sleep(4000);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[@title='Featured content – the best of Wikipedia']")).click();
 Thread.sleep(3000);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[@title='Find background information on current events']")).click();
 Thread.sleep(2000);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[text()='Random article']")).click();
 Thread.sleep(1000);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[text()='Donate to Wikipedia']")).click();
 Thread.sleep(500);
 tools.navigate().back();
 tools.findElement(By.xpath("//a[text()='Wikipedia store']")).click();
 Thread.sleep(100);
 tools.navigate().back();
















 


	}

}
