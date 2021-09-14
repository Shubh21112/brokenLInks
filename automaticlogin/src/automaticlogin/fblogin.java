package automaticlogin;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class fblogin {
	
static WebDriver driver ;
public  fblogin shot() throws IOException 
	{

	Date thisdate = new Date();
	SimpleDateFormat df = new SimpleDateFormat("M dd y  hh:mm:s:a");
	String formate = df.format(thisdate);

	System.out.println(formate);
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	File dest = new File("D:\\newss\\test"+ formate);
	FileHandler.copy(source, dest);
	return null;
	
	}
public static void main(String[] args) throws IOException, InterruptedException  
	{System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 WebDriverWait wait = new WebDriverWait(driver,6);
	 
	 
//	
	 
//	 implicit wating
	 
	 
	 
//	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	 
	//explicit wating

	 
//	 WebDriverWait wait = new WebDriverWait(driver,6);
//	 WebElement createnew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[@role]")));
//	
//	driver.navigate();
	driver.get("https://touch.facebook.com/?_rdr");
	
	driver.manage().window().maximize();
	 WebElement createnew = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//a[@role]")));

	
//	WebElement createnew = driver.findElement(By.xpath("//a[@id='signup-button']"));
//	WebElement createnew = driver.findElement(By.xpath("//div//a[@role]"));

	createnew.click();
	Thread.sleep(300);
driver.findElement(By.xpath("//input[contains(@name,'first')]")).sendKeys("manmohan");

driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("singh");
driver.findElement(By.xpath("//div//div//button")).click();


//
//	firstname.sendKeys("manmohan");
//	lastname.sendKeys("singh");
//
//	submit.click();


driver.findElement(By.xpath("//select[contains(@name,'birthday')]")).sendKeys("12");
driver.findElement(By.xpath("(//select)[2]")).sendKeys("2");
driver.findElement(By.xpath("(//select)[3]")).sendKeys("1950");
driver.findElement(By.xpath("//div//button[1]")).click();
	
driver.findElement(By.xpath("(//div//input[@autocapitalize='off'])[2]")).sendKeys("1234567890");
driver.findElement(By.xpath("//div//button[1]")).click();
	WebElement checkbox = driver.findElement(By.xpath("	//select[@id='preferred_pronoun']"));
	
	driver.getTitle();
//	System.err.println(.getTitle);
	
//	day.sendKeys("12");
//	month.sendKeys("2");
//	year.sendKeys("1950");
//	next.click();
//	number.sendKeys("1234567890");
//	ok.click();
boolean result = checkbox.isDisplayed();
if(result)
	{System.out.println("alredy displayed");
		}
else
	{	WebElement radio = driver.findElement(By.xpath("//div//input[@data-value='-1']"));

	radio.click();
//	screenshot f = new screenshot();
//	f.demo(driver);
	
	fblogin x = new fblogin();
	
	x.shot();
	 
//	fblogin l = new fblogin();
//	l.shot();

	}
	}

	
	}







