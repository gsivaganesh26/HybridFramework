package com.urbanLadder.uistore;

import org.openqa.selenium.By;

public class HelpPageUI {

	public By askquestion=By.id("help-center-search-input");
	public By FAQ=By.xpath("//*[@id='content']/div[2]/div[1]/ul/li[1]/a");
	public By saleFAQ=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[2]/a");
	public By myaccount=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[3]/a");
	public By BeforeIBuy=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[4]/a");
	public By payments=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[5]/a");
	public By warranty=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[6]/a");
	public By myorderqueries=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[7]/a");
	public By cancellation=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[8]/a");
	public By giftcards=By.xpath("//*[@id=\"content\"]/div[2]/div[1]/ul/li[9]/a");
	public By contactus=By.linkText("Contact Us");
	public By contactMail=By.xpath("//*[@id='content']/div[2]/div[2]/div[2]/div[1]/p/a");
	public By facebook=By.xpath("//*[@id='footer-social']/li[1]/a");
	public By twiter=By.xpath("//*[@id='footer-social']/li[2]/a");
	public By bulkOrderMail=By.xpath("//*[@id='content']/div[2]/div[2]/div[2]/div[2]/p/a");
}
