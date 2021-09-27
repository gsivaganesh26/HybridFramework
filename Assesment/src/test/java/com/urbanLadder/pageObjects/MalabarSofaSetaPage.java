package com.urbanLadder.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.MalabarSofaPage;

public class MalabarSofaSetaPage extends MalabarSofaPage {

	public WebDriver driver;
	public MalabarSofaSetaPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public WebElement getPrice() {
		return driver.findElement(price);
	}
	
}
