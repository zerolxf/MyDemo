package com.workstation;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class testJsonToObject {

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		String jsonString = "{    \"message\":\"Hello World\"}";
		ObjectC objectC = (new ObjectMapper()).readValue(jsonString, ObjectC.class);
		System.out.println(objectC.getMessage());
//		{
//			"List": [
//			{"message":"hello A"},
//			{"Message":"hello B"}
//			]
//			}
		String jsonListString = "{\r\n" + 
				"\"List\": [\r\n" + 
				"{\"message\":\"hello A\"},\r\n" + 
				"{\"Message\":\"hello B\"}\r\n" + 
				"]\r\n" + 
				"}";
		ObjectD objectD = (new ObjectMapper()).readValue(jsonListString, ObjectD.class);
		List<ObjectC> list = objectD.getList();
		for(int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i).getMessage());
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map = (new ObjectMapper()).readValue(jsonString, new TypeReference<Map<String, String>>(){});
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}
	
	

}
