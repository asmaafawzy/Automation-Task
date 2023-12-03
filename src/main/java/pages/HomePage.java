package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private final By account = By.xpath("//*[@id=\"jm\"]/header/section/div[2]/div[1]/label");
    private final By signInbtn = By.xpath("//*[@id=\"dpdw-login-box\"]/div/div/a");
    private final By verifyMsg = By.xpath("//*[@id=\"identification-form\"]/div[1]/div[1]/h2");

    public HomePage closePopUp() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
        return this;
    }
    public RegisterPage registerAccount() {
        Utilities.clicking(driver, account);
        Utilities.clicking(driver, signInbtn);
        return new RegisterPage(driver);
    }

}
