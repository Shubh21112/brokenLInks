package automaticlogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instatgramlogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");

	
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.instagram.com");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	WebElement name = driver.findElement(By.xpath("//input[@name='username']"));

	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

	WebElement logInButton= driver.findElement(By.xpath("//div//button['Log In']"));


name.sendKeys("mr.bodkhe_1211");

password.sendKeys("Siya@143");

logInButton.click();
}
}

