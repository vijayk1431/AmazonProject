package com.amazon.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_SignUp_app 
{   
    @FindBy(xpath="(//input[@type=radio])[1]") private WebElement sex;
    @FindBy(xpath="(//input[@type=text])[2]") private WebElement firstname;
    @FindBy(xpath="(//input[@type=text])[3]") private WebElement lastname;
    @FindBy(xpath="//select[@name=DateOfBirthDay]") private WebElement Day;
    @FindBy(xpath="//select[@name=DateOfBirthMonth]") private WebElement Month;
    @FindBy(xpath="//select[@name=DateOfBirthYear]") private WebElement Yr;
    @FindBy(xpath="//input[@type=email and @id=Email]") private WebElement Email;
    @FindBy(xpath="//input[@type=text and @id=Company]") private WebElement CompanyName;
    @FindBy(xpath="//input[@type=checkbox]") private WebElement Newssettler;
    @FindBy(xpath="//input[@type=password and @name=Password]") private WebElement Password;
    @FindBy(xpath="//input[@type=password and @name=ConfirmPassword]") private WebElement ConfPassword;
    
       
    public pom_SignUp_app(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    public void gender()
    {
    	sex.click();
    }
    public void firstname(String fname )
    {
    	firstname.sendKeys(fname);
    }
    public void lastname(String lname)
    {
    	lastname.sendKeys(lname);
    }
    public void day(String day)
    {
    	Day.sendKeys(day);
    }
    public void month(String month)
    {
    	Month.sendKeys(month);
    }
    public void year(String Year)
    {
        Yr.sendKeys(Year);
    }
    public void email(String email)
    {
    	Email.sendKeys(email);
    }
    public void cname(String co_name)
    {
    	CompanyName.sendKeys(co_name);
    }
    public void newssetler()
    {
    	Newssettler.click();
    }
    public void password(String pass)
    {
    	Password.sendKeys(pass);
    }
    public void confpass(String cpass)
    {
    	ConfPassword.sendKeys(cpass);
    }

}
