import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;
public class AssPractice {
	

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.qaclickacademy.com/practice.php");
	
//	driver.findElement(By.xpath("//*[id='checkbox-example']/fieldset/label[2]")).click();
    driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
	
	
	
	
String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
//String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();

	WebElement dropDown= driver.findElement(By.id("dropdown-class-example"));
	
	Select s= new Select(dropDown);
	s.selectByVisibleText(opt);
	
	driver.findElement(By.name("enter-name")).sendKeys("opt");
	driver.findElement(By.id("alertbtn")).click();
	String text = driver.switchTo().alert().getText();
	
	if(text.contains(opt)){
		System.out.println("Alert Message Successful");
	}
	else
		
	
	System.out.println("Alert Message is not Successful");
	
	
}
}