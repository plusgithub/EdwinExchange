package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;

public class TakeOrderRequest extends OrderRequest {

	private double takePrice;

	public TakeOrderRequest(String symbol, double quantity, Side side, double takePrice) {
		super(symbol, quantity, side, TradeType.TAKE_PROFIT);
		this.takePrice = takePrice;
	}

	public void setTakePrice(double price) { this.takePrice = price; }
	public double getTakePrice() { return this.takePrice; }
}
