package com.Mou.Frame.Locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Mou.Frame.Utility.Amazon_Base__Class;

public class homePage_Locator extends Amazon_Base__Class{

	
	public homePage_Locator () {
		
PageFactory.initElements(driver, this);
		
	}
	
//All Drop Down Menu:
	@FindBy(how= How.XPATH, using ="//a[@id='nav-hamburger-menu']")
	public WebElement AllDropDown;
		
	

//Scroll Down and Clothing:
	@FindBy(how= How.XPATH, using =" ")
	public WebElement ScrollDownClothing;


	
	


}