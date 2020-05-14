package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
	 WebDriver tools = new ChromeDriver();
	 tools.get("https://book.spicejet.com/default.aspx");
	 tools.manage().window().maximize();
	 Thread.sleep(2000);
	 tools.findElement(By.className("ui-datepicker-trigger")).click();
	 Thread.sleep(2000);
	
	 


	}

}
