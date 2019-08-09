package com.browser_navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ways_to_Navigate_To_Back_Forward_Refresh_ {

	public static void main(String[] args) throws Exception {
		
		// navigate().to() method
		
		 /*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://www.google.com/");
		 */	
		
		
		
		// navigate().back() method
		
		  /*	 	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com/");
				driver.navigate().back();
		  */
		
		
		// navigate().forward() method
 		
			/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com/");
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
	    	
		      */
		
		// navigate().refresh() method
					
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.google.com/");
				Thread.sleep(2000);
				driver.navigate().refresh();

	}

}
