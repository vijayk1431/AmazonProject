package com.amazon.testcases;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class BaseClass
{
    WebDriver driver;
    @BeforeClass
    public void launchbrowser()
    {
    	Reporter.log("====Browser Launching====");
    	
        driver=new ChromeDriver();
    	driver.get();
    	driver.manage().window().maximize();
    	Reporter.log("====Application Launches====");
    }
    @AfterMethod
    public void testfailed() throws IOException
    {
    	File source=new File("C:\\eclipse-workplace\\Amazon\\FailedScreenshot/testfail.jpg");
    	TakesScreenshot scr=(TakesScreenshot) driver;
    	File dest =scr.getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(source,dest);
    	Reporter.log("====ScreenShot Taken====");
    }
   
    @AfterClass
    public void tesrdown()
    {
    	driver.close();
    }
    
}
