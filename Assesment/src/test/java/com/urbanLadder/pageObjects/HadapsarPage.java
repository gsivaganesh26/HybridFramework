package com.urbanLadder.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.HadapsarPageUI;

public class HadapsarPage extends HadapsarPageUI  {

	public WebDriver driver;
	public HadapsarPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getAddress() {
		return driver.findElement(address);
	}
	public WebElement getWorkingHrs() {
		return driver.findElement(workingHrs);
	}
}