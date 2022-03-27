package com.amazon.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadConfig 
{   
	  Properties pro;
     @Test
	 public void dataprovider() throws FileNotFoundException
	    {
	    	File src=new File("C:\\eclipse-workplace\\Amazon\\Xpaths/Xpath.java");
	    	Reporter.log("===datafetching===");
	    	try
	    	{
	    	FileInputStream data=new FileInputStream(src);
	    	 pro=new Properties();
	    	  pro.load(data);
	    	  String name1=pro.getProperty("Gender");
	         }
	    	catch(Exception e)
	    	{
	    		System.out.println("Exception is "+e.getMessage());
	    	}
	    }
	    	public String gender()
	    	{
	    		String gender1=pro.getProperty("Gender");
				return gender1;
	    	}
	    }
	    
	    	
	 

