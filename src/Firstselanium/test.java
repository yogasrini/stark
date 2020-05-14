package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:/my wok/Selanium/test/chromedriver.exe");
		WebDriver Firstselanium=new ChromeDriver();
		Firstselanium.get("https://www.google.com");
		String yes= Firstselanium.getTitle();
		System.out.println(yes);
		Thread.sleep(5000);
		Firstselanium.findElement(By.xpath("//img[@alt='To all coronavirus helpers, thank you']")).click();
		Firstselanium.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("java");

	}

}
