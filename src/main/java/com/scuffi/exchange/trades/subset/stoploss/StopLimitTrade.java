package com.scuffi.exchange.trades.subset.stoploss;

import com.scuffi.exchange.trades.EdwinTrade;

import java.util.Map;

public class StopLimitTrade extends EdwinTrade {

	private double stopPrice;
	private double limitPrice;

	public StopLimitTrade(Map<String, Object> parameters) {
		super(parameters);

		this.stopPrice = (Double) parameters.getOrDefault("stop_price", 0D);
		this.limitPrice = (Double) parameters.getOrDefault("limit_price", 0D);
	}

	public double getStopPrice() { return this.stopPrice; }
	public double getLimitPrice() { return this.limitPrice; }
}
