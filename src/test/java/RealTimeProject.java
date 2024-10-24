import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;
public class RealTimeProject {
public static void main(String[]args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//List<WebElement> l = driver.findElements(By.tagName("a")).size();
	System.out.println(driver.findElements(By.tagName("a")).size());
	
WebElement element=	driver.findElement(By.id("gf-BIG"));
	System.out.println(element.findElements(By.tagName("a")).size());
	WebElement columnDriver= element.findElement(By.xpath("//tbody//tr//td[1]//ul"));
	System.out.println(columnDriver.findElements(By.tagName("a")).size());
	
	
	for(int i= 1;i<columnDriver.findElements(By.tagName("a")).size();i++) {
	String clickLinkTab =Keys.chord(Keys.CONTROL,Keys.ENTER);
		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
	}
		Thread.sleep(5000);
		Set<String>abc= driver.getWindowHandles();
		Iterator<String>it=abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		}
	
	
}

