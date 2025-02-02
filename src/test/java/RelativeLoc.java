import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLoc {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	WebElement nameEditBox =driver.findElement(By.cssSelector("[name='name']"));
		
	//System.out.println(driver.findElement(withtagName("label").above(nameEditBox))).getText();
	
	System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement Date_Of_Birth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(Date_Of_Birth)).click();
		
WebElement  checkBox=	driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
			driver.findElement(with(By.tagName("input")).toLeftOf(checkBox)).click();
	}

}
