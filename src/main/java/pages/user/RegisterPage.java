package pages.user;

import models.User;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement loginInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "repeatedPassword")
    private WebElement repeatedPasswordInput;

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "firstName")
    private WebElement firstNameInput;

    @FindBy(id = "lastName")
    private WebElement lastNameInput;

    @FindBy(css = ".btn")
    private WebElement registerBtn;

    public RegisterPage registerAUser(User user) {
        fillLogin(user.getLogin());
        fillPassword(user.getPassword());
        fillRepeatedPassword(user.getPassword());
        fillEmail(user.getEmail());
        fillFirstName(user.getFirstName());
        fillLastName(user.getLastName());
        registerClick();
        return this;
    }

    public RegisterPage fillLogin(String login) {
        sendKeys(loginInput, login);
        return this;
    }

    public RegisterPage fillPassword(String password) {
        sendKeys(passwordInput, password);
        return this;
    }

    public RegisterPage fillRepeatedPassword(String repeatedPassword) {
        sendKeys(repeatedPasswordInput, repeatedPassword);
        return this;
    }

    public RegisterPage fillEmail(String email) {
        sendKeys(emailInput, email);
        return this;
    }

    public RegisterPage fillFirstName(String firstName) {
        sendKeys(firstNameInput, firstName);
        return this;
    }

    public RegisterPage fillLastName(String lastName) {
        sendKeys(lastNameInput, lastName);
        return this;
    }

    public RegisterPage registerClick() {
        click(registerBtn);
        return this;
    }
}
