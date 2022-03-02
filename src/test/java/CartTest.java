import base.Pages;
import models.User;
import org.testng.annotations.Test;
import providers.UserFactory;

public class CartTest extends Pages {
    @Test
    public void shouldCheckCart() throws InterruptedException {
        User user = UserFactory.getRandomUser();

        mainMenuPage.goToRegisterClick();

        registerPage.registerAUser(user);

        mainMenuPage.goToEventsClick();
        Thread.sleep(1000); //nie wczytuja sie elementy jeszcze
        loginPage.fillLoginAndClick(user.getLogin(), user.getPassword());

    }
}
