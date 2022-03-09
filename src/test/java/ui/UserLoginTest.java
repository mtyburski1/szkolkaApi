package ui;

import base.Pages;
import models.User;
import org.testng.annotations.Test;
import providers.UserFactory;

public class UserLoginTest extends Pages {

    @Test
    public void ShouldLoginCorrectly() {
        User user = UserFactory.getAlreadyRegisteredUser();
        mainMenuPage.goToLoginClick();

        loginPage
                .fillLoginAndClick(user.getLogin(), user.getPassword());
    }
}
