package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;

public abstract class AccountBalanceResponse extends Response {

	private double balance;

	public AccountBalanceResponse(HttpResponse<String> response) {
		super(response);
	}

	public double getBalance() { return balance; }
}
