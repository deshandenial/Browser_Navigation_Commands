package com.browser_navigation_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Difference_between_Close_Quit
{

	public static void main(String[] args) throws Exception 
	{
		
		//Method - 1 (close the browser)
		
	/*	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
        
        //Search for 'Sign In' link and store it in a variable
        WebElement signInElement = driver.findElement(By.linkText("Sign in"));
         
        //Perform Right click on 'sign In' link and open page in a new window
        Actions action = new Actions(driver);
        action.moveToElement(signInElement);
        Thread.sleep(3000);
        action.contextClick(signInElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
         
        Thread.sleep(3000);
        driver.close();
        
     */ 
        
      //Method - 2 (close the browser)
        
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
        
        //Search for 'Sign In' link and store it in a variable
        WebElement signInElement = driver.findElement(By.linkText("Sign in"));
         
        //Perform Right click on 'sign In' link and open page in a new window
        Actions action = new Actions(driver);
        action.moveToElement(signInElement);
        Thread.sleep(3000);
        action.contextClick(signInElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
         
        Thread.sleep(3000);
        driver.quit();

	}

}
