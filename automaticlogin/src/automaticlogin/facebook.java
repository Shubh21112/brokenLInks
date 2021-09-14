package automaticlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://touch.facebook.com/?_rdr");
driver.manage().window().maximize();


WebElement signup = driver.findElement(By.xpath("//div//a[@id='signup-button']\r\n"));

//WebElement username = driver.findElement(By.xpath("//div//input[@type='text']"));
//div//input[@type='text']
//WebElement pass = driver.findElement(By.xpath("//div//input[@type='password']\r\n"));

//div//input[@type='password']
//div//a[@id='signup-button']

signup.click();

WebElement name = driver.findElement(By.xpath("//div//input[@name='firstname']"));




WebElement sirname = driver.findElement(By.xpath("//div//input[@name='lastname']"));

//Actions act = new Actions(driver);
//act.dragAndDrop(name, sirname);
name.sendKeys("mahesh bhatt");

sirname.sendKeys("123457");

WebElement next = driver.findElement(By.xpath("//div//button[@type='submit']"));

next.click();


WebElement day = driver.findElement(By.xpath("(//div//select)[1]"));
day.sendKeys("12");
Thread.sleep(3000);
WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
month.sendKeys("10");	
//*[@id="month"]

WebElement year = driver.findElement(By.xpath("//div//select[@id='year']"));

year.sendKeys("1997");
WebElement button2 = driver.findElement(By.xpath("//div//button[@type='submit']"));
button2.click();

WebElement num = driver.findElement(By.xpath("//div//input[@id='contactpoint_step_input']"));
num.sendKeys("7038610144");

WebElement go = driver.findElement(By.xpath("//div//button[@type='submit']"));


go.click();
//div//button[@type='submit']
}

}
