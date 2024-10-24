import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
	WebElement footdriver=driver.findElement(By.id("gf-BIG"));
	System.out.println(footdriver.findElements(By.tagName("a")).size());
	
	WebElement columdriver = footdriver.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
	
	for(int i=1;i< columdriver.findElements(By.tagName("a")).size();i++) {
	
	String clickOnLinkTag=Keys.chord(Keys.CONTROL,Keys.ENTER);
	
	columdriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTag);
	}
	Thread.sleep(5000);
	
Set<String>abc	=driver.getWindowHandles();
Iterator<String>it=abc.iterator();
while(it.hasNext())
{
	driver.switchTo().window(it.next());
	System.out.println(driver.getTitle());
}
	
	

	
	
	
	
	}

	}

