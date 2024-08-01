package com.crm.Vtiger.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateContactImgPage {

	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement createContactimg;
	
	public CreateContactImgPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateContactimg() {
		return createContactimg;
	}
	
	
	
}
