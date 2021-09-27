package com.urbanLadder.uistore;

import org.openqa.selenium.By;

public class GiftPageUI {
	public By wedding=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[1]/div/div/button");
    public By housewarming=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[2]/div/div/button");
    public By birthday=By.xpath("//img[@alt='Birthday/Anniversary Gift Card by Urban Ladder']");
    public By specialOccasion=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[4]/div/div/button");
    public By corporategift=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[5]/div/div/button");
    public By othergifts=By.xpath("//*[@id=\"app-container\"]/div/main/section/section[1]/ul/li[6]/div/div/button");
    public By EnterAmount=By.id("ip_2251506436");
    public By Month=By.xpath("//*[@id='app-container']/div/main/section/section[2]/div/section[2]/div[4]/select[1]");
    public By Date=By.xpath("//*[@id='app-container']/div/main/section/section[2]/div/section[2]/div[4]/select[2]");
    public By Next=By.xpath("//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']");
    public By RecipientName=By.id("ip_4036288348");
    public By RecipientEmail=By.id("ip_137656023");
    public By yourName=By.id("ip_1082986083");
    public By yourEmail=By.id("ip_4081352456");
    public By yourMobile=By.id("ip_2121573464");
    public By message=By.id("ip_582840596");
    public By confirm=By.xpath("//button[@class='_3Hxyv _1fVSi action-button _1gIUf _1XfDi']");
    public By proceedToPay=By.xpath("//button[@class='_3NxK9 _1fVSi action-button _1gIUf _1XfDi']");
}
