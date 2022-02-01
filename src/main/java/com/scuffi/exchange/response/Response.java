package com.scuffi.exchange.response;

//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonParser;
import org.json.JSONObject;

import java.net.http.HttpResponse;

public class Response {

	private final int statusCode;
	private final String body;
	private final JSONObject json;
//	public final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

	public Response(HttpResponse<String> response) {
		this.statusCode = response.statusCode();
		this.body = response.body();
//		this.json = gson.fromJson(this.body, JsonObject.class);
		this.json = new JSONObject(this.body);
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getBody() {
		return body;
	}

	public JSONObject getJson() {
		return this.json;
	}
}
