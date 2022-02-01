package com.scuffi.exchange.response;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.http.HttpResponse;

public class Response {

	private final int statusCode;
	private final String body;
	private final JsonNode json;
//	public final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

	public Response(HttpResponse<String> response) {
		JsonNode json1;
		this.statusCode = response.statusCode();
		this.body = response.body();
//		this.json = gson.fromJson(this.body, JsonObject.class);

		ObjectMapper mapper = new ObjectMapper();

		try {
			json1 = mapper.readTree(this.body);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			json1 = null;
		}

		this.json = json1;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getBody() {
		return body;
	}

	public JsonNode getJson() {
		return this.json;
	}
}
