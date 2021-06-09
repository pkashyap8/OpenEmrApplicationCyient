package com.cyient.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientMainPage 
{
	private By patFrameLocator=By.xpath("//iframe[@name='pat']");
	private By medicalRecordDashLocator=By.xpath("//h2[contains(text(),'Medical Record')]");
	private WebDriver driver;

	public PatientMainPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void switchTOPatFrame() {
		driver.switchTo().frame(driver.findElement(patFrameLocator));
	}
	
	public String medicalRecordDash() {
		
		String actualValue=driver.findElement(medicalRecordDashLocator).getText();
		System.out.println(actualValue);
		return actualValue;
	}
	
	
}
