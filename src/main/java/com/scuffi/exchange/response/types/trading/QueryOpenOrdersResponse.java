package com.scuffi.exchange.response.types.trading;

import com.scuffi.exchange.response.Response;
import com.scuffi.exchange.trades.EdwinOrder;
import com.scuffi.exchange.trades.EdwinTrade;

import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;

public abstract class QueryOpenOrdersResponse extends Response {

	public List<EdwinOrder> orders;

	public QueryOpenOrdersResponse(HttpResponse<String> response) {
		super(response);
	}

	public List<EdwinOrder> getOrder() { return orders; }
	public void addOrders(EdwinOrder... orders) { this.orders.addAll(Arrays.asList(orders)); }
	public void removeOrder(EdwinOrder order) { this.orders.remove(order); }
}
