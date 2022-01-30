package com.scuffi.exchange.response.types.connection;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class PingResponse extends Response {

	private boolean success;

	public PingResponse(HttpResponse<String> response) {
		super(response);
	}

	public boolean isSuccess() {
		return success;
	}
}
