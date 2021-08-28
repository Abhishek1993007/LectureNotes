package com.amazon.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public HomePage(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for srcbox field
	By srchBox = By.xpath("//input[@id='twotabsearchtextbox']");
	
	//Locator for bestseller field
	By bstSeller = By.xpath("//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/div[1]/span[1]/span[1]/span[1]/span[1]");
	
	//Locator for headphone button
	By headPhone = By.xpath("//body/div[@id='a-page']/div[@id='zg']/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/span[1]/div[1]/span[1]/a[1]/span[1]/div[1]");
	
	//Locator for addto cart button
		By AdtoCart = By.xpath("//input[@id='add-to-cart-button']");
		
		
	//Method to enter product name into search box
	public void searchBox(String EnterHeadphone) {
		driver.findElement(srchBox).sendKeys(EnterHeadphone);
	}

	//Method to select best seller product
	public void bestSellerProduct() {
		driver.findElement(bstSeller).click();
	}
	
	//Method to select product
	public void selectHeadphone() {
		driver.findElement(headPhone).click();
	}
	
	//Method to Add product to cart
		public void addHeadphoneToCart() {
			driver.findElement(AdtoCart).click();
		}


}
