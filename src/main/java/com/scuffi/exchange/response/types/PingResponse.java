package com.scuffi.exchange.response.types;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class PingResponse extends Response {

	public PingResponse(HttpResponse<String> response) {
		super(response);
	}

	public abstract boolean isSuccess();
}
