package com.urbanLadder.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.LandingUI;

public class LandingPage extends LandingUI {

	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getSale() {
		return driver.findElement(sale);
	}
	public WebElement getLiving() {
		return driver.findElement(living);
	}
	public WebElement getDining() {
		return driver.findElement(dining);
	}
	public WebElement getDecor() {
		return driver.findElement(decor);
	}
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public WebElement getHelp() {
		return driver.findElement(help);
	}
	public WebElement getGiftcard() {
		return driver.findElement(giftcard);
	}
	public WebElement getSearchButton() {
		return driver.findElement(searchbutton);
	}
	public WebElement getCount() {
		return driver.findElement(count);
	}
	public WebElement getWoodenSofa() {
		return driver.findElement(woodenSofa);
	}
	public WebElement get() {
		return driver.findElement(woodenSofa);
	}
	public int getPopupsize() {
		return driver.findElements(popup).size();
	}

	public WebElement getPopup() {
		return driver.findElement(popup);
	}
	public WebElement Hover()
	{
		return driver.findElement(hover);
	}
	
	public WebElement Login()
	{
		return driver.findElement(login);
	}
	public WebElement getStudyIcon()
	{
		return driver.findElement(StudyIcon);
	}
	public WebElement getStore()
	{
		return driver.findElement(store);
	}
	public WebElement getdecorIcon()
	{
		return driver.findElement(decorIcon);
	}
	
}