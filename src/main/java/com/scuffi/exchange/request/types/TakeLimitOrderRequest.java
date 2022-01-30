package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;

public class TakeLimitOrderRequest extends OrderRequest {

	private double takePrice;
	private double limitPrice;

	public TakeLimitOrderRequest(String symbol, double quantity, Side side, double takePrice, double limitPrice) {
		super(symbol, quantity, side, TradeType.TAKE_PROFIT_LIMIT);
		this.takePrice = takePrice;
		this.limitPrice = limitPrice;
	}

	// Setters
	public void setLimitPrice(double price) { this.limitPrice = price; }
	public void setTakePrice(double price) { this.takePrice = price; }
	// Getters
	public double getLimitPrice() { return this.limitPrice; }
	public double getTakePrice() { return this.takePrice; }
}
