package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;

public class StopLimitOrderRequest extends OrderRequest {

	private double stopPrice;
	private double limitPrice;

	public StopLimitOrderRequest(String symbol, double quantity, Side side, double stopPrice, double limitPrice) {
		super(symbol, quantity, side, TradeType.STOP_LOSS_LIMIT);
		this.stopPrice = stopPrice;
		this.limitPrice = limitPrice;
	}

	// Getters
	public double getStopPrice() { return this.stopPrice; }
	public double getLimitPrice() { return this.limitPrice; }

	// Setters
	public void setStopPrice(double price) { this.stopPrice = price; }
	public void setLimitPrice(double price) { this.limitPrice = price; }
}
