package RestAssured;

import io.restassured.RestAssured;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.get("https://restful-booker.herokuapp.com/booking/1");

	}

}
