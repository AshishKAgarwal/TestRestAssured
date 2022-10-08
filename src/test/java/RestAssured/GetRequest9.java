package RestAssured;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest9 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		RestAssured
			.get("https://restful-booker.herokuapp.com/booking/71")
			.then()
			.statusCode(Matchers.in(Arrays.asList(200,201)))
			.statusLine("HTTP/1.1 200 OK")
			.body("firstname", Matchers.equalTo("Fabio"))
			.body("lastname", Matchers.equalTo("Sevilla"))
			.body("bookingdates.checkin",Matchers.equalTo("2018-01-01"));
		
	}
	
}

