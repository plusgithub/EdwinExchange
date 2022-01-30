package com.scuffi.exchange.trades.subset.takeprofit;

import com.scuffi.exchange.trades.EdwinTrade;

import java.util.Map;

public class TakeLimitTrade extends EdwinTrade {

	private Double takePrice;
	private Double limitPrice;

	public TakeLimitTrade(Map<String, Object> parameters) {
		super(parameters);

		this.takePrice = (Double) parameters.getOrDefault("take_price", 0D);
		this.limitPrice = (Double) parameters.getOrDefault("limit_price", 0D);
	}

	public double getTakePrice() { return this.takePrice; }
	public double getLimitPrice() { return this.limitPrice; }
}
