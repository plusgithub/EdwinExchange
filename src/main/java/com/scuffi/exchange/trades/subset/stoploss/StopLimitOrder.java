package com.scuffi.exchange.trades.subset.stoploss;

import com.scuffi.exchange.trades.EdwinOrder;

import java.util.Map;

public class StopLimitOrder extends EdwinOrder {

	private double stopPrice;
	private double limitPrice;

	public StopLimitOrder(Map<String, Object> parameters) {
		super(parameters);

		this.stopPrice = (Double) parameters.getOrDefault("stop_price", 0D);
		this.limitPrice = (Double) parameters.getOrDefault("limit_price", 0D);
	}

	public double getStopPrice() { return this.stopPrice; }
	public double getLimitPrice() { return this.limitPrice; }
}
