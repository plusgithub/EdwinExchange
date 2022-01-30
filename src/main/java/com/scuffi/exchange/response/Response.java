package com.scuffi.exchange.response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.source.tree.ReturnTree;

import java.net.http.HttpResponse;

public class Response {

	private final int statusCode;
	private final String body;
	private final JsonObject json;
	public final Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

	public Response(HttpResponse<String> response) {
		this.statusCode = response.statusCode();
		this.body = response.body();
		this.json = gson.fromJson(this.body, JsonObject.class);
	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getBody() {
		return body;
	}

	public JsonObject getJson() {
		return this.json;
	}
}
