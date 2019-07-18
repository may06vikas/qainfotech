package TestNG;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import org.hamcrest.Matchers.*;


public class Rest {
	@Test
	public void GetMethod() {
		 String res = given().when().get("https://postman-echo.com/get?test=123").body().prettyPrint();
		 System.out.println(res);

	}

}
