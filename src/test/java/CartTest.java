import base.Pages;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import providers.UserFactory;

public class CartTest extends Pages {
    @Test
    public void shouldCheckCart() {
        User user = UserFactory.getRandomUser();

        mainMenuPage.goToRegisterClick();
        registerPage.registerAUser(user);
        loginPage.fillLoginAndClick(user.getLogin(), user.getPassword());
        mainMenuPage.goToEventsClick()
                .pickEventClick(3);

        String expectedString = "siema";
        String actualString = eventsPage.getEventTitleText();

        Assert.assertEquals(actualString, expectedString);

        eventsPage.setTicketQuantity(0, 3)
                .setTicketQuantity(2, 2);

        String firstTicket = eventsPage.getTicketNameText(0);
        String secondTicket = eventsPage.getTicketNameText(2);

        mainMenuPage.goToCartClick();

        Assert.assertEquals(firstTicket, "sadas");
        Assert.assertEquals(secondTicket, "sadxzd");
    }
}
