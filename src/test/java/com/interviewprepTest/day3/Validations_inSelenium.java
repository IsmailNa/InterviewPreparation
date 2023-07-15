package com.interviewprepTest.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations_inSelenium {
	//getTitle()
	//getCurrentUrl
	//getPageSource()
	
	//isDisplayed()
	//isSelected()
	//isEnabled()
	
	public static WebDriver driver;

	public static void main(String[] args) {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");
	
	String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	String expectedCurrentUrl = "https://www.rediff.com/";
	
	String actualTitle = driver.getTitle();
	String actualCurrentUrl = driver.getCurrentUrl();
	
	if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
		driver.findElement(By.className("signin")).click();
	}else {
		driver.quit();
	}

	 WebElement usernameTextbox = driver.findElement(By.id("login1"));
	 WebElement passwordTextbox = driver.findElement(By.id("password"));
	 WebElement keepMeSignedInCheckbox = driver.findElement(By.id("remember"));
	 WebElement signinButton = driver.findElement(By.className("signinbtn"));
	 
	 if(usernameTextbox.isDisplayed()&& usernameTextbox.isEnabled() && passwordTextbox.isDisplayed() && passwordTextbox.isEnabled() && keepMeSignedInCheckbox.isSelected() && signinButton.isDisplayed() && signinButton.isEnabled()) {
		 usernameTextbox.sendKeys("seleniumpanda@rediffmail.com");
		 passwordTextbox.sendKeys("Selenium@123");
		 signinButton.click();
	 }else {
		 driver.quit();
	 }
	 
	}

}
