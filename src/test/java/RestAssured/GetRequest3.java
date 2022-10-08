package RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest3 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		RestAssured
			.get("https://restful-booker.herokuapp.com/booking/71")
			.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.body("firstname", Matchers.equalTo("Fabio"))
			.body("lastname", Matchers.equalTo("Sevilla"))
			.body("bookingdates.checkin",Matchers.equalTo("2018-01-01"));
		
	}
	
}

