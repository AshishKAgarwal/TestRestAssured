package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequestUsingIndex1 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking");
		
		response.prettyPrint();
		
		int bookingId = response.jsonPath().getInt("[0].bookingid");
		
		System.out.println("Booking Id is :" + bookingId);
		
		
		
	}
	
}

