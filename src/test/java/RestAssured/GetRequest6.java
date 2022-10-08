package RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetRequest6 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		String firstName = RestAssured
			.get("https://restful-booker.herokuapp.com/booking/71")
			.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.body("firstname", Matchers.equalTo("Fabio"))
			.body("lastname", Matchers.equalTo("Sevilla"))
			.body("bookingdates.checkin",Matchers.equalTo("2018-01-01"))
			.extract()
			.jsonPath()
			.getString("firstname");
		
		System.out.println(firstName);
		
	}
	
}

