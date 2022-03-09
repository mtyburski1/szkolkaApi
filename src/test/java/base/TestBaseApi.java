package base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import models.User;
import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import providers.UserFactory;

import static io.restassured.RestAssured.baseURI;

public class TestBaseApi {
    protected User user;
    protected JSONObject request;

    @BeforeMethod
    public void setUp() {
        request = new JSONObject();
        user = UserFactory.getRandomUser();

        baseURI = "http://madryt.app.javagirl.pl";
        RestAssured.port = 22322;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
