package com.scuffi.exchange.response.types.wallet;

import com.scuffi.exchange.response.Response;

import java.net.http.HttpResponse;
import java.util.Map;

public abstract class BalancesResponse extends Response {

	private Map<String, Double> balances;

	public BalancesResponse(HttpResponse<String> response) {
		super(response);
	}

	public Map<String, Double> getBalanceMap() { return balances; }
	public double getBalance(String coin) { return balances.getOrDefault(coin, 0D); }
}
