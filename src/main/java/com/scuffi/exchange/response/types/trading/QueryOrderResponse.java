package com.scuffi.exchange.response.types.trading;

import com.scuffi.exchange.response.Response;
import com.scuffi.exchange.trades.EdwinOrder;

import java.net.http.HttpResponse;

public abstract class QueryOrderResponse extends Response {

	public EdwinOrder order;

	public QueryOrderResponse(HttpResponse<String> response) {
		super(response);
	}

	public EdwinOrder getOrder() { return order; }
}
