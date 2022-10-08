package RestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetRequest8 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		Response response = RestAssured
			.get("https://restful-booker.herokuapp.com/booking/71");
		
		//Get All headers
		Headers headers = response.getHeaders();
		
		for(Header h: headers) {
			
			System.out.println(h.getName() + " = " + h.getValue());
		}
		
		//Get a value of a particular header by passing header name
		System.out.println();
		System.out.println("Get a value of a particular header by passing header name");
		System.out.println();
		
		String connectionHeader = response.getHeader("Connection");
		System.out.println(connectionHeader);
		
		
	}
	
}

