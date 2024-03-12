package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links) 
		{
			String linkname=link.getText();
			if(linkname=="Create a Page") 
			{
				link.click();
			}
			else 
			{
				System.out.println("Link is not present");
			}
		}
	}

}
