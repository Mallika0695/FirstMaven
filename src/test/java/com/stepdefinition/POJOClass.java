package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POJOClass   {
	public static WebDriver driver;
	public void POJOClass() {
		
      PageFactory.initElements(driver,this);
      
	}
	@FindBy(id="searchBarBN")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	
}
