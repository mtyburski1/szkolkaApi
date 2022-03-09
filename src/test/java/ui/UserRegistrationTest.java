package ui;

import base.Pages;
import models.User;
import org.testng.annotations.Test;
import providers.UserFactory;

public class UserRegistrationTest extends Pages {

    @Test
    public void shouldRegisterCorrectly(){
        User user = UserFactory.getRandomUser();

        mainMenuPage
                .goToRegisterClick()
                .fillLogin(user.getLogin())
                .fillPassword(user.getPassword())
                .fillRepeatedPassword(user.getPassword())
                .fillEmail(user.getEmail())
                .fillFirstName(user.getFirstName())
                .fillLastName(user.getLastName())
                .registerClick();

    }
}
