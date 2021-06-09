package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AddPatientPage 
{
	private By patientFrame=By.xpath("//iframe[@ src='/a/openemr/interface/new/new.php']");
	private By sirname=By.id("form_title");
	private By  patientFirstNameLocator = By.id("form_fname");
	private By  patientLastNameLocator = By.id("form_lname");
	private By  patientdateOfBirthLocator = By.id("form_DOB");
	private By  patientgenderLocator = By.id("form_sex");
	private By  createNewPatientLocator =By.id("create");
	private By  switchIntoFrameLocator =By.xpath("//iframe[@ id='modalframe']");
	
	
	private WebDriver driver;

	public AddPatientPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchTopatientFrame() 
	{
		driver.switchTo().frame(driver.findElement(patientFrame));
	}
	
	public void sirname(String tagname )
	{
		Select sirnam=new Select(driver.findElement(sirname));
		sirnam.selectByValue(tagname);
	}
	
	public void sendPatientFirstName(String FirstName) 
	{
		driver.findElement(patientFirstNameLocator ).sendKeys(FirstName);
	}
	
	public void sendPatientLastName(String LastName) 
	{
		driver.findElement(patientLastNameLocator).sendKeys(LastName);
	}
	
	
	public void dateOfBirth(String dob ) 
	{
		driver.findElement(patientdateOfBirthLocator).sendKeys(dob);
	}
	
	public void gender(String tagname )
	{
		Select sex =new Select(driver.findElement(patientgenderLocator));
		sex.selectByValue(tagname);
	}

	public void createNewPatient() {
		driver.findElement(createNewPatientLocator).click();
	}
	
	public void switchToOutOfFrame() {
		driver.switchTo().defaultContent();
	}

	
	public void switchIntoFrame() {
		driver.switchTo().frame(driver.findElement(switchIntoFrameLocator));
	}










}
