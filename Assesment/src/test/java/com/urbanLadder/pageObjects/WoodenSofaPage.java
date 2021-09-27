package com.urbanLadder.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.WoodenSofaPageUI;

public class WoodenSofaPage extends WoodenSofaPageUI  {
	public WebDriver driver;
	public WoodenSofaPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getSofaNumber() {
		return driver.findElement(NumberOfSofa);
	}
	public WebElement getViewProduct() {
		return driver.findElement(viewProduct);
	}
	
	
}
