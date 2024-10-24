package newpck;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {


    public static void main (String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	WebElement serachBox=driver.findElement(By.xpath("//input[@name='q']"));
	serachBox.sendKeys("iphone 15 pro max");
	serachBox.submit();
	
	String mainPage=driver.getWindowHandle();
	WebElement iphone=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Pro Max (White Titanium, 512 GB)']"));
	iphone.click();
Set<String>allPages	=driver.getWindowHandles();
					for(String page : allPages) {
						if(!page.equals(mainPage)) {
							driver.switchTo().window(page);
							break;
						}
					}
						System.out.println(driver.getCurrentUrl());
	
	
}
}