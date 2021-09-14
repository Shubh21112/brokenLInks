package automaticlogin;

import java.io.IOException;
import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonfunctionality {

	public static void main(String[] args) throws IOException, InterruptedException 
		{System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.amazon.in/");
		driver.get("https://demoqa.com/droppable");
		
		http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html

//		https://www.w3schools.com/html/html5_draganddrop.asp
		
		driver.manage().window().maximize();
		
//		JavascriptExecutor js =((JavascriptExecutor)driver);
		
		Thread.sleep(3000);

//		js.executeScript("window.scrollBy(0,800)");
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		//*[@id="drag1"]
		WebElement desti = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		
		Actions act = new Actions(driver);

		
		act.dragAndDrop(source, desti).perform();
		
		
		//div//img[@id='drag1']
		
		
		
		
		
		
		
		
		
		
		
//	WebElement watches = driver.findElement(By.xpath("//img[@alt='Watches']"));

//	WebElement password = driver.findElement(By.xpath("//input[contains(@name,'password')]"));

//	WebElement logInButton= driver.findElement(By.xpath("//div[contains(@class,'_2Q-Qvmryo8OlgCHHPQqsDB undefined')]"));
	//WebElement passcode= driver.findElement(By.xpath("//input[@id='yob']")

	
//	watches.click();
//	WebElement prime = driver.findElement(By.xpath("//a//span[text()='Prime']"));

//	WebElement prime = driver.findElement(By.xpath("//a//span[text()='Prime']"));


//act.moveToElement(prime).perform();

//screenshot h = new screenshot();
//h.demo(null);
	}

}

	

