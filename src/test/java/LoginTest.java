import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
public static WebDriver driver;

@BeforeSuite
public void setup(){
driver = new FirefoxDriver();

}
@Test
public void doLogin(){
	driver.get("http://gmail.com");
	driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("devraj.gemini@gmail.com");
	driver.findElement(By.xpath("//*[@id='next']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("nitu1984devonu1985");
	
	
}
@AfterSuite
	public void teardown(){
		driver.quit();
	}
}
