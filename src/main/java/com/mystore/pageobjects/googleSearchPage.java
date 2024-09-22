package com.mystore.pageobjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;
import com.mystore.utility.SeleniumSupportFunctions;

public class googleSearchPage {
	BaseClass bc=new BaseClass();
	Action action=new Action();
	SeleniumSupportFunctions sf=new SeleniumSupportFunctions();
	
	
	//RemoteWebDriver driver;
	//static ActionsUtility action=new ActionsUtility();
	
	
	
	
	private static final String inputTextBox = "//textarea[@name='q']";
	@FindBy(xpath = inputTextBox)
	private WebElement inputTextGSearch;
	
	private static final String googleSearchBtn = "(//input[@value='Google Search'])[2]";
	@FindBy(xpath = googleSearchBtn)
	private WebElement SearchBtn;
	
	private static final String framButton = "//button[text()='No thanks']";
	@FindBy(xpath = framButton)
	private WebElement framButtonClick;
	
	//private static final String idName = "//input[@id='name']";
	@FindBy(xpath = "//input[@id='name']")
	private WebElement idNameInput;
	
	private static final String id = "dropdown-class-example";
	@FindBy(id = id)
	private WebElement buttonHome;
	
	public googleSearchPage() {
		PageFactory.initElements(bc.getDriver(), this);
	}
	
	public void getConfigData() throws InterruptedException
	{
		sf.waitForPageToLoad();
		bc.launchApp(bc.loadConfig("browser"));
		bc.getDriver().get(bc.loadConfig("url"));
		System.out.println(bc.loadConfig("url"));
	}

      public void setInput(String text) throws InterruptedException {
    	sf.waitForPageToLoad();
    	action.switchToFrameByIndex(bc.getDriver(), 0);
    	sf.waitForPageToLoad();
    	action.click(bc.getDriver(), framButtonClick);
    	action.switchToDefaultFrame(bc.getDriver());
		action.type(inputTextGSearch, text);
		//idNameInput.sendKeys("Test");
		
	}
//
	public void clickonBtn() throws Throwable {
		
		action.click(bc.getDriver(), SearchBtn);
		sf.waitForPageToLoad();
		inputTextGSearch.clear();
		
		
	}
}
	
	


