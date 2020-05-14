package Firstselanium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datadrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		WebElement mul=driver.findElement(By.id("continentsmultiple"));
		Select mul1=new Select(mul);
		mul1.selectByValue("AF");
		mul1.selectByIndex(1);
		mul1.deselectAll();
		if(mul1.isMultiple())
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

	}
	

	


