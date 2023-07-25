package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle;

    @FindBy(id ="location")
    WebElement location;

    @FindBy(xpath = "//select[@id='distance']")
    WebElement  distanceDropDown;

    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;


    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @FindBy(id = "gdpr-consent-notice")
    WebElement getInToFrame;

    @FindBy(xpath = "//span[text()='Accept All']")
    WebElement acceptAll;

    @FindBy(css = ".search-header__title")
    WebElement Result;



    public void acceptIframeAlert(){
        driver.switchTo().frame(getInToFrame);
        clickOnElement(acceptAll);
        driver.switchTo().defaultContent();
    }
    public void enterJobTitle(String JobRole){
        sendTextToElement(jobTitle,JobRole);
    }

    public void enterLocation(String enterLocation){
        sendTextToElement(location,enterLocation);
    }

    public void selectDistance(String enterDistance){
        selectByValueFromDropDown(distanceDropDown,enterDistance);
    }

    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void  enterMinSalary(String minSalary){
    sendTextToElement(salaryMin,minSalary);
}
    public void  enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
    }
    public void selectSalaryType(String sType){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }
    public void selectJobType(String jobType){
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }
    public void clickOnFindJobs(){
        clickOnElement(findJobsBtn);
    }
    public String getResult(){
        return getTextFromElement(Result);
    }

}