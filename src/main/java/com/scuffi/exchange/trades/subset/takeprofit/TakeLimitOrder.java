package com.scuffi.exchange.trades.subset.takeprofit;

import com.scuffi.exchange.trades.EdwinOrder;

import java.util.Map;

public class TakeLimitOrder extends EdwinOrder {

	private Double takePrice;
	private Double limitPrice;

	public TakeLimitOrder(Map<String, Object> parameters) {
		super(parameters);


		this.takePrice = (Double) parameters.getOrDefault("take_price", 0D);
		this.limitPrice = (Double) parameters.getOrDefault("limit_price", 0D);
	}

	public double getTakePrice() { return this.takePrice; }
	public double getLimitPrice() { return this.limitPrice; }
}
