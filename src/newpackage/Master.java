package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Master extends Test1{
	WebDriver driver;
	@Test
	public void verifyMaster() throws Exception{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Master']")).click();
	}

}
