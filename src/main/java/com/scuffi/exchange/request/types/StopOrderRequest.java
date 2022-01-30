package com.scuffi.exchange.request.types;

import com.scuffi.exchange.request.OrderRequest;
import com.scuffi.exchange.request.Side;
import com.scuffi.exchange.trades.TradeType;

public class StopOrderRequest extends OrderRequest {

	private double stopPrice;

	public StopOrderRequest(String symbol, double quantity, Side side, double stopPrice) {
		super(symbol, quantity, side, TradeType.STOP_LOSS);
		this.stopPrice = stopPrice;
	}

	public void setStopPrice(double price) {this.stopPrice = price; }
	public double getStopPrice() { return this.stopPrice; }
}
