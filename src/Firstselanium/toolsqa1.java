package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqa1 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
WebDriver need=new ChromeDriver();
need.get("https://www.toolsqa.com");
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='HOME']")).click();
Thread.sleep(3000);
//need.navigate().back();
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='Tutorial']")).click();
Thread.sleep(2000);
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='Selenium Training']")).click();
Thread.sleep(1000);
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='VIDEOS']")).click();
Thread.sleep(500);
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='Blogs']")).click();
Thread.sleep(400);
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='DEMO SITES']")).click();
Thread.sleep(300);
need.findElement(By.xpath("//nav[@class='navigation']//span[text()='ABOUT']")).click();
Thread.sleep(100);
need.close();
//div[@style="visibility: visible; opacity: 1;"]







	}}
