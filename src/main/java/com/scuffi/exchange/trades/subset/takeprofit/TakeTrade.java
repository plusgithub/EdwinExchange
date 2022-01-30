package com.scuffi.exchange.trades.subset.takeprofit;

import com.scuffi.exchange.trades.EdwinTrade;

import java.util.Map;

public class TakeTrade extends EdwinTrade {

	private Double takePrice;

	public TakeTrade(Map<String, Object> parameters) {
		super(parameters);

		this.takePrice = (Double) parameters.getOrDefault("take_price", 0D);
	}

	public double getTakePrice() { return this.takePrice; }
}
