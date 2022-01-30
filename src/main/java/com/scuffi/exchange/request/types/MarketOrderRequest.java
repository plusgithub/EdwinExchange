package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;

/**
 * Class has no functionality, just to separate the parent OrderRequest to make it easier to call
 */
public class MarketOrderRequest extends OrderRequest {
	public MarketOrderRequest(String symbol, double quantity, Side side) {
		super(symbol, quantity, side, TradeType.MARKET);
	}
}
