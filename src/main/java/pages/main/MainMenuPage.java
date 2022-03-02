package pages.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import pages.user.RegisterPage;

public class MainMenuPage extends BasePage {
    public MainMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/ul/li[1]")
    private WebElement mainPageBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[2]")
    private WebElement eventsBtn;

    @FindBy(xpath = ".glyphicon")
    private WebElement cartBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[4]")
    private WebElement registerBtn;

    @FindBy(xpath = "/html/body/div[1]/ul/li[3]")
    private WebElement loginBtn;

    public MainMenuPage goToMainPageClick(){
        click(mainPageBtn);
        return this;
    }

    public MainMenuPage goToEventsClick(){
        click(eventsBtn);
        return this;
    }

    public MainMenuPage goToCartClick(){
        click(cartBtn);
        return this;
    }

    public RegisterPage goToRegisterClick(){
        click(registerBtn);
        return new RegisterPage(driver);
    }

    public MainMenuPage goToLoginClick(){
        click(loginBtn);
        return this;
    }
}
