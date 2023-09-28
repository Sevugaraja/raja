package com.data;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Validation_Data {
	
	@Test
	public void validate_Data() {
		
		RestAssured.baseURI ="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users");
		
		String response_body = response.asString();
		
		System.out.println(response_body);
		
		int statusCode = response.getStatusCode();
		
		System.out.println(statusCode);
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Data validated");

	}
	
	

}
