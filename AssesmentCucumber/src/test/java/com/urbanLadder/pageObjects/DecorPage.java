package com.urbanLadder.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DecorPage {
	WebDriver driver;
	public DecorPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By homeDecor=By.xpath("//*[@id='content']/h1");
	
	public WebElement getHomeDecor()
	{
		return driver.findElement(homeDecor);
	}
}