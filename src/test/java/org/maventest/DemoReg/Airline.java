package org.maventest.DemoReg;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Airline {
	public static WebDriver driver;
	@Given("^the user has to launch home page$")
	public void the_user_has_to_launch_home_page() {
		System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Selenium\\JyothiWorkspace\\DemoReg\\driver\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("https://www.thaiairways.com/en_ID/index.page?");
	}

	@When("^the user has to enter from and to details$")
	public void the_user_has_to_enter_from_and_to_details() {
	    WebElement from = driver.findElement(By.id("from"));from.sendKeys("India - ChenInnai [MAA]");
	    WebElement to = driver.findElement(By.id("to"));to.sendKeys("Thailand - Bangkok (Suvarnabhumi) [BKK]");
	}

	@Then("^the user has to verify from to details$")
	public void the_user_has_to_verify_from_to_details() {  
	    WebElement from = driver.findElement(By.id("from"));
	    Assert.assertEquals("India - ChenInnai [MAA]",from.getAttribute("value"));
	    WebElement to = driver.findElement(By.id("to"));
	    Assert.assertEquals("Thailand - Bangkok (Suvarnabhumi) [BKK]",to.getAttribute("value"));
	}


}
