package com.scuffi.exchange.trades.subset.stoploss;

import com.scuffi.exchange.trades.EdwinOrder;

import java.util.Map;

public class StopOrder extends EdwinOrder {

	private Double stopPrice;

	public StopOrder(Map<String, Object> parameters) {
		super(parameters);

		this.stopPrice = (Double) parameters.getOrDefault("stop_price", 0D);
	}

	public double getStopPrice() { return this.stopPrice; }
}
