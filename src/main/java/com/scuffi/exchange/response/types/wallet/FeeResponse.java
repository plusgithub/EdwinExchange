package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class FeeResponse extends Response {

	private double sellFee;
	private double buyFee;

	public FeeResponse(HttpResponse<String> response) {
		super(response);
	}

	public double getSellFee() { return sellFee; }
	public double getBuyFee() { return buyFee; }

}
