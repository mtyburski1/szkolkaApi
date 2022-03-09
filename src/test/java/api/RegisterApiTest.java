package api;

import base.TestBaseApi;
import io.restassured.http.ContentType;
import models.User;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import providers.UserFactory;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class RegisterApiTest extends TestBaseApi {
    @Test
    public void shouldRegisterByApi() {

        User user = UserFactory.getRandomUser();

        JSONObject request = new JSONObject();

        request.put("firstName", user.getFirstName());
        request.put("lastName", user.getLastName());
        request.put("password", user.getPassword());
        request.put("repeatedPassword", user.getPassword());
        request.put("email", user.getEmail());
        request.put("username", user.getLogin());

        given()
                .contentType(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("api/user/register")
                .then()
                .statusCode(200);
    }

    @Test
    public void shouldRegistrerWithThreeFields() {

        User user = UserFactory.getRandomUser();

        JSONObject request = new JSONObject();

        request.put("password", user.getPassword());
        request.put("repeatedPassword", user.getPassword());
        request.put("username", user.getLogin());

        given()
                .contentType(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("api/user/register")
                .then()
                .statusCode(200);
    }
}

