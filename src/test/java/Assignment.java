import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		// String opt=
		// driver.findElement(By.xpath("//*[id='checkbox-example']/fieldset/label[2]")).getText();

		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();

		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).click();
		System.out.println(opt);

		
		  WebElement element = driver.findElement(By.id("dropdown-class-example"));
		  Select s = new Select(element); 
		  s.selectByVisibleText(opt);
		 driver.findElement(By.name("enter-name")).sendKeys(opt);
		  //driver.findElement(By.name("enter-name")).sendKeys(opt);
		  driver.findElement(By.id("alertbtn")).click();
		String text= driver.switchTo().alert().getText();
		
		if(text.contains(text))
		{
			System.out.println("Alert message successful");
		}
		
	else {
			
			System.out.println("Something wrong with execution");
		 
	}

}
}

