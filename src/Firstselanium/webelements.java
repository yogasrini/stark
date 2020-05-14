package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {

	public static void main(String[] args)throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement email=driver.findElement(By.name("email"));
email.sendKeys("yoga123@gmail.com");
WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("60578");
driver.findElement(By.xpath("//input[@value='Log In']")).click();
driver.findElement(By.xpath("//a[@href='https://www.facebook.com/recover/initiate/?ars=facebook_login']")).click();
Thread.sleep(3000);
//driver.navigate().back("https://www.google.com");
//driver.findElement(By.partialLinkText("ima")).click();
driver.navigate().to("https://www.facebook.com");
Boolean logo=driver.findElement(By.xpath("//i[@class='fb_logo img sp_RzghWIDSTU0 sx_1971c1']")).isDisplayed();
System.out.println(logo);
	}

}
