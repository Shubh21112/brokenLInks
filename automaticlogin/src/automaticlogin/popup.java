package automaticlogin;

import java.io.IOException;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup extends screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();

	driver.get("https://ksrtc.in/oprs-web/");
	driver.manage().window().maximize();
	
	System.out.println("window maximized");
	
	WebElement button1 = driver.findElement(By.xpath("//*[@id=\"corover-close-btn\"]"));
	
	popup p = new popup();

	System.out.println("element 1 is found");
	
//	p.demo(driver);
		

	WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	System.out.println("element 2 is found");
	
//	p.demo(driver);//screenshot

	
	Thread.sleep(3000);
	
	button1.click();
	
	System.out.println("element 1  is clicked ");
	button.click();
	System.out.println("elemnet 2 is clicked");
	
	Alert alt = driver.switchTo().alert();
	System.out.println("alert pop up");
	
//	p.demo(driver);//screenshot

	
	Thread.sleep(3000);
	
	alt.accept();
	
	System.out.println("pop is acepted");
	//screenshot
	}

}
