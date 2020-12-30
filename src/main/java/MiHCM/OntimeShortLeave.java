package MiHCM;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class OntimeShortLeave {

	 WebDriver driver;
 
	    
		By OntimeMenu = By.xpath("//*[@data-target='#menu-3']");
		By Leave=By.xpath("//*[@id='sub-menu-66']");
		By EnterShortLeave=By.xpath("//a[contains(text(),'Short Leave')]");

	  
	    
	    public OntimeShortLeave(WebDriver driver){

	        this.driver = driver;

	    }

	    //Direct to menu

	    public void DirecttoMenuOntimeLeaveEntry()
	    {
			driver.findElement(OntimeMenu).click();
			driver.findElement(Leave).click();
			driver.findElement(EnterShortLeave).click();

 	    }


	    //Enter Short Leave
 

	    public void EnterOntimeShortLeave()
	    {
	    	driver.findElement(By.id("SelectizeEmployeeCode-selectized")).sendKeys("MI0009");
			driver.findElement(By.id("lbl-LeaveYear")).sendKeys("2020");
			Select LeaveType = new Select (driver.findElement(By.id("LeaveTypeCode")));
			LeaveType.selectByIndex(1);
			
			Select LeaveReason = new Select (driver.findElement(By.id("LeaveReasonCode")));
			LeaveReason.selectByIndex(0);
			
			WebElement StartDate = driver.findElement(By.xpath("//*[@id=\"StartDate\"]"));
			//Fill date as mm/dd/yyyy as 10/26/2020
			StartDate.sendKeys("09262020");

			WebElement EndDate = driver.findElement(By.xpath("//*[@id=\"EndDate\"]"));
			//Fill date as mm/dd/yyyy as 10/26/2020
			EndDate.sendKeys("09262020");
			
			driver.findElement(By.id("Remarks")).sendKeys("TestNG");
			driver.findElement(By.id("btnSave")).click();
					
		//	Select LeaveTypeCode = new Select(driver.findElement(By.id("LeaveTypeCode")));
			//LeaveTypeCode.selectByVisibleText("Annual L");
		//	LeaveTypeCode.selectByIndex(2);
			
		

	    }

	    
	   
	}