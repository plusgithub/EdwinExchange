package com.scuffi.exchange.trades.subset.stoploss;

import com.scuffi.exchange.trades.EdwinTrade;

import java.util.Map;

public class StopTrade extends EdwinTrade {

	private final Double stopPrice;

	public StopTrade(Map<String, Object> parameters) {
		super(parameters);

		this.stopPrice = (Double) parameters.getOrDefault("stop_price", 0D);
	}

	public double getStopPrice() { return this.stopPrice; }
}
