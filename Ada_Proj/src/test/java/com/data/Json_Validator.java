package com.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Json_Validator {
	
	public static void main(String[] args) throws IOException, ParseException {
		
		File f = new File("C:\\Users\\Vijayakumar\\eclipse-workspace\\Ada_Proj\\src\\test\\java\\com\\payload\\Payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(reader);
		
		JSONObject jsononj = (JSONObject) parse;
		
		Object object = jsononj.get("Team");
		
		String value = object.toString();
		
		System.out.println(value);
		
	}

}
