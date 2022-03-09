package base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.testng.annotations.BeforeMethod;

import static io.restassured.RestAssured.baseURI;

public class TestBaseApi {
    @BeforeMethod
    public void setUp() {
        baseURI = "http://madryt.app.javagirl.pl";
        RestAssured.port = 22322;
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}
