package com.amazon.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.amazon.pageObjects.HomePage;
import com.amazon.utilities.*;


public class TC_HomeToCart {
	
	
	
	
	public static void main(String[] args)throws InterruptedException {
		
		ReadConfig readconfig=new ReadConfig();
		final String baseURL=readconfig.getApplicationURL();
		

        System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(baseURL);
		
		
		//Creating object of home page
				HomePage home = new HomePage(driver);
		
				
				//Entering value Headphone into search box
				home.searchBox("Headphone");
				
				//Selecting best seller headphone
				home.bestSellerProduct();
				
				//Clicking and going to product detail page.
				home.selectHeadphone();
				
				//Adding product to cart
				home.addHeadphoneToCart();
				
			
		
		
	}

}
