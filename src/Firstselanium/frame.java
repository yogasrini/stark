package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
 WebDriver stark = new ChromeDriver();
 stark.get("https://netbanking.hdfcbank.com/netbanking/");
 stark.manage().window().maximize();
 WebElement lanni=stark.findElement(By.xpath("//frame[@name='login_page']"));
stark.switchTo().frame(lanni);
stark.findElement(By.name("fldLoginUserId")).sendKeys("51000");
	}

}
