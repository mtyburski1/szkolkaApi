package providers;

import com.github.javafaker.Faker;
import models.User;

public class UserFactory {
    public static User getRandomUser() {
        Faker faker = new Faker();

        return new User.Builder()
                .login(faker.name().username())
                .password(faker.internet().password())
                .email(faker.internet().emailAddress())
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();
    }

    public static User getAlreadyRegisteredUser() {
        return new User.Builder()
                .login("siema")
                .password("siema")
                .build();
    }
}