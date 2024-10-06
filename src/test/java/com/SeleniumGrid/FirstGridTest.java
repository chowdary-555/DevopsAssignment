package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class FirstGridTest 
{
  WebDriver driver;
  @Test
  public void testOnRemoteChrome() throws MalformedURLException, InterruptedException, URISyntaxException 
  {  
	 System.out.println("Remote connectivity is started!");
	 ChromeOptions cap=new ChromeOptions();
	 URL url=new URI("http://localhost:4444").toURL();
	 driver=new RemoteWebDriver(url,cap);
	 
	 System.out.println("Remote connectivity is completed!");
	  
	 Thread.sleep(5000);
	 driver.get("https://www.amazon.in");
	  
	 Thread.sleep(12000);
	  
	 System.out.println("Application title is: "+driver.getTitle());
	  
	  driver.quit();
	  
  }
}
