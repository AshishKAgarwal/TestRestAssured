package RestAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest5 {
	
	public Object obj;
	
	@Test
	public void restAssuredget()
	{
		System.out.println("Hello");
		
		Response response = RestAssured
			.get("https://restful-booker.herokuapp.com/booking/71");
			
			String firstNameVal = response.jsonPath().get("firstname").toString();
			System.out.println(firstNameVal);
			
			String lastNameVal = response.jsonPath().getString("lastname");
			System.out.println(lastNameVal);
			
			int totalPriceVal = response.jsonPath().getInt("totalprice");
			System.out.println(totalPriceVal);
			
			boolean depositPaidVal = response.jsonPath().getBoolean("depositpaid");
			System.out.println(depositPaidVal);
			
			String checkinDateVal = response.jsonPath().get("bookingdates.checkin").toString();
			System.out.println(checkinDateVal);
			
			String checkoutDateVal = response.jsonPath().get("bookingdates.checkout").toString();
			System.out.println(checkoutDateVal);
			
			String additionalNeedsVal = response.jsonPath().getString("additionalneeds");
			System.out.println(additionalNeedsVal);
			
			obj = response.jsonPath().get("depositpaid");
			
			System.out.println((obj instanceof String));
			System.out.println((obj instanceof Integer));
			System.out.println((obj instanceof Boolean));
			
	}
	
	
}

