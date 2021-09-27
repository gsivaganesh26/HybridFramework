package com.urbanLadder.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.StoresPageUI;

public class StoresPage extends StoresPageUI{

	public WebDriver driver;
	public StoresPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getDetails() {
		return driver.findElement(view);
	}
}
