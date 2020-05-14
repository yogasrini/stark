package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class azon {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		 WebDriver zon = new ChromeDriver();
		 zon.get("https://www.amazon.com/");
		 zon.manage().window().maximize();
		 Thread.sleep(3000);
		 String kart = zon.getWindowHandle();
		 zon.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		 
	

	}

}
