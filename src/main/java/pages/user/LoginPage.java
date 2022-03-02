package pages.user;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = ".btn")
    private WebElement loginBtn;

    public LoginPage fillLoginAndClick(String login, String password){
        sendKeys(loginInput, login);
        sendKeys(passwordInput, password);
        click(loginBtn);
        return this;
    }

    public LoginPage loginAsAdminAndClick(){
        sendKeys(loginInput, "admin");
        sendKeys(passwordInput, "admin");
        click(loginBtn);
        return this;
    }
}
