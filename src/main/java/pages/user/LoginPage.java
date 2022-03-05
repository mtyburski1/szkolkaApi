package pages.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.base.BasePage;
import pages.main.MainMenuPage;

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

    public LoginPage fillLoginAndClick(String login, String password) {
        driver.navigate().refresh();
        loginInput.sendKeys(login);
        loginInput.sendKeys(password);
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
