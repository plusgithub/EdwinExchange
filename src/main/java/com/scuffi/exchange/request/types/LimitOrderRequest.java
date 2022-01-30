package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;
import com.scuffi.exchange.trades.status.TradeStatus;

public class LimitOrderRequest extends OrderRequest {

	private double limitPrice;
	private final TradeType type = TradeType.LIMIT;

	public LimitOrderRequest(String symbol, double quantity, Side side, double limitPrice) {
		super(symbol, quantity, side, TradeType.LIMIT);
		this.limitPrice = limitPrice;
	}

	public void setLimitPrice(double price) { this.limitPrice = price; }
	public double getLimitPrice() { return this.limitPrice; }

}
