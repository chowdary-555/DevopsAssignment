package com.SeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ParallelTestOnGrid 
{
	WebDriver driver;
 @Parameters({"bname"})
  @Test
  public void testParallel(String bname) throws MalformedURLException, InterruptedException, URISyntaxException 
  {
	  if(bname.equals("chrome"))
	  {
		  ChromeOptions cap=new ChromeOptions();
		  URL url=new URI("http://localhost:4444").toURL();
		  driver =new RemoteWebDriver(url,cap);
		  System.out.println("Session Started with Chrome Browser");
		  
	  }else if(bname.equals("firefox"))
	  {
		  FirefoxOptions cap=new FirefoxOptions();
		  URL url=new URI("http://localhost:4444").toURL();
		  driver =new RemoteWebDriver(url,cap); 
		  System.out.println("Session Started with Firefox Browser");
		  
	  }else if(bname.equals("edge"))
	  {
		  EdgeOptions cap=new EdgeOptions();
		  URL url=new URI("http://localhost:4444").toURL();
		  driver =new RemoteWebDriver(url,cap); 
		  System.out.println("Session Started with Edge Browser");
	  }
	  
	  Thread.sleep(5000);
	  driver.get("https://www.amazon.in");
	  System.out.println("Title is: "+driver.getTitle());
	  Thread.sleep(15000);
	  driver.quit();
  }
}
