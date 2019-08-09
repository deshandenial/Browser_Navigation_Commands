package com.browser_navigation_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Strategy_to_get_the_Page_Source {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 System.out.println("====================================");
		 String actualTitle = driver.getPageSource();
		 System.out.println(actualTitle);
		 System.out.println("====================================");
		 driver.close();

	}

}
