package Firstselanium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/my wok/Selanium/test/chromedriver.exe");
		 WebDriver tools = new ChromeDriver();
		 tools.get("http://leafground.com/pages/table.html");
		 tools.manage().window().maximize();
		WebElement table=tools.findElement(By.xpath("//table[@id=\"table_id\"]"));
		List<WebElement> header=table.findElements(By.tagName("th"));
		Iterator <WebElement>it=header.iterator();
		while (it.hasNext()){
			System.out.println(it.next().getAttribute("innertext"));
		}
		List<WebElement> row=tools.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		int size=row.size();
		System.out.println("No Of row in table :" + size);
		
		for (int i =0 ;i < size ;i++)
		{
			List<WebElement>  data= row.get(i).findElements(By.tagName("td"));
			
		for (int j=0;j<data.size();j++)
		{
		System.out.print(data.get(j).getText()+" ");
		}
		System.out.println();

		
		}


}}