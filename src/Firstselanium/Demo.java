package Firstselanium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args)throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","D:/my wok/Selanium/test/chromedriver.exe");
		WebDriver Firstselanium=new ChromeDriver();
		Firstselanium.get("https://www.amazon.com");
		Firstselanium.navigate().to("https://www.google.com");
		//Options op=Firstselanium.manage();
		//Window wi=op.window();
		//wi.maximize();
		Firstselanium.manage().window().maximize();
		Firstselanium.findElement(By.name("q")).sendKeys("www.facebook.com",Keys.ENTER);
		Thread.sleep(5600);
		Firstselanium.navigate().back();
		Thread.sleep(5600);
		Firstselanium.navigate().forward();
		Thread.sleep(5600);
        Firstselanium.navigate().refresh();
        String title=Firstselanium.getTitle();
		String url=Firstselanium.getCurrentUrl();
		int tl=title.length();
		int ur=url.length();
		System.out.println(title+""+url);
		System.out.println("title length:"+tl+""+"url length:"+ur);
		//String pagesource=Firstselanium.getPageSource();
		//System.out.println(pagesource);
	}

}
