package com.browser_navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_Page_title {

	public static void main(String[] args) 
	{
		// Method-1 (Using If-Statement)
	/*	
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 String actualTitle = driver.getTitle();
		 driver.manage().window().maximize();
		 String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
		 if(actualTitle.equalsIgnoreCase(expectedTitle))
		 System.out.println("Title Matched");
		 else
		 System.out.println("Title didn't match");
		 driver.close();
	*/
		 
		// Method-2 (Using Assert Command)
		
		 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 String actualTitle = driver.getTitle();
		 driver.manage().window().maximize();
		 String expectedTitle = "Avinash Mishra Blogger: Learn Selenium WebDriver, Automation Framework, QA, SEO & Digital Marketing | Inviul Blog | Inviul";
		 Assert.assertEquals("Condition true", actualTitle, expectedTitle);
		 driver.close();
		
		

	}

}
