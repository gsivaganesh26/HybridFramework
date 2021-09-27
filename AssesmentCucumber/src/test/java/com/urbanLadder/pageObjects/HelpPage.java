package com.urbanLadder.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.urbanLadder.uistore.HelpPageUI;

public class HelpPage extends HelpPageUI{

	public WebDriver driver;
	public HelpPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getAskQuestion() {
		return driver.findElement(askquestion);
	}
	public WebElement getFAQ() {
		return driver.findElement(FAQ);
	}
	public WebElement getSaleFAQ() {
		return driver.findElement(saleFAQ);
	}
	public WebElement getMyAccount() {
		return driver.findElement(myaccount);
	}
	public WebElement getBeforeIBuy() {
		return driver.findElement(BeforeIBuy);
	}
	public WebElement getPayments() {
		return driver.findElement(payments);
	}
	public WebElement getWarranty() {
		return driver.findElement(warranty);
	}
	public WebElement getMyOrderQueries() {
		return driver.findElement(myorderqueries);
	}
	public WebElement getCancellation() {
		return driver.findElement(cancellation);
	}
	public WebElement getGiftCards() {
		return driver.findElement(giftcards);
	}
	public WebElement getContactUs() {
		return driver.findElement(contactus);
	}
	public WebElement getContactEmail() {
		return driver.findElement(contactMail);
	}
	public WebElement getFacebook() {
		return driver.findElement(facebook);
	}
	public WebElement getTwiter() {
		return driver.findElement(twiter);
	}
	public String getBulkOrderMail() {
		return driver.findElement(bulkOrderMail).getText();
	}
}