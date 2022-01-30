package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class CoinBalanceResponse extends Response {

	private double balance;
	private String coin;

	public CoinBalanceResponse(HttpResponse<String> response) {
		super(response);
	}

	public double getBalance() { return balance; }
	public String getCoin() { return coin; }
}
