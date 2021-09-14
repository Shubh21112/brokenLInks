package automaticlogin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowser {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int rowcount = row.size();
		System.out.println(rowcount);
		for (int i = 1; i <rowcount; i++)
			 
			{	List<WebElement> cell = row.get(i).findElements(By.xpath("//table[@id='customers']//tr[" +i+ "]//td"));
			int cellcount = cell.size();
			System.out.println(cellcount);
			for (int j = 0; j<cellcount; j++)
			
			{
				String value = cell.get(j).getText();
				System.out.print(value+",  ");
			
		if(j== cellcount)
		{System.out.println();
		
		}
			

		
		
		
		
		
			}
		
		
		}
	}
}


