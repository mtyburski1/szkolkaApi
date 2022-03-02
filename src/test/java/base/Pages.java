package base;

import org.testng.annotations.BeforeMethod;
import pages.main.MainMenuPage;
import pages.user.LoginPage;
import pages.user.RegisterPage;

public class Pages extends TestBase{
    public MainMenuPage mainMenuPage;
    public LoginPage loginPage;
    public RegisterPage registerPage;

    @BeforeMethod
    public void pagesSetup(){
        mainMenuPage =new MainMenuPage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
    }
}
