package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class DepositAddressResponse extends Response {

	public String address;
	public String coin;

	public DepositAddressResponse(HttpResponse<String> response) {
		super(response);
	}

	public String getAddress() { return address; }
	public String getCoin() { return coin; }
}
