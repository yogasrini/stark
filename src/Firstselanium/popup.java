package Firstselanium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		 WebDriver pop = new ChromeDriver();
		 pop.get("http://popuptest.com/goodpopups.html");
		 pop.manage().window().maximize();
		  pop.findElement(By.xpath("//a[text()='Good PopUp #3']")).click();
		  String got = pop.getTitle();
			System.out.println(got);
			Thread.sleep(3000);
			//pop.navigate().to("http://www.popuptest.com/popup3.html");
			pop.findElement(By.xpath("//a[text()='Good PopUp #4']")).click();
			String yog=pop.getTitle();
			System.out.println(yog);

			//pop.manage().window().maximize();
			//String ans = pop.getTitle();
			

				 }

}
