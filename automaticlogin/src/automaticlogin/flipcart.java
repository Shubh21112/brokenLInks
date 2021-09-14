package automaticlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(3000);

WebElement close = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

boolean result = close.isDisplayed();
if(result)
{System.out.println("yes");

}
else
{close.click();
	}
	}

}
