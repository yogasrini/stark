package Firstselanium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testt {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
WebDriver nxt=new ChromeDriver();
nxt.get("https://www.jquery-az.com/boots/demo.php?ex=4.0_2");
nxt.manage().window().maximize();
nxt.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
nxt.findElement(By.xpath("//h1[text()='Choose expertise']"));
Thread.sleep(2000);
nxt.findElement(By.xpath("//input[@value='PHP']")).click();
nxt.findElement(By.xpath("//input[@value='Java']")).click();
nxt.findElement(By.xpath("//input[@value='HTML']")).click();
nxt.findElement(By.xpath("//input[@value='CSS']")).click();
nxt.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=5.0_4");
nxt.findElement(By.xpath("//input[@type='email']")).sendKeys("yoga123");
nxt.findElement(By.xpath("//input[@value='No']")).click();

	}

}
