package com.scuffi.exchange.response.types.trading;

import com.scuffi.exchange.response.Response;
import com.scuffi.exchange.trades.EdwinTrade;

import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * To use this class we're going to want to use the 'trades' variable as the list for our trades, this means
 * we're going to add trades based on the response we receive, the response should be formatted to turn the json content into an EdwinTrade object,
 * which can then be added to the trades list.
 *
 * Extend this class and change the constructor to validate all of the response trades, then add those trades into our list so we can use them later.
 */
public abstract class QueryTradesResponse extends Response {

	public List<EdwinTrade> trades;

	public QueryTradesResponse(HttpResponse<String> response) {
		super(response);
	}

	public List<EdwinTrade> getTrades() { return trades; }
	public void addTrades(EdwinTrade... trades) { this.trades.addAll(Arrays.asList(trades)); }
	public void removeTrade(EdwinTrade trade) { this.trades.remove(trade); }
}
