package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		 WebDriver zon = new ChromeDriver();
		 zon.get("https://www.flipkart.com/");
		 zon.manage().window().maximize();
		 zon.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	}

}
