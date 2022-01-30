package com.scuffi.exchange.response.types;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class ServerTimeResponse extends Response {

	public ServerTimeResponse(HttpResponse<String> response) {
		super(response);
	}

	public abstract double getTime();
}
