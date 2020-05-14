package Firstselanium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fameprac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
 WebDriver stark = new ChromeDriver();
 stark.get("https://chercher.tech/practice/frames");
 stark.manage().window().maximize();
 stark.switchTo().frame("iamframe");
 stark.findElement(By.xpath("//*[@type='text']")).sendKeys("breaking bad");
 stark.switchTo().frame(0);
 stark.findElement(By.id("a")).click();
 //stark.switchTo().frame(1);
 stark.switchTo().parentFrame();
stark.switchTo().parentFrame();
stark.switchTo().frame(1);
 Select op=new Select(stark.findElement(By.id("animals")));
	op.getOptions().forEach((o)->{System.out.println(o.getText());});
 //stark.switchTo().defaultContent();
// stark.switchTo().frame(1);
	//Select s=new Select(stark.findElement(By.id("animals")));
	//s.getOptions().forEach((o)->{System.out.println(o.getText());});
 
 

	}

}
