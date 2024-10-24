import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
public class amzonPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 pro max");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).submit();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Apple iPhone 15 Pro Max (256 GB) - Black Titanium")).click();
	//	Thread.sleep(2000);
	
		
	//	driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
		driver.findElement(By.xpath("(//span[@id='submit.add-to-cart'])[2])")).click();
	}

}
