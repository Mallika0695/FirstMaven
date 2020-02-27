package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends POJOClass {


@Given("User is on bearnesandnobel webpage")
public void user_is_on_bearnesandnobel_webpage() {
	 System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\FirstMaven\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	
   driver.get("https://www.barnesandnoble.com/");
   POJOClass c=new POJOClass();
    c.getSearch();
       
   
   
}


@When("User enter the Search Item {string}")
public void user_enter_the_Search_Item(String s1) {
    WebElement search=driver.findElement(By.id("searchBarBN"));
    search.sendKeys(s1);
    
    
}

@Then("user click the Search button")
public void user_click_the_Search_button() {
	List<WebElement> findElements = driver.findElements(By.id("//[@id='searchBarBN']"));
    for(int i=0;i<findElements.size();i++)
    {
 	  int size = findElements.size();
 	   System.out.println(size);
    }
    driver.close();
	
}




@When("user click the myaccount {string}")
public void user_click_the_myaccount(String string) {
WebElement signin=driver.findElement(By.id("signInLink"));
signin.click();
	
}

@Then("click the sign in")
public void click_the_sign_in() {
    // Write code here that turns the phrase above into concrete actions
	driver.close();
 
}



}