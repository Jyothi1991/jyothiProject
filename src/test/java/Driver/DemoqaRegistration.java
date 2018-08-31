package Driver;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoqaRegistration {
	public static WebDriver driver;
	@Given("^The user has to launch login page$")
	public void the_user_has_to_launch_login_page() {
	   System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Selenium\\JyothiWorkspace\\DemoReg\\driver\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://demoqa.com/registration/");
	    
	}

	@When("^The user has to enter login details$")
	public void the_user_has_to_enter_login_details(DataTable details) {
	  List<String> myList =details.asList(String.class);
	  WebElement fname = driver.findElement(By.id("name_3_firstname"));
	  fname.sendKeys(myList.get(0));
	  WebElement lname = driver.findElement(By.id("name_3_lastname"));
	  lname.sendKeys(myList.get(1));
	  WebElement phn = driver.findElement(By.id("phone_9"));
	  phn.sendKeys(myList.get(8));
	  WebElement status = driver.findElement(By.xpath("//input[@value='single']"));
	  status.click();
	  WebElement hobbies = driver.findElement(By.xpath("//input[@value='dance']"));
	  hobbies.click();
	  WebElement hobbies1 = driver.findElement(By.xpath("//input[@value='reading']"));
	  hobbies1.click();
	  WebElement country = driver.findElement(By.id("dropdown_7"));
	  country.sendKeys(myList.get(4));
	  driver.findElement(By.id("mm_date_8")).sendKeys(myList.get(5));
	  driver.findElement(By.id("dd_date_8")).sendKeys(myList.get(6));
	  driver.findElement(By.id("yy_date_8")).sendKeys(myList.get(7));
	  driver.findElement(By.id("username")).sendKeys(myList.get(9));
	  driver.findElement(By.id("email_1")).sendKeys(myList.get(10));
	  driver.findElement(By.id("password_2")).sendKeys(myList.get(11));
	  driver.findElement(By.id("confirm_password_password_2")).sendKeys(myList.get(12));
	}

	
	@Then("^The user has to verify firstname and last name$")
	public void the_user_has_to_verify_firstname_and_last_name() {
		WebElement fname = driver.findElement(By.id("name_3_firstname"));
		    Assert.assertEquals("sai", fname.getAttribute("value"));
		    WebElement lname = driver.findElement(By.id("name_3_lastname"));
		    Assert.assertEquals("jyothi", lname.getAttribute("value"));
		 
	}
	
		
	


}
