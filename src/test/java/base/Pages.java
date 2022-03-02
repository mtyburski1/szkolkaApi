package base;

import org.testng.annotations.BeforeMethod;
import pages.cart.CartPage;
import pages.events.EventsPage;
import pages.main.MainMenuPage;
import pages.user.LoginPage;
import pages.user.RegisterPage;

public class Pages extends TestBase {
    public MainMenuPage mainMenuPage;
    public LoginPage loginPage;
    public RegisterPage registerPage;
    public EventsPage eventsPage;
    public CartPage cartPage;

    @BeforeMethod
    public void pagesSetup() {
        cartPage = new CartPage(driver);
        eventsPage = new EventsPage(driver);
        mainMenuPage = new MainMenuPage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
    }
}
