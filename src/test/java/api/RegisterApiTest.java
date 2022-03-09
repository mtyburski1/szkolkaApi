package api;

import base.TestBaseApi;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class RegisterApiTest extends TestBaseApi {
    @Test
    public void shouldRegisterByApi() {

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

