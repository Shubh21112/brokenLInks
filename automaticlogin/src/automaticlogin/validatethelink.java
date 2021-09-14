package automaticlogin;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validatethelink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.gecko.driver","D:\\firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("https://www.google.com");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println("total links -->"+ linksList.size());
		
		
		List<WebElement> activelinks = new ArrayList<WebElement>();
		
		
		for(int i = 0; i<linksList.size();i++) {
			if(linksList.get(i).getAttribute("href") != null) {
				activelinks.add(linksList.get(i));
			}
		}
		
		System.out.println("active links -->"+ activelinks.size());

		
		
		
		for(int j = 0; j<activelinks.size(); j++) {
	HttpURLConnection connection = (HttpURLConnection)new URL(activelinks.get(j).getAttribute("href")).openConnection();
	connection.connect();
	
	String response = connection.getResponseMessage();
	
	connection.disconnect();
	
	System.out.println(activelinks.get(j).getAttribute("href")+"-->"+response);
	
		
		}
		
		
	
				
	}
}