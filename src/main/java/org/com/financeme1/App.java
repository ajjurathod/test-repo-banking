package org.com.financeme1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	
        // initilize webdriver
      	WebDriverManager.chromedriver().setup();
        // setting up property
      	ChromeOptions chromeOptions = new ChromeOptions();
      	ChromeOptions chrmoOptions = chromeOptions;
  		chrmoOptions.addArguments("--headless");
        // opening url
      	WebDriver driver = new ChromeDriver(chromeOptions);
      	driver.get("http://54.169.197.15:8085/contact.html");
      	
        //wait to load the page
      	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
      	
       //enter the details
      	driver.findElement(By.id("Name")).sendKeys("ajay");
      	
      	
      	driver.findElement(By.id("Number")).sendKeys("7349181246");
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	
      	
      	driver.findElement(By.id("Email")).sendKeys("ajjurathod1998@gmail.com");
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	
      	driver.findElement(By.id("Message")).sendKeys("Hi i am ajay, how are you");
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	
      	driver.findElement(By.id("my-button")).click();
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	
      	String response = driver.findElement(By.id("response")).getText();
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	
      	System.out.println("response");
      	
      	TakesScreenshot scrShot =((TakesScreenshot)driver);
      	File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
      	File destFile = new File(" //var/lib/jenkins/workspace/cicd-pipeline-banking/reprot.jpg");
      	FileUtils.copyFile(srcFile, destFile);
      	
      	try {
  			Thread.sleep(2000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
      	 
      	driver.quit();
      	
          System.out.println( "Hello World!" );
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
