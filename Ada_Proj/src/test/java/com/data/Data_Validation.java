package com.data;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	
	@Test
	private void validate_Data() {

		RestAssured.baseURI = "https://reqres.in/";  //baseuri
		
		RequestSpecification request = RestAssured.given();  //request
		
		Response response = request.get("api/users/2");  //response
		
		String asString = response.asString();
		
		System.out.println(asString);
		
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Data validation successful");
		
	}
	
	
	

}
