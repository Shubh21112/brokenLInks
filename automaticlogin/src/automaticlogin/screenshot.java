package automaticlogin;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {

	public static void demo(WebDriver driver1) throws IOException
	{

Date thisdate = new Date();
SimpleDateFormat df = new SimpleDateFormat("MM,dd,y  hh mm a");
String formate = df.format(thisdate);
System.out.println(formate);

File source = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
File dest = new File("D:\\newss\\test"+ formate);
FileHandler.copy(source, dest);

	}
}


