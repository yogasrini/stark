package Firstselanium;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown {
public static void main(String[] args){			
System.setProperty("webdriver.chrome.driver","D:/my wok/Selanium/test/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:\\facebook.com");
driver.manage().window().maximize(); 
driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
WebElement day=driver.findElement(By.id("day"));
Select date=new Select(day);
date.selectByIndex(23);
WebElement month=driver.findElement(By.id("month"));
Select mth=new Select(month);
mth.selectByValue("9");
WebElement year=driver.findElement(By.id("year"));	
Select yar=new Select(year);
yar.selectByVisibleText("1995");
WebElement fs=yar.getFirstSelectedOption();
System.out.println(fs.getText());
List<WebElement> find=yar.getOptions();
for (WebElement yno:find)
{
	System.out.println(yno.getText());
}
}}
	


