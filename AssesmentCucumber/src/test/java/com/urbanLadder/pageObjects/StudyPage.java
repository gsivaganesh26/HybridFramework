package com.urbanLadder.pageObjects;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.StudyPageUI;

public class StudyPage extends StudyPageUI{
	WebDriver driver;
	public StudyPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public List<WebElement> DecorName()
	{
		return  driver.findElements(DecorName);
	}
}
	

