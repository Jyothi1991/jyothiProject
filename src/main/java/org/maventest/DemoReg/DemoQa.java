package org.maventest.DemoReg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoQa {
public static void main(String[] args) throws IOException, InterruptedException {
	Base b = new Base();
	System.setProperty("webdriver.chrome.driver","F:\\Softwares\\Selenium\\JyothiWorkspace\\DemoReg\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/registration/");
WebElement first = driver.findElement(By.id("name_3_firstname"));
first.sendKeys(b.getData(1,0));
WebElement last = driver.findElement(By.id("name_3_lastname"));
last.sendKeys(b.getData(1,1));
WebElement status = driver.findElement(By.xpath("//input[@value='married']"));
status.click();
WebElement hobby1 = driver.findElement(By.xpath("//input[@value='reading']"));
hobby1.click();
//Thread.sleep(1000);
WebElement hobby2 = driver.findElement(By.xpath("//input[@value='dance']"));
hobby2.click();
WebElement country  = driver.findElement(By.id("dropdown_7"));
Select s = new Select(country);
s.selectByValue(b.getData(1, 9));
WebElement month  = driver.findElement(By.id("mm_date_8"));
Select s1 = new Select(month);
s1.selectByValue(b.getData(1,10));
WebElement date  = driver.findElement(By.id("dd_date_8"));
Select s2 = new Select(date);
s2.selectByValue(b.getData(1,11));
WebElement year  = driver.findElement(By.id("yy_date_8"));
Select s3 = new Select(year);
s3.selectByValue(b.getData(1,12));
WebElement phno  = driver.findElement(By.id("phone_9"));
phno.sendKeys(b.getData(1,4));
WebElement usrname  = driver.findElement(By.id("username"));
usrname.sendKeys(b.getData(1,13));
WebElement email  = driver.findElement(By.id("email_1"));
email.sendKeys(b.getData(1,3));

}

}
