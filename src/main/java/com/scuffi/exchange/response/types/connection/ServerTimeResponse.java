package com.scuffi.exchange.response.types.connection;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class ServerTimeResponse extends Response {

	private double time;

	public ServerTimeResponse(HttpResponse<String> response) {
		super(response);
	}

	public double getTime() {
		return time;
	}
}
