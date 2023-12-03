package pages;

import org.checkerframework.checker.guieffect.qual.UI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    private final By mobile = By.xpath("//*[@id=\"input_identifierValue\"]");
    private final By firstbtn = By.cssSelector("[type=\"submit\"]");
    private final By secondbtn = By.xpath("(//button[@type='button' and contains(@class,'mdc-button--touch')])[1]");
    private final By thirdbtn = By.xpath("(//button[@type='button' and contains(@class,'mdc-button--touch')])[2]");
    private final By fourthbtn = By.id("confirmBtn");
    private final By passwordLocator = By.xpath("//*[@id=\"card_password\"]/div[3]/label");
    private final By confirmPasswordLocator = By.xpath("//*[@id=\"card_password\"]/div[4]/label");
    private final By fName = By.id("input_first_name");
    private final By lName = By.id("input_last_name");
    private final By Email = By.cssSelector("[name= \"email\"]");
    private final By Gender = By.xpath("//*[@id=\"card_profile_gender\"]/div/div[1]");
    private final By selectGenderLocator = By.xpath("//*[@id=\"gender\"]/div[2]/ul/li[2]");
    private final By datebirth = By.id("input_birth_date");
    private final By markcheckbox = By.cssSelector("[type= \"checkbox\"]");
    private WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public RegisterPage enterMobileNumber(String MobileNum){
        Utilities.sendData(driver, mobile, MobileNum);
        return this;
    }
    public RegisterPage clickfirstbtn(){
        Utilities.clicking(driver, firstbtn);
        return this;
    }
    public RegisterPage enterdatebirth(String date){
        Utilities.sendData(driver, datebirth, date);
        return this;
    }
    public RegisterPage clicksecondbtn(){
        Utilities.clicking(driver, secondbtn);
        return this;
    }
    public RegisterPage clickthirdbtn(){
        Utilities.clicking(driver, thirdbtn);
        return this;
    }
    public RegisterPage clickfourthbtn(){
        Utilities.clicking(driver, fourthbtn);
        return this;
    }
    public RegisterPage clickCheckbox(){
        Utilities.clicking(driver, markcheckbox);
        return this;
    }
    public RegisterPage enterPassword(String password){
        Utilities.sendData(driver, passwordLocator, password);
        return this;
    }
    public RegisterPage enterConfirmPassword(String confirmPassword){
        Utilities.sendData(driver, confirmPasswordLocator, confirmPassword);
        return this;
    }
    public RegisterPage enterFirstName(String firstname){
        Utilities.sendData(driver, fName, firstname);
        return this;
    }
    public RegisterPage enterLastName(String lastname){
        Utilities.sendData(driver, lName, lastname);
        return this;
    }
    public RegisterPage enterEmail(String email){
        Utilities.sendData(driver, Email, email);
        return this;
    }
    public RegisterPage selectGender(){
        Utilities.clicking(driver, Gender);
        Utilities.clicking(driver, selectGenderLocator);
        return this;
    }
}
