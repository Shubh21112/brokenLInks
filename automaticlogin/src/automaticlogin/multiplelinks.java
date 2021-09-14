package automaticlogin;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class multiplelinks {


		public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver","D:\\firefox\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
			driver.get("https://www.google.com");
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			
			System.out.println("Total links are "+links.size());
			
			for(int i=0;i<links.size();i++)
			{
				
				WebElement ele= links.get(i);
				
				String url = ele.getAttribute("href");
				
				verifyLinkActive(url);
				
			}
			
		}
		
		public static void verifyLinkActive(String linkUrl)
		{
	        try 
	        {
	           URL url = new URL(linkUrl);
	           
	           HttpURLConnection Connect=(HttpURLConnection)url.openConnection();
	           
	           Connect.setConnectTimeout(3000);
	           
	           Connect.connect();
	           
	           if(Connect.getResponseCode()==200)
	           {
	               System.out.println(linkUrl+" - "+Connect.getResponseMessage());
	            }
	          if(Connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
	           {
	               System.out.println(linkUrl+" - "+Connect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
	            }
	        } catch (Exception e) {
	           
	        }
	    } 
		
		
		 

	}