package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest2 {
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		Response response = RestAssured.get("https://restful-booker.herokuapp.com/booking/71");
		int statuscode = response.getStatusCode();
		System.out.println("Status Code is : " + statuscode);
		
		String statusLine = response.getStatusLine();
		System.out.println("Status Line is : " + statusLine);
		
		System.out.println("Body:");
		System.out.println();
		response.prettyPrint();
		Assert.assertEquals(statuscode, 200);
		
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}
	
}

