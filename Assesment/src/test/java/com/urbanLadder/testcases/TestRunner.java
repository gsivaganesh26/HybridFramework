package com.urbanLadder.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.urbanLadder.pageObjects.StudyPage;
import com.urbanLadder.pageObjects.DecorPage;
import com.urbanLadder.pageObjects.GiftPage;
import com.urbanLadder.pageObjects.HadapsarPage;
import com.urbanLadder.pageObjects.HelpPage;
import com.urbanLadder.pageObjects.LandingPage;
import com.urbanLadder.pageObjects.LoginPage;
import com.urbanLadder.pageObjects.StoresPage;
import com.urbanLadder.pageObjects.WoodenSofaPage;
import com.urbanLadder.reuseable.Reuseable;
import com.urbanLadder.utilities.ExcelDriven;


public class TestRunner extends Reuseable {
	private ExcelDriven dd;
	Logger log=LogManager.getLogger(Reuseable.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		log.info("Navigated to the homepage");
		LandingPage l=new LandingPage(driver);
		if (l.getPopupsize() > 0) {
			l.getPopup().click();
		}
	}
	@Test(priority = 1,dataProvider="getProduct")
	public void searching(String product) throws InterruptedException {
		LandingPage l=new LandingPage(driver);
		l.getSearch().sendKeys(product);
		Thread.sleep(2000);
		l.getSearch().sendKeys(Keys.ARROW_DOWN);
		l.getSearch().sendKeys(Keys.ENTER);	
		log.info("Printing the count");
		System.out.println("Count is :"+l.getCount().getText());
	}
	@Test(priority = 2)
	public void HelpContact() {
		LandingPage l=new LandingPage(driver);
		l.getHelp().click();
		HelpPage h=new HelpPage(driver);
		h.getContactUs().click();
		Assert.assertEquals(h.getContactEmail().getText(),"hello@urbanladder.com");
		Assert.assertEquals(h.getBulkOrderMail(),"bulk@urbanladder.com");
		Assert.assertEquals(h.getFacebook().isDisplayed(),true);
		Assert.assertEquals(h.getTwiter().isDisplayed(),true);	
	}
	@Test(priority = 3)
	public void living() throws InterruptedException {
		LandingPage l=new LandingPage(driver);
		Actions a= new Actions(driver);
		a.moveToElement(l.getLiving()).build().perform();
		Thread.sleep(2000);
		a.moveToElement(l.getWoodenSofa()).click().build().perform();
		WoodenSofaPage w=new WoodenSofaPage(driver);
		System.out.println(w.getSofaNumber().getText());
		w.getViewProduct().click();
	}
	@Test(priority = 4)
	public void GiftCoupon() throws InterruptedException {
		LandingPage l = new LandingPage(driver);
		GiftPage g = new GiftPage(driver);
		l.getGiftcard().click();
		g.getBirthday().click();
		g.getEnterAmount().sendKeys("2000");
		g.getMonth().sendKeys(Keys.DOWN.ENTER);
		g.getDate().sendKeys("15");
		g.getDate().sendKeys(Keys.ENTER);
		g.getNext().click();
		g.getRecipientName().sendKeys("Ganesh");
		g.getRecipientEmail().sendKeys("gsivaganesh26@gmail.com");
		g.getYourName().sendKeys("Sivaganesh");
		g.getYourEmail().sendKeys("riotValo@gmail.com");
		g.getYourMobile().sendKeys("6369136540");
		g.getConfirm().click();
		driver.navigate().to(prop.getProperty("url"));
	}
	@Test(priority = 5)
	public void Login()
	{
		LoginPage login=new LoginPage(driver);
		LandingPage l=new LandingPage(driver);
		Actions action=new Actions(driver);
		action.moveToElement(l.Hover()).perform();
		l.Login().click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		login.Email().sendKeys(".com");
		login.Password().sendKeys("12345678");
		login.Submit().click();
		log.info("Logged in");
		
	}
	@Test(priority = 6)
	public void StudyList() {
		LandingPage l = new LandingPage(driver);
		StudyPage d = new StudyPage(driver);
		l.getStudyIcon().click();
		Assert.assertEquals(10, d.DecorName().size());
		log.info("Value is validated");
	
	}
	@Test(priority = 7)
	public void Stores()
	{
		LandingPage l=new LandingPage(driver);
		StoresPage s=new StoresPage(driver);
		if(l.getPopupsize()>0)
		{
			l.getPopup().click();
		}
		l.getStore().click();
		s.getDetails().click();
		HadapsarPage h=new HadapsarPage(driver);
		System.out.println("Address:"+h.getAddress().getText());
		System.out.println();
		System.out.println("Working Hours:"+h.getWorkingHrs().getText());
		driver.navigate().to(prop.getProperty("url"));
		
	}
	@Test(priority = 8)
	public void clickingOnDecorIcon() {
		LandingPage l = new LandingPage(driver);
		l.getdecorIcon().click();
		DecorPage d=new DecorPage(driver);
		Assert.assertEquals(driver.getTitle(), "Home Decor: Buy Home Decor Items Online "
				+ "[ Home Decor Furniture ] - Urban Ladder");
		System.out.println(d.getHomeDecor().isDisplayed());
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
	@DataProvider
	public Object[][] getProduct() throws IOException {
		dd=new ExcelDriven();
		ArrayList<String> h = dd.getData("parameter");
		int ct = h.size();
		Object[][] data = new Object[1][1];
		for(int i = 1; i < ct ; i++) {
			
			data[i-1][0] = h.get(i);
		}
		return data;
		
	}
}
