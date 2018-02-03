package newpackage;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScrollDown {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Revathi\\Automation\\SPPC_POM\\src\\test\\java\\Drivers\\chromedriver.exe");
		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setBrowserName("chrome");
	    System.out.println("Connecting to " + url);
	    WebDriver driver = new RemoteWebDriver(url, capabilities);
		driver.get("http:///super_user");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_username")).sendKeys("");
		driver.findElement(By.id("user_password")).sendKeys("");
		driver.findElement(By.id("sign_in")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("master")).click();
		driver.findElement(By.xpath("//a[text()='Company']")).click();
		driver.findElement(By.xpath("//a[text()='Edit Details']")).click();
		WebElement element=driver.findElement(By.id("company_limit_esi_gross"));
        Actions action=new Actions(driver);        
        //action.moveByOffset(0, -2500).build().perform();
        action.moveToElement(element, 0, +2500).build().perform();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		

	}

}
