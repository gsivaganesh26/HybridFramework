package com.urbanLadder.uistore;

import org.openqa.selenium.By;

public class LandingUI {

	public By sale= By.xpath("//li[@class='topnav_item saleunit']");
	public By living= By.xpath("//li[@class='topnav_item livingunit']");
	public By dining=By.xpath("//li[@class=topnav_item diningunit']");
	public By decor= By.cssSelector("#topnav_wrapper > ul > li.topnav_item.decorunit");
	public By search=By.id("search");
	public By help=By.xpath("//a[@class='inherit contact-channel']");
	public By giftcard=By.xpath("//a[@href='../../gift-cards?src=header']");
	public By searchbutton=By.id("search_button");
	public By count=By.xpath("//*[@id='search-results']/div[1]/span/span");
	public By woodenSofa=By.xpath("//*[@id='topnav_wrapper']/ul/li[2]/div/div/ul/li[1]/ul/li[3]/a/span");
	public By popup = By.xpath("//*[@id=\"authentication_popup\"]/div[1]/div/div[2]/a[1]");
	public By hover=By.xpath("//*[@id=\"header\"]/div[1]/div/section[3]/ul/li[2]/span");
	public By login=By.linkText("Log In");
	public By StudyIcon=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(2) > svg");
	public By store=By.xpath("//*[@id='header']/section/div/ul[2]/li[1]/a");
	public By decorIcon=By.cssSelector("#content > div.personalized-component > div > div:nth-child(3) > a:nth-child(6) > svg");
}
