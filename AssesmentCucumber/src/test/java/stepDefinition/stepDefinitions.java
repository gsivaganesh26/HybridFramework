package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.urbanLadder.pageObjects.DecorPage;
import com.urbanLadder.pageObjects.GiftPage;
import com.urbanLadder.pageObjects.HadapsarPage;
import com.urbanLadder.pageObjects.HelpPage;
import com.urbanLadder.pageObjects.LandingPage;
import com.urbanLadder.pageObjects.LoginPage;
import com.urbanLadder.pageObjects.StoresPage;
import com.urbanLadder.pageObjects.StudyPage;
import com.urbanLadder.pageObjects.WoodenSofaPage;
import com.urbanLadder.reuseable.Reuseable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions extends Reuseable{
	
	
	//1st testcase
	
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=initializeDriver();
		driver.manage().window().maximize();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(arg1);
	}

	@When("^user enters \"([^\"]*)\" in search box$")
	public void user_enters_in_search_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
		l.getSearch().sendKeys(arg1);
		Thread.sleep(2000);
		l.getSearch().sendKeys(Keys.ARROW_DOWN);
		l.getSearch().sendKeys(Keys.ENTER);	
	}

	@Then("^print the count of dining table$")
	public void print_the_count_of_dining_table() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage l=new LandingPage(driver);
    	System.out.println("Count is :"+l.getCount().getText());
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}
	
	
	
	
	
	
	
	
	//2nd testc ase
	
	
	 @When("^user clicks on help button$")
	    public void user_clicks_on_help_button() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
			l.getHelp().click();
	    }

	    @Then("^verify the Contactmail Bulkordermail Facebook and Twitter$")
	    public void verify_the_contactmail_bulkordermail_facebook_and_twitter() throws Throwable {
	    	HelpPage h=new HelpPage(driver);
			h.getContactUs().click();
			Assert.assertEquals(h.getContactEmail().getText(),"hello@urbanladder.com");
			Assert.assertEquals(h.getBulkOrderMail(),"bulk@urbanladder.com");
			Assert.assertEquals(h.getFacebook().isDisplayed(),true);
			Assert.assertEquals(h.getTwiter().isDisplayed(),true);	
	    }
	    
	    
	   //3rd test case
	    
	    @When("^user clicks on Living menu and wooden sofa$")
	    public void user_clicks_on_living_menu_and_wooden_sofa() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
			Actions a= new Actions(driver);
			a.moveToElement(l.getLiving()).build().perform();
			Thread.sleep(2000);
			a.moveToElement(l.getWoodenSofa()).click().build().perform();
	    }

	    @Then("^prints the number of sofa and click on view product$")
	    public void prints_the_number_of_sofa_and_click_on_view_product() throws Throwable {
	    	WoodenSofaPage w=new WoodenSofaPage(driver);
			System.out.println(w.getSofaNumber().getText());
			w.getViewProduct().click(); 
	    }
	    
	    
	    //4th test case
	    
	    @When("^user clicks on giftcards and then clicking on birthday$")
	    public void user_clicks_on_giftcards_and_then_clicking_on_birthday() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			GiftPage g = new GiftPage(driver);
			l.getGiftcard().click();
			g.getBirthday().click();
	    }

	    @Then("^user enters amount and selects date and click on next$")
	    public void user_enters_amount_and_selects_date_and_click_on_next() throws Throwable {
	    	GiftPage g = new GiftPage(driver);
	    	g.getEnterAmount().sendKeys("2000");
			g.getMonth().sendKeys(Keys.DOWN.ENTER);
			g.getDate().sendKeys("15");
			g.getDate().sendKeys(Keys.ENTER);
			g.getNext().click();
	    }
	    @And("^user enters from and to details and click on confirm button$")
	    public void user_enters_from_and_to_details_and_click_on_confirm_button() throws Throwable {
	    	GiftPage g = new GiftPage(driver);
	    	g.getRecipientName().sendKeys("Ganesh");
			g.getRecipientEmail().sendKeys("gsivaganesh26@gmail.com");
			g.getYourName().sendKeys("Sivaganesh");
			g.getYourEmail().sendKeys("riotValo@gmail.com");
			g.getYourMobile().sendKeys("6369136540");
			g.getConfirm().click();
			driver.navigate().to(prop.getProperty("url"));
	    }
	    
	    
	    //5th testcase
	    
	    @When("^user clicks on login button$")
	    public void user_clicks_on_login_button() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
			Actions action=new Actions(driver);
			action.moveToElement(l.Hover()).perform();
			l.Login().click(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
	    }

	    @Then("^Enters username and password and click on login$")
	    public void enters_username_and_password_and_click_on_login() throws Throwable {
	    	LoginPage login=new LoginPage(driver);
	    	login.Email().sendKeys(".com");
			login.Password().sendKeys("12345678");
			login.Submit().click();  
	       
	    }
	    
	    
	    //6th test case
	    @When("^user clicks on stores button and clicks view details on Hadapsar$")
	    public void user_clicks_on_stores_button_and_clicks_view_details_on_hadapsar() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
			StoresPage s=new StoresPage(driver);
			if(l.getPopupsize()>0)
			{
				l.getPopup().click();
			}
			l.getStore().click();
			s.getDetails().click();
	    }

	    @Then("^displays the address and working hrs in the console$")
	    public void displays_the_address_and_working_hrs_in_the_console() throws Throwable {
	    	HadapsarPage h=new HadapsarPage(driver);
			System.out.println("Address:"+h.getAddress().getText());
			System.out.println();
			System.out.println("Working Hours:"+h.getWorkingHrs().getText());
			driver.navigate().to(prop.getProperty("url"));
	    }
	    
	    
	    
	    //7th test case
	    @When("^user clicks on decor icon$")
	    public void user_clicks_on_decor_icon() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getdecorIcon().click();
	    }

	    @Then("^checks the title of Home decor page$")
	    public void checks_the_title_of_home_decor_page() throws Throwable {
	    	DecorPage d=new DecorPage(driver);
			Assert.assertEquals(driver.getTitle(), "Home Decor: Buy Home Decor Items Online "
					+ "[ Home Decor Furniture ] - Urban Ladder");
			System.out.println(d.getHomeDecor().isDisplayed());
	    }
	    
	    
	    
	    
	    //8th test case
	    
	    @When("^user clicks on study icon$")
	    public void user_clicks_on_study_icon() throws Throwable {
	    	LandingPage l = new LandingPage(driver);
			l.getStudyIcon().click();
	    }

	    @Then("^check the count of products in the page is 10$")
	    public void check_the_count_of_products_in_the_page_is_10() throws Throwable {
	    	StudyPage d = new StudyPage(driver);
	    	Assert.assertEquals(10, d.DecorName().size());
	    }
	    
	    
	    
	    
	    
}
