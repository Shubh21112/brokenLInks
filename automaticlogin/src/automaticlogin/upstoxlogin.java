package automaticlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxlogin {

	public static void main(String[] args) {

	
	{System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://login.upstox.com/");
	
	driver.manage().window().maximize();
	
WebElement name = driver.findElement(By.xpath("//input[@id='userCode']"));

WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));

WebElement logInButton= driver.findElement(By.xpath("//div[contains(@class,'_2Q-Qvmryo8OlgCHHPQqsDB undefined')]"));
//WebElement passcode= driver.findElement(By.xpath("//input[@id='yob']"));



name.sendKeys("BD0974");
//password.clear();
password.sendKeys("Shubh@197");
logInButton.click();
//passcode.sendKeys("1997");
}
}

}
