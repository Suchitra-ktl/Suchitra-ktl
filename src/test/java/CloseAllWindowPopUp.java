import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v124.indexeddb.model.Key;
import org.testng.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllWindowPopUp {

	public static void main(String[] args) {
		ChromeOptions option= new ChromeOptions();
	//	Proxy proxy=new Proxy();
		//proxy.setHttpProxy("ipaddress:4444");
		//option.setCapability("proxy",proxy);
		option.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver();
		driver.get("https://expired.badssl.com/");
	
		WebElement advancedButton = driver.findElement(By.id("details-button"));
        advancedButton.click();

        WebElement proceedLink = driver.findElement(By.id("proceed-link"));
        proceedLink.click();
    	System.out.println(driver.getTitle());
}
}