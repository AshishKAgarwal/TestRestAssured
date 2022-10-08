package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest1 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/71");
		String body = response.asString();
		System.out.println(body);
		response.prettyPrint();
		
	}
	
}

